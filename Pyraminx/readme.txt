1. A description in English of your data structure:
	I generated a (python) list of chars that contains 4 sides of Pyramnix. 	Each side of pyraminx is composed of letter R(red),B(blue),Y(yellow), 
	and G(green). 

	There are 12 counter-clock moves implemented as individual function. It
	Swap the index of the elements in the list corresponding to each actual
	move of Pyraminx; full description is commented above each function in
	the code. 

2.To Run program. use:"pythron3 Pyraminx.py"

3. A description of the randomizer:

	The randomizer uses random.choice function to generate a random element 	in a list that contains all the 12 moves. The function takes an 
	integer as parameter and uses for loop to loop through the integer.
	Each run the function checks the  generated element and execute the
	move, and append the generated element into another list. 

	To use the randomizer, follow the user instruction and input an integer 	as number of moves. 


4. Heuristic 
	One possible heuristic would be using Manhattan distance to calculate minimum 		moves to get to correct edges and combine it with the Manhattan distance  		for minimum moves to get correct corners. It would be admissible because 		Manhattan distance is an admissible heuristic. 2 admissible heuristic combine 		Will still be admissible, and it would be more optimum than each of them 		individually(according to Composite heuristic function)





5. 	After finishing the assignment, I learned different types of search
 	function(heuristic) and how to evaluate each function on their optimality.
	

	 	


Reference:
https://codereview.stackexchange.com/questions/197287/codefights-pyraminx-puzzle.
By Ludisposed on Stake Exchange. 
https://www.youtube.com/watch?v=FxLJ0vfMFHQ
Lecture by Alan Blair at UNSW in 2017. 




