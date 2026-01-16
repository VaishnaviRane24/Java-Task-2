import java.util.Scanner;

public class Variable {

    // Instance variable (belongs to each object)
    int instanceVar = 10;

    // Static variable (shared across all objects)
    static int staticVar = 20;

    public static void main(String[] args) {
        // Local variable (exists only inside this method)
        int localVar = 30;

        // 1. Declare all primitive data types
        byte b = 1; // 1 byte
        short s = 2; // 2 bytes
        int i = 100; // 4 bytes
        long l = 1000L; // 8 bytes
        float f = 10.5f; // 4 bytes
        double d = 20.99; // 8 bytes
        char c = 'A'; // 2 bytes
        boolean flag = true; // 1 bit (JVM dependent)

        System.out.println("Primitive data types declared successfully!");

        // 2. Scanner for user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter an integer.");
            return;
        }
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter an integer.");
            return;
        }
        int num2 = sc.nextInt();

        // 3. Arithmetic operations
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        if (num2 != 0) {
            System.out.printf("Division: %.2f%n", (double) num1 / num2);
        } else {
            System.out.println("Division by zero is not allowed!");
        }

        // 4. Type casting
        double castedDouble = (double) num1; // widening (safe)
        int castedInt = (int) d; // narrowing (may lose data)
        System.out.println("Type casting examples: int->double = " + castedDouble + ", double->int = " + castedInt);

        // 7. Show local, instance, and static variables
        Variable obj = new Variable();
        System.out.println("Local variable: " + localVar);
        System.out.println("Instance variable: " + obj.instanceVar);
        System.out.println("Static variable: " + staticVar);

        sc.close();
    }
}
