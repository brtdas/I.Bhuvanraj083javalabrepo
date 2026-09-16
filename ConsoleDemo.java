import java.util.Scanner;

public class ConsoleDemo {
    public static void main(String[] args) {
        // Input using Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        // Output
        System.out.println("Hello, " + name + "! Age: " + age);
        System.out.printf("Formatted: %s is %d years old%n", name, age);

        sc.close();
    }
}
