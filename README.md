# SpiralMatrix
Reading a matrix in spiral way . Solving using Java

#Solution
To solve this problem, you can use a nested loop to traverse the matrix in a spiral order. Keep track of four boundaries (top, bottom, left, and right) that define the current spiral.
Start with the number 1 and increment it as you move through the matrix. 
The algorithm consists of four main steps:

Move from left to right along the top boundary.
Move from top to bottom along the right boundary.
Move from right to left along the bottom boundary.
Move from bottom to top along the left boundary.

Repeat these steps until you've Travelled in all the cells in the matrix. 
