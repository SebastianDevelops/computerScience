#### Binary Search

When working with binary search, the object needs to be sorted already.

**The algorithm for binary search is as follows:**

1. Find the middle element((sIndex + eIndex) / 2)
2. If target element > than middle element, search to right. Else search to left.
3. if middle element is == target then return

#### Order-Agnostic Binary Seach

In case we don't know in what order an array is sorted we use Order-Agnostic binary search. To do this we can the first and last to compare them to see which order the object is ascending or descending.

#### Start and end pointer

- Start and end are two pointers that minimizes the search space

#### Matrix Search

- When a large set of data is given, always try to see how you can minimize the search.
- When using binary search through a Matrix, we want to look for an upper bound and lower bound.

- Upper bound: First row, first element
- Lower bound: Last column, first element


0 index is the UB
Matrix.length - 1 index is the LB

Cases:

1) if element is == target then return
2) if UB is < target row++, which moves us down one row. 
3) if UB is > taget col--, which moves us from left current column


{
    {1,2,3,4},
    {5,6,7,8},
    {9,10,11,12},
    {13,14,15,16}
}

target = 13

r = 0
c = matrix.length - 1 (3)


if matrix[r][c] == target
     return

if matrix[r][c]< target
    r++

if matrix[r][c] > target
    c--


4 < target
    r = 1

8 < target
    r = 2

12 < target
    r = 3

16 > target
    c = 2

15 > target 
    c = 1

14 > target
    c = 0

13 == target
    return { r, c }



### Matrix **binary** search



Matrix Binary Search cases

1) if elem == target
    return
2) if elem > target
    ignore rows after elem
3) if elem < target
    ignore rows before elem


Lower Bound: First row \
Upper Bound: Last row

**Steps:**

1) Take middle column
2) Perform binary search on it (trying to minimize data set)

**Step One. Take middle column:**
target = 3
{
    {1,2,3,4},
    {5,6,7,8},
    {9,10,11,12},
    {13,14,15,16}
}

midRow = 0 + (3 - 0) / 2 
row = 1

midColumn =  0 + (3 - 0) / 2 
column = 1


**Step Two. Perform binary search on middle column:**
matrix[r][c] \
matric[1][1] = 6 \
6 > target
\
NB. seeing 6 is greater than the target and the matrix is sorted, all rows after this row can be excluded

**A binary search on a matrix will always have two rows before finding answer**
{
    {1,2,3,4},
    {5,6,7,8},
    //ignored {9,10,11,12},
    //irgnored {13,14,15,16}
}
\
When two rows are emaining, check if any of the middle elements contain the answer? [2, 6]
If middle elements are not the answer then run normal binary search 
.

