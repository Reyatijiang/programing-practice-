import socket
import tqdm
import os
from datetime import datetime
import pickle

buffer_size = 4096
Separator = "<SEPARATOR>"
# get host address
host = socket.gethostname()
# specify port
port = 5001
# instantiate a new socket
client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client_socket.bind((host, port))
client_socket.listen(5)
print(f"Listening as  {host}:{port}")

conn, address = client_socket.accept()
print(f"[+] {address} is connected")

def convert_date(timestamp):
    d = datetime.utcfromtimestamp(timestamp)
    formated_date = d.strftime('%d %b %Y')
    return formated_date

# receive file
received = conn.recv(buffer_size).decode()
if received == '3':
    received = conn.recv(buffer_size).decode()
    filename = os.path.basename(received)
    if os.path.isfile(filename):
        filesize = os.path.getsize(filename)
        conn.send(f"{filename}{Separator}{filesize}".encode())
        progress = tqdm.tqdm(range(filesize), f"Sending {filename}", unit="B", unit_scale=True, unit_divisor=1024)
        with open(filename, "rb") as f:
            for _ in progress:
                bytes_read = f.read(buffer_size)
                if not bytes_read:
                    break
                conn.sendall(bytes_read)
                progress.update(len(bytes_read))
            conn.close()
            print("sent")


elif received == '1':
    received = conn.recv(buffer_size).decode()
    filename, filesize = received.split(Separator)
    filename = os.path.basename(filename)
    filesize = int(filesize)
    progress = tqdm.tqdm(range(filesize), f"Receiving {filename}", unit="B", unit_scale=True, unit_divisor=4096)
    # start receiving
    with open(filename, "wb") as f:
        for _ in progress:
            bytes_read = conn.recv(buffer_size)
            if not bytes_read:
                print("finished receiving")
                break

            f.write(bytes_read)
            progress.update(len(bytes_read))

elif received == '4':
    received = conn.recv(buffer_size).decode()
    filename = os.path.basename(received)
    if os.path.isfile(filename):
        msg = "File Deleted"
        f = open(filename, 'w')
        f.close()
        os.remove(f.name)
        conn.send(msg.encode())
    else:
        msg = "File does not exists"
        conn.send(msg.encode())

elif received == '2':
    Dir = os.scandir(path = './')
    all_msg = ''
    for entry in Dir:
        if entry.is_dir() or entry.is_file():
            info = entry.stat()
            msg = f"file name: {entry.name}. Size: {info.st_size}.  Last modified: {convert_date(info.st_mtime)}. Last access: {convert_date(info.st_atime)}\n"
            all_msg = all_msg+msg
    conn.send(all_msg.encode())


else:
    print("Could not process command")

received = conn.recv(buffer_size).decode()
# conn.close()
# client_socket.close()



