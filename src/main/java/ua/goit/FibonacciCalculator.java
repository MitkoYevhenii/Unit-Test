package ua.goit;

public class FibonacciCalculator {

    // Рекурсивний метод
    public static long calculateFibonacciRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Index must be non-negative.");
        }
        if (n <= 1) {
            return n;
        }
        return calculateFibonacciRecursive(n - 1) + calculateFibonacciRecursive(n - 2);
    }

    // Ітеративний метод
    public static long calculateFibonacciIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Index must be non-negative.");
        }
        if (n <= 1) {
            return n;
        }
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    // Метод через формулу Біне
    public static long calculateFibonacciUsingBinet(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Index must be non-negative.");
        }
        double sqrt5 = Math.sqrt(5);
        double phi = (1 + sqrt5) / 2;
        return Math.round(Math.pow(phi, n) / sqrt5);
    }

    // Метод main для демонстрації роботи
    public static void main(String[] args) {
        int n = 10; // Індекс Фібоначчі

        System.out.println("Число Фібоначчі для n = " + n);
        System.out.println("Рекурсивний метод: " + calculateFibonacciRecursive(n));
        System.out.println("Ітеративний метод: " + calculateFibonacciIterative(n));
        System.out.println("Метод через формулу Біне: " + calculateFibonacciUsingBinet(n));
    }
}
