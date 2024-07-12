public class HelloWorld {
    public Static void Main(String[] args) {
        // Print Hello, World! to the console
        System.out.println("Hello, World!");

        // Variables and arithmetic operations
        int a = 5;
        int b = 3;
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);

        // Conditional statements
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (a < b) {
            System.out.println(a + " is less than " + b);
        } else {
            System.out.println(a + " is equal to " + b);
        }

        // Loops
        for (int i = 1; i <= 5; i++) {
            System.out.println("Counting: " + i);
        }

        // Arrays
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.print("Numbers in the array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Methods
        int result = multiply(4, 6);
        System.out.println("Result of multiplication: " + result);
    }

    // Method example
    public static int multiply(int x, int y) {
        return x * y;
    }
}
