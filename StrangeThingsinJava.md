## Strange Things in Java

1. When comparing two strings, you can't use "==", sometimes it only returns false. 

   Solution: You have to use .equals() to compare.

2. The length of an array is fixed after the assignment. You can't directly add a new entry to it.

   Solution: Use ArrayList or create a new array and add that entry.

3. When try to pass an Array into a function, you will find that the array is only a **reference** not a new array.

   Solution: Pay attention to it! Use System.arraycopy().
