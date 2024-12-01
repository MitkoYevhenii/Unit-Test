package ua.goit;

public class PiCalculator {

    public static void main(String[] args) {
        // Розрахунок числа π за рядом Лейбніца
        int leibnizTerms = 100000; // Кількість термів
        double piLeibniz = calculatePiUsingLeibnizSeries(leibnizTerms);
        System.out.println("Розрахунок числа π за рядом Лейбніца (" + leibnizTerms + " термів): " + piLeibniz);

        // Розрахунок числа π за методом Монте-Карло
        int monteCarloPoints = 1000000; // Кількість точок
        double piMonteCarlo = calculatePiUsingMonteCarlo(monteCarloPoints);
        System.out.println("Розрахунок числа π за методом Монте-Карло (" + monteCarloPoints + " точок): " + piMonteCarlo);

        // Еталонне значення π
        System.out.println("Еталонне значення числа π: " + getPi());
    }

    // Реалізація через ряд Лейбніца
    public static double calculatePiUsingLeibnizSeries(int terms) {
        if (terms <= 0) {
            throw new IllegalArgumentException("Number of terms must be greater than zero.");
        }
        double pi = 0.0;
        for (int i = 0; i < terms; i++) {
            pi += Math.pow(-1, i) / (2 * i + 1);
        }
        return pi * 4;
    }

    // Реалізація через метод Монте-Карло
    public static double calculatePiUsingMonteCarlo(int points) {
        if (points <= 0) {
            throw new IllegalArgumentException("Number of points must be greater than zero.");
        }
        int insideCircle = 0;
        for (int i = 0; i < points; i++) {
            double x = Math.random();
            double y = Math.random();
            if (x * x + y * y <= 1) {
                insideCircle++;
            }
        }
        return (double) insideCircle / points * 4;
    }

    // Еталонне значення
    public static double getPi() {
        return Math.PI;
    }
}
