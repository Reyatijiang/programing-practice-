

Heuristic:

My heuristic function counts the number of edge piece, corner piece, and inner piece out of place
and divide them with the max # of piece can be moved in 1 move, then take the celling function of the 3 numbers and return the highest.

data structure used in astar_search:

My Astar search is using a node class to represent all the possible nodes in the search. Each node is initialized with g,h, and f score, and I added 2 special functions to enable sorting in the list.
After randomizing the pyraminx, the search takes the randomized pyraminx as start node and original pyraminx as end node. My search is using the sort function in the Node class to sort all the child in the open list
to find the lowest f cost, and pop that into the closed list. Eventually astar_search would return all the node in the closed list when it reach the goal node.

My program contains 24 moves(12 clockwise rotation and 12 counterclockwise rotation). And I am using only counterclockwise to randomize and only clockwise to solve.


Bug:

When my randomization parameter K is larger or equal to 3, sometimes it takes significantly large amount of time than other time in the search. After setting K =1 and randomize, solve using only 1 move,
I located the issue of my moves to: { L2,L2_} When these moves are involved in randomization and search, the populated children is significant higher than without these move.
Note: all the results in the plot is done without the move {L2,L2_}



You can run the program by typing "python3 Pyraminx", you can change the k randomization parameter by changing the integer parameter on line 533 in main().


A PDF file is attached with this assignment. Note that 0 represent node expanded over 500000.


In this assignment, I improved my understanding of A* Algorithm and what Heuristic is, and learned that modeling a real world problem can be much more complex than expected.


Credit:

A* pesudo code: https://www.researchgate.net/figure/A-search-algorithm-Pseudocode-of-the-A-search-algorithm-operating-with-open-and-closed_fig8_232085273
A* pesudo code and A* search implementation: https://www.annytab.com/a-star-search-algorithm-in-python/
Heuristic: Dillon Tate


