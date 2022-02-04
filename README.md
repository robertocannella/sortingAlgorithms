# Sorting Algorithms

## Bubble Sort
Bubble sort is the simplest sorting method.  This sorting algorithm requires multiple passes to execute.  After each pass, the next largest item is in the correct position (bubbles up).  It can be costly regarding time complexity. In the best case scenario, where an array is already sorted, we'll need a single pass O(1). In the worst case scenario, an array may be sorted in reverse order, we will need *n* passes O(*n*). Regarding comparisons, in both scenarios we *n-1* comparison need to take place.  O(*n*)

In summary, Bubble Sort runs in O(n<sup>2</sup>)
## Selection Sort
Selection sort is another simple sorting algorithm.  It works by finding the smallest item in the array adn exchange it with the first entry.  Then, find the second smallest and exchange it with the second entry.  This continues until the array is sorted.  Regarding complexity, Selection sort uses *n*<sup>2</sup>/2 compares and *n* exchanges,  though slightly faster than bubble sort, it is still considered a quadratic algorithm.

## Insertion Sort

Insertion Sort is commonly referred to as the 'card sorting' algorithm due to its implementation of sorting.  Like being dealt a set of cards, as you receive new ones, you insert them into the correct position; shifting the existing larger ones to the right to make space for the new smaller ones.  On average Insertion sort uses ~*n*<sup>2</sup>/4 compares and ~*n*<sup>2</sup>/4 exchanges when handling distinct keys.  The worst case is ~*n*<sup>2</sup>/2 compares and ~*n*<sup>2</sup>/2 exchanges. 

## Shell Sort

A version of Insertion Sort, Shell Sort allows for exchanges of array entries that are farther apart than that of Insertion Sort.   This produces partially sorted arrays that can be efficiently sorted, eventually by Insertion Sort. As  **N** increases, Shell Sort complexity outshines that of Insertion Sort.

## Merge Sort

Merge Sort runs on average (*n log (n)*) time complexity.  A divide and conquer algorithm which recursively divides an array into a single element, so it can begin the process of recursively comparing two elements, then 4, then 8, and so on.  Typically Merge Sort is taught using a recursive algorithm using while loops.  This implementation uses additional space (a temporary array). Other implementations can include an if statements in nested for loops.  Alternative approach is to implement a bottom up algorithm which requires no additional space; an inline Merge Sort  