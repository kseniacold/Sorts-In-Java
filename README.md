# 3 popular sorting algorithms implementations in Java

## Insertion Sort: 
    * Accepts boolean argument `decreasing` for easily reversing the order of sorting
    * Completes sorting in O(n^2) time complexity in the worth case
    * Has O(n) when array is sorted (soting has to match descreasing or increasing order)
    

## Merge Sort: 
    * Uses additional storage array in the Merge step
    * Completes the sorting in O(nlogn) time complexity in the worth case
    

### Quick Sort:
    * Does not require additional space
    * Perfoms in O(nlogn) time on average
    * Has O(n^2) time complexity in the worth case - when array is sorted or reverselity sorted
    * Picks first element of the givien array as a pivot element
    * This is not a randomized implementation which will solve the problem above