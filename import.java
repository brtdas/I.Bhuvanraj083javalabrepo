// We group the classes together in one file without custom packages
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(10, 20);
        System.out.println("The sum is: " + result);
    }
}
