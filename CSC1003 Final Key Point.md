CSC1003 Final Key Point

1. type conversion:

    ```double, float, long, int, short, byte.```

    Narrowing: loss data, (int)before.

    Widening: automatically.

2. standard input and output:
    ```while (!StdIn.isEmpty()) { String item = StdIn.readString(); }```

    ```StdOut.println("Hello, World"); StdOut.printf("%d + %d = %d\n", a, b, sum);```
3. Convert an integer to binary:
    ```
    int[] binary = new int[35];
    int id = 0;

    // Number should be positive
    while (num > 0) {
        binary[id++] = num % 2;
        num = num / 2;
    }

    for (int i = id - 1; i >= 0; i--)
        System.out.print(binary[i] + "");
    ```
4. Class constructor:
    ```
    class Geeks {
        Geeks() { super(); } // its own name, without "void"
        public static void main(String[] args)
        {
            Geeks geek = new Geeks();
        }
    }
    ```
5. Compilation and Interpretation

6. When comparing two strings, you can not use "==", use .equals() to compare.

7. The length of an array is fixed after the assignment. Use ArrayList or create a new array and add that entry.

8. When try to pass an Array into a function, you will find that the array is only a **reference** not a new array. 
Pay attention to it! Use System.arraycopy().