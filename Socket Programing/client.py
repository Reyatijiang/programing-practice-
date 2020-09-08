import socket
import tqdm
import os
import pickle
import time




buffer_size = 4096
Separator = "<SEPARATOR>"
# get host address
host = socket.gethostname()
# specify port
port = 5001
server_dir = '/Users/reyatijiang/Desktop/Socket/server'
# instantiate a new socket
client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
print(f"Connection to {host}:{port}")
# connect to the server
client_socket.connect((host, port))
print("Connected to the server.")
print("this is a remote file program, here is a list of command you can enter:")
print("1. Upload File")
print("2. View all the files")
print("3. Download File")
print("4. Delete File")
command = input("enter your option, enter 'quit' to quit: ")
while command != 'quit':
    if command == '1':
        client_socket.send(command.encode())
        filename = input("enter file name: ")
        if os.path.isfile(filename):
            filesize = os.path.getsize(filename)
            # send file
            client_socket.send(f"{filename}{Separator}{filesize}".encode())
            progress = tqdm.tqdm(range(filesize), f"Sending {filename}", unit="B", unit_scale=True, unit_divisor=4096)
            count = 0
            stats = ""
            with open(filename, "rb") as f:
                for _ in progress:

                    bytes_read = f.read(buffer_size)
                    if not bytes_read:
                        print("finished uploading")
                        break
                    client_socket.sendall(bytes_read)

                    progress.update(len(bytes_read))

                    if count == 5000:
                        with open("Output.txt", "w") as text_file:
                            msg = f"{progress}\n"
                            msg1 = msg[-10:-6].strip()

                            stats = f"{stats}" "\n" + f"{msg1}"
                        count = 0
                    count = count + 1
                with open("Output.txt", "w") as text_file:
                    text_file.write(stats)
                print("Uploaded")


        else:
            print("File does not exists")
        command = input("enter your option, enter 'quit' to quit: ")

    elif command == '2':
        client_socket.send(command.encode())
        received = client_socket.recv(buffer_size).decode()
        print("Here is the list of all the files")
        print(received)


        command = input("enter your option, enter 'quit' to quit: ")
        client_socket.send(command.encode())

    elif command == '3':
        client_socket.send(command.encode())
        filename1 = input("enter file name: ")
        client_socket.send(filename1.encode())
        received = client_socket.recv(buffer_size).decode()
        filename, filesize = received.split(Separator)
        progress = tqdm.tqdm(range(int(filesize)), f"Receiving {filename}", unit="B", unit_scale=True,
                             unit_divisor=4096)


        stats = ""
        count = 0
        with open(filename, "wb") as f:
            for _ in progress:
                bytes_read = client_socket.recv(buffer_size)
                if not bytes_read:
                    print("finished received")
                    break
                f.write(bytes_read)
                progress.update(len(bytes_read))
                if count == 5000:
                    with open("Output.txt", "w") as text_file:
                        msg = f"{progress}\n"
                        msg1 = msg[-10:-6].strip()
                        stats = f"{stats}" "\n" + f"{msg1}"
                    count = 0
                count = count + 1
            with open("Output.txt", "w") as text_file:
                text_file.write(stats)
        command = input("enter your option, enter 'quit' to quit: ")
    elif command == '4':
        client_socket.send(command.encode())
        filename1 = input("enter file name: ")
        client_socket.send(filename1.encode())
        received = client_socket.recv(buffer_size).decode()
        print(received)

    command = input("enter your option, enter 'quit' to quit: ")

client_socket.close()
