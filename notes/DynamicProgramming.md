# Dynamic Programming

It is a technique in which a complex problem is solved by:
	

 1. Breaking it into smaller sub-problems.
 2. Solving those sub-problems and simply storing  their results.
 3. Re-use those stored results if sub-problems occurs/overlaps again. (Avoid solving sub-problem again).
 4. Finally using solutions to smaller problems build up solution to complex problem.
 5. It is mainly an optimization over **recursion**.
 6. Dynamic Programming = Recursion + memorization.

## Optimal Substructure

 - A given problem has optimal substructure property if optimal solution of the given problem can be obtained by using the optimal solution of its sub-problems.
 - Example: fib(n) = fib(n-1) + fin(n-2)