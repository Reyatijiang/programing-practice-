import random



#All the Moves are below
#Move the Top corner piece counterclockwise on front face
def U():
    pyraminx[0][5], pyraminx[0][12],pyraminx[0][19] = pyraminx[0][12], pyraminx[0][19],pyraminx[0][5]
#Move the Top corner piece clockwise on front face
def U_():
    pyraminx[0][5], pyraminx[0][12],pyraminx[0][19] = pyraminx[0][19], pyraminx[0][5],pyraminx[0][12]
#Move the Top 2 rows counterclockwise on front face
def U1():
    U()
    pyraminx[1][4],pyraminx[1][5],pyraminx[1][6],pyraminx[1][11],pyraminx[1][12],pyraminx[1][13],pyraminx[1][18],pyraminx[1][19],pyraminx[1][20]=\
    pyraminx[1][11],pyraminx[1][12],pyraminx[1][13],pyraminx[1][18],pyraminx[1][19],pyraminx[1][20],pyraminx[1][4],pyraminx[1][5],pyraminx[1][6]
#Move the Top 2 rows clockwise on front face
def U1_():
    U1()
    pyraminx[1][4], pyraminx[1][5], pyraminx[1][6], pyraminx[1][11], pyraminx[1][12], pyraminx[1][13], pyraminx[1][18], pyraminx[1][19], pyraminx[1][20] = \
    pyraminx[1][18], pyraminx[1][19], pyraminx[1][20], pyraminx[1][4], pyraminx[1][5], pyraminx[1][6], pyraminx[1][11], pyraminx[1][12], pyraminx[1][13]
#Move the Top 3rd row pieces counterclockwise on front face
def U2():

    pyraminx[2][3],pyraminx[2][4],pyraminx[2][5],pyraminx[2][6],pyraminx[2][7],pyraminx[2][10],pyraminx[2][11],pyraminx[2][12],pyraminx[2][13],pyraminx[2][14],pyraminx[2][17],pyraminx[2][18],pyraminx[2][19],pyraminx[2][20],pyraminx[2][21] = \
    pyraminx[2][10],pyraminx[2][11],pyraminx[2][12],pyraminx[2][13],pyraminx[2][14],pyraminx[2][17],pyraminx[2][18],pyraminx[2][19],pyraminx[2][20],pyraminx[2][21],pyraminx[2][3],pyraminx[2][4],pyraminx[2][5],pyraminx[2][6],pyraminx[2][7]
#Move the Top 3rd row pieces clockwise on front face
def U2_():

    pyraminx[2][3],pyraminx[2][4],pyraminx[2][5],pyraminx[2][6],pyraminx[2][7],pyraminx[2][10],pyraminx[2][11],pyraminx[2][12],pyraminx[2][13],pyraminx[2][14],pyraminx[2][17],pyraminx[2][18],pyraminx[2][19],pyraminx[2][20],pyraminx[2][21] = \
    pyraminx[2][17],pyraminx[2][18],pyraminx[2][19],pyraminx[2][20],pyraminx[2][21],pyraminx[2][3],pyraminx[2][4],pyraminx[2][5],pyraminx[2][6],pyraminx[2][7],pyraminx[2][10],pyraminx[2][11],pyraminx[2][12],pyraminx[2][13],pyraminx[2][14]



#Move the Left corner piece counterclockwise on front face
def L():
    pyraminx[3][2], pyraminx[3][15],pyraminx[3][23] = pyraminx[3][15], pyraminx[3][23],pyraminx[3][2]
#Move the Left corner piece clockwise on front face
def L_():
    pyraminx[3][2], pyraminx[3][15],pyraminx[3][23] = pyraminx[3][23], pyraminx[3][2],pyraminx[3][15]
#Move the Left 2 rows counterclockwise on front face
def L1():
    L()
    pyraminx[3][3],pyraminx[2][3],pyraminx[3][4],pyraminx[3][13],pyraminx[2][14],pyraminx[3][14],pyraminx[3][24],pyraminx[3][25],pyraminx[2][24]   =\
    pyraminx[3][14],pyraminx[3][13],pyraminx[2][14],pyraminx[3][25],pyraminx[3][24],pyraminx[2][24],pyraminx[3][3],pyraminx[2][3],pyraminx[3][4]
#Move the Left 2 rows clockwise on front face
def L1_():
    L_()
    pyraminx[3][3],pyraminx[2][3],pyraminx[3][4],pyraminx[3][13],pyraminx[2][14],pyraminx[3][14],pyraminx[3][24],pyraminx[3][25],pyraminx[2][24]   =\
    pyraminx[3][24],pyraminx[3][25],pyraminx[2][24],pyraminx[2][3],pyraminx[3][4],pyraminx[3][3],pyraminx[3][14],pyraminx[2][14],pyraminx[3][13]
#Move the Left 3rd row counterclockwise on front face
def L2():

    pyraminx[3][5], pyraminx[3][6], pyraminx[2][4], pyraminx[2][5], pyraminx[1][4],         pyraminx[3][11], pyraminx[3][12], pyraminx[2][12], pyraminx[2][13], pyraminx[1][13],        pyraminx[1][25],pyraminx[3][26], pyraminx[3][27], pyraminx[2][26], pyraminx[2][25], = \
    pyraminx[2][13], pyraminx[1][13], pyraminx[3][12], pyraminx[2][12],pyraminx[3][11],     pyraminx[3][26], pyraminx[3][27], pyraminx[2][26], pyraminx[2][25], pyraminx[1][27],        pyraminx[3][6],  pyraminx[1][4], pyraminx[2][4], pyraminx[2][5], pyraminx[3][5],

#Move the Left 3rd row clockwise on front face
def L2_():
    L1_()
    pyraminx[3][5], pyraminx[3][6], pyraminx[2][4], pyraminx[2][5], pyraminx[1][4],         pyraminx[3][11], pyraminx[3][12], pyraminx[2][12], pyraminx[2][13], pyraminx[1][13],        pyraminx[1][25],pyraminx[3][26], pyraminx[3][27], pyraminx[2][26], pyraminx[2][25], = \
    pyraminx[3][26], pyraminx[3][27], pyraminx[2][25], pyraminx[2][26],pyraminx[1][27],     pyraminx[2][6], pyraminx[1][4], pyraminx[2][5], pyraminx[3][5], pyraminx[3][6],        pyraminx[1][13],  pyraminx[3][11], pyraminx[3][12], pyraminx[3][12], pyraminx[3][11],




#Move the Right corner piece counterclockwise on front face
def R():
    pyraminx[3][8], pyraminx[3][16],pyraminx[3][29] = pyraminx[3][16], pyraminx[3][29],pyraminx[3][8]
#Move the Top corner piece clockwise on front face
def R_():
    pyraminx[3][8], pyraminx[3][16],pyraminx[3][29] = pyraminx[3][29], pyraminx[3][8],pyraminx[3][16]
#Move the right 2 rows counterclockwise on front face
def R1():
    R()
    pyraminx[3][6],pyraminx[3][7],pyraminx[2][7],       pyraminx[3][17],pyraminx[3][18],pyraminx[2][17],        pyraminx[3][27],pyraminx[3][28],pyraminx[2][28]   =\
    pyraminx[2][17],pyraminx[3][17],pyraminx[3][18],    pyraminx[3][24],pyraminx[3][25],pyraminx[2][24],        pyraminx[2][7],pyraminx[3][7],pyraminx[3][6]
#Move the Left 2 rows clockwise on front face
def R1_():
    R_()
    pyraminx[3][6],pyraminx[3][7],pyraminx[2][7],       pyraminx[3][17],pyraminx[3][18],pyraminx[2][17],        pyraminx[3][27],pyraminx[3][28],pyraminx[2][28]   =\
    pyraminx[2][28],pyraminx[3][27],pyraminx[3][28],    pyraminx[3][7],pyraminx[2][7],pyraminx[3][6],        pyraminx[3][18],pyraminx[3][17],pyraminx[2][17]
#Move the Right 3rd row counterclockwise on front face
def R2():
    pyraminx[3][4], pyraminx[3][5], pyraminx[2][5], pyraminx[2][6], pyraminx[1][6],         pyraminx[3][19], pyraminx[3][20], pyraminx[2][18], pyraminx[2][19], pyraminx[1][18],        pyraminx[3][25],pyraminx[3][26], pyraminx[2][26], pyraminx[2][27], pyraminx[1][27], = \
    pyraminx[1][18], pyraminx[2][18], pyraminx[2][19], pyraminx[3][18],pyraminx[3][19],     pyraminx[3][26], pyraminx[3][25], pyraminx[2][27], pyraminx[2][26], pyraminx[3][27],        pyraminx[1][6],  pyraminx[2][6], pyraminx[2][5], pyraminx[3][5], pyraminx[3][4],

#Move the Right 3rd row clockwise on front face
def R2_():
    pyraminx[3][4], pyraminx[3][5], pyraminx[2][5], pyraminx[2][6], pyraminx[1][6],         pyraminx[3][19], pyraminx[3][20], pyraminx[2][18], pyraminx[2][19], pyraminx[1][18],        pyraminx[3][25],pyraminx[3][26], pyraminx[2][26], pyraminx[2][27], pyraminx[1][27] = \
    pyraminx[1][27], pyraminx[2][27], pyraminx[2][26], pyraminx[3][26],pyraminx[3][25],     pyraminx[2][6], pyraminx[1][6], pyraminx[3][5], pyraminx[2][5], pyraminx[3][4],        pyraminx[3][20],  pyraminx[3][19], pyraminx[2][19], pyraminx[2][18], pyraminx[1][18]
#Move the Back corner piece counterclockwise on front face
def B():
    pyraminx[3][22], pyraminx[3][9],pyraminx[0][26] = pyraminx[3][9], pyraminx[0][26],pyraminx[3][22]
#Move the Back corner piece clockwise on front face
def B_():
    pyraminx[3][22], pyraminx[3][9],pyraminx[0][26] = pyraminx[0][26], pyraminx[3][22],pyraminx[3][9]
#Move the Back 2 rows counterclockwise on front face
def B1():
    B()
    pyraminx[3][20], pyraminx[3][21], pyraminx[2][21],      pyraminx[3][10], pyraminx[3][11], pyraminx[2][10],      pyraminx[1][25], pyraminx[1][26], pyraminx[1][27] = \
    pyraminx[2][11], pyraminx[3][10], pyraminx[3][11],      pyraminx[1][26], pyraminx[1][27], pyraminx[1][25],      pyraminx[2][21], pyraminx[3][21], pyraminx[3][20]

#Move the Back 3rd row  counterclockwise on front face
def B2():
    pyraminx[3][18], pyraminx[3][19], pyraminx[2][19], pyraminx[2][20],pyraminx[1][20],         pyraminx[3][12], pyraminx[3][13], pyraminx[2][11], pyraminx[2][12], pyraminx[1][11],        pyraminx[2][24], pyraminx[2][25], pyraminx[2][26], pyraminx[2][ 27], pyraminx[2][28], = \
    pyraminx[1][11], pyraminx[2][11], pyraminx[2][12], pyraminx[3][13],pyraminx[3][12],         pyraminx[2][25], pyraminx[2][24], pyraminx[2][26], pyraminx[2][27], pyraminx[2][28],        pyraminx[1][20], pyraminx[2][20], pyraminx[2][19], pyraminx[3][19], pyraminx[3][18],


#List that contains all the moves
Moves_list = ["U","U1","U2","L","L1","L2","R","R1","R2","B","B1","B2"]
#Randomization
def Randomizor(n):
    All_moves = []
    for i in range(0,n):
        choice = random.choice(Moves_list)
        if(choice == "U"):
            U()
            All_moves.append("U")
        if (choice == "U1"):
            U1()
            All_moves.append("U1")
        if (choice == "U2"):
            U2()
            All_moves.append("U2")
        if (choice == "L"):
            L()
            All_moves.append("L")
        if (choice == "L1"):
            L1()
            All_moves.append("L1")
        if (choice == "L2"):
            L2()
            All_moves.append("L2")
        if (choice == "R"):
            R()
            All_moves.append("R")
        if (choice == "R1"):
            R1()
            All_moves.append("R1")
        if (choice == "R2"):
            R2()
            All_moves.append("R2")
        if (choice == "B"):
            B()
            All_moves.append("B")
        if (choice == "B1"):
            B1()
            All_moves.append("B1")
        if (choice == "B2"):
            B2()
            All_moves.append("B2")
    print("Randomized! The moves are: ")
    print(All_moves)







pyraminx =[["-","-","-","-","-","R","-","-","-","-","-","-","B","-","-","-","-","-","-","G","-","-","-","-","-","-","Y","-","-","-"],
           ["-","-","-","-","R","R","R","-","-","-","-","B","B","B","-","-","-","-","G","G","G","-","-","-","-","Y","Y","Y","-","-"],
           ["-","-","-","R","R","R","R","R","-","-","B","B","B","B","B","-","-","G","G","G","G","G","-","-","Y","Y","Y","Y","Y","-"],
           ["-","-","R","R","R","R","R","R","R","B","B","B","B","B","B","B","G","G","G","G","G","G","G","Y","Y","Y","Y","Y","Y","Y"]]
#The face order is R:Front, B:Left, G:Right,Y:Back

#driver

print("Here is the Pyramnix interface")
print(*pyraminx,sep="\n")
print("Would you like to randomize it?")
print ("Enter: yes  or  no ")
ans = input()
if(ans =="yes"):
    print("Please enter the number of moves")
    n = input()
    Randomizor(int(n))
    print(*pyraminx, sep="\n")











