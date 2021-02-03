# Code Challenge - Stack O(1)

###JetBrains
Write a program simulating a stack that can effectively return the current max element. Your program should read a sequence of commands of different types from the standard input.

There are three types of commands:

push v - add an element (v) to a top of the stack;
pop - remove the top element of the stack;
max - return the current max in the stack.
The time complexity of these operations should not depend on the stack size (constant time, O(1)).

Hint: you may use several standard stacks to write a solution.

Input data format

The first line contains the number of commands. Next lines contain one of the following commands: push v, pop, max.

Output data format

The program must output the current max for each command max.

Note, that if your methods have time complexity more than O(1), your solution will not be accepted by timeout restriction.
Sample Input 1:

5
push 2
push 1
max
pop
max
Sample Output 1:

2
2
Sample Input 2:

5
push 1
push 2
max
pop
max
Sample Output 2:

2
1
Sample Input 3:

10
push 2
push 3
push 9
push 7
push 2
max
max
max
pop
max
Sample Output 3:

9
9
9
9