package ua.goit;

public class ExponentCalculator {

    public static void main(String[] args) {
        // Виклик розрахунку через ряд Тейлора
        int terms = 10; // Кількість термів у ряді Тейлора
        double eTaylor = calculateEUsingTaylorSeries(terms);
        System.out.println("Розрахунок числа e через ряд Тейлора з " + terms + " термів: " + eTaylor);

        // Виклик розрахунку через межу
        int n = 100000; // Кількість ітерацій для межі
        double eLimit = calculateEUsingLimit(n);
        System.out.println("Розрахунок числа e через межу при n = " + n + ": " + eLimit);

        // Еталонне значення
        System.out.println("Еталонне значення Math.E: " + Math.E);
    }

    // Реалізація через ряд Тейлора
    public static double calculateEUsingTaylorSeries(int terms) {
        if (terms <= 0) {
            throw new IllegalArgumentException("Number of terms must be greater than zero.");
        }
        double e = 0.0;
        for (int i = 0; i < terms; i++) {
            e += 1.0 / factorial(i);
        }
        return e;
    }

    // Реалізація через межу
    public static double calculateEUsingLimit(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be greater than zero.");
        }
        return Math.pow(1 + 1.0 / n, n);
    }

    // Допоміжний метод для обчислення факторіалу
    private static long factorial(int n) {
        if (n == 0) return 1;
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
