#### Binary Search

When working with binary search, the object needs to be sorted already.

**The algorithm for binary search is as follows:**

1. Find the middle element((sIndex + eIndex) / 2)
2. If target element > than middle element, search to right. Else search to left.
3. if middle element is == target then return

#### Order-Agnostic Binary Seach

In case we don't know in what order an array is sorted we use Order-Agnostic binary search. To do this we can the first and last to compare them to see which order the object is ascending or descending.