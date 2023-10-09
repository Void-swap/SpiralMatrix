# SpiralMatrix
Reading a matrix in spiral way . Solving using Java

#Problem
Given a positive integer n, the task is to generate an n x n matrix filled with integers from 1 to n*n in a spiral order. 
The spiral order starts from the top-left corner and moves in a clockwise direction, filling in the numbers row by row.


#Solution
To solve this problem, you can use a nested loop to traverse the matrix in a spiral order. Keep track of four boundaries (top, bottom, left, and right) that define the current spiral.
Start with the number 1 and increment it as you move through the matrix. 
The algorithm consists of four main steps:

Move from left to right along the top boundary.
Move from top to bottom along the right boundary.
Move from right to left along the bottom boundary.
Move from bottom to top along the left boundary.

Repeat these steps until you've Travelled in all the cells in the matrix. 
