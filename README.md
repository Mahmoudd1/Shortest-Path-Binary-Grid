# Shortest-Path-Binary-Grid
**We need to find the shortest path from the top-left corner to the bottom-right corner in a binary matrix.**
## Problem Description
Given a binary matrix grid of size N x N, where 0 represents an empty cell and 1 represents a blocked cell, you need to find the length of the shortest path from the top-left corner (0, 0) to the bottom-right corner (N-1, N-1). The path can only traverse through empty cells (0) and cannot pass through blocked cells (1).
## Solution
The solution is implemented using the Breadth-First Search (BFS) algorithm. The basic idea is to perform a BFS traversal starting from the top-left corner and continue until the bottom-right corner is reached or all possible paths have been explored.

The BFS traversal is performed using a queue, initialized with the starting position (0, 0). At each step, the current cell is dequeued from the queue, and its neighbors are checked. If a neighbor is a valid empty cell (0), it is enqueued into the queue for further exploration. The grid is also updated to mark the visited cells as blocked (1) to avoid revisiting them.

The algorithm continues until the queue becomes empty, indicating that all possible paths have been explored. If the bottom-right corner is reached during the traversal, the current path length is returned as the shortest path. Otherwise, if the bottom-right corner is unreachable, the function returns -1.
## Usage
To use the solution, follow these steps:

Create an instance of the Solution class.
Call the shortestPathBinaryMatrix(int[][] grid) method, passing the binary matrix grid as an argument.
The method will return the length of the shortest path from the top-left corner to the bottom-right corner. If the path is not possible, it returns -1.
```java
int[][] grid = {
    {0, 0, 0},
    {1, 1, 0},
    {1, 1, 0}
};

Solution solution = new Solution();
int shortestPathLength = solution.shortestPathBinaryMatrix(grid);
System.out.println("Shortest Path Length: " + shortestPathLength);
```
**Output** Shortest Path Length: 4
## Complexity Analysis
The time complexity of this solution is O(N^2), where N is the size of the binary matrix. This is because, in the worst case, we may need to explore all cells of the matrix.

The space complexity is also O(N^2) since we are using a queue to store the cells to be visited during the BFS traversal. The space required grows with the size of the matrix.
