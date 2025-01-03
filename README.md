# Lab 0.1 - Programming the Knapsack Problem
# Objective

Write a greedy solution to solve the Knapsack Problem in any language in `O(nlogn)` time. 

# Program Input

The program will read in the problem parameters from a file `index.txt` in the same directory. 

A sample `input.txt` for the example we did in class would look like this:
```
7
15 
10, 2
5, 3
15, 5
7, 7
6, 1
18, 4
3, 1
```

Which gives the following information: 
```
7 #the number of elements
15 #the capacity of the knapsack
10, 2 #each of the possible items in the form `profit, weight`
5, 3
15, 5
7, 7
6, 1
18, 4
3, 1
```

# Program Output

For a given `input.txt`, your program should produce the following output:

```
p = 65.3
6, 1, 1
10, 2, 1
18, 4, 1
15, 5, 1
3, 1, 1
5, 3, 0.666666666666
```

Which gives the following information:

```
p = 65.3 #the total profit
6, 1, 1 #each of the items added to the bag in the form `profit, weight, 0 <= x <= 1`
10, 2, 1
18, 4, 1
15, 5, 1
3, 1, 1
5, 3, 0.666666666666
```

# Deliverable

Submit a commented program with your solution. 
## Rubric

- 6 pts - Contains all required components and uses professional language
- 5 pts - Contains all required components, but uses unprofessional language, formating, etc. 
- 4 pts - Contains some, but not all, of the required components
- 3 pts - Did not submit

