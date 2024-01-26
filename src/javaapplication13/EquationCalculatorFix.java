package javaapplication13;

import java.util.Scanner;

public class EquationCalculatorFix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Choose an option:");
            System.out.println("1. Calculate Superlative Equation");
            System.out.println("2. Calculate Quadratic Equation");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // consume the invalid input
            }
            
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    calculateSuperlativeEquation();
                    break;
                case 2:
                    calculateQuadraticEquation();
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        } while (option != 3);

        scanner.close();
    }

    private static void calculateSuperlativeEquation() {
        Scanner scanner = new Scanner(System.in);
        double a, b;

        System.out.print("Enter coefficient A: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number for A.");
            scanner.next(); // consume the invalid input
        }
        a = scanner.nextDouble();

        System.out.print("Enter coefficient B: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number for B.");
            scanner.next(); // consume the invalid input
        }
        b = scanner.nextDouble();

        double x = a / b;

        System.out.println("Solution x: " + x);
        displayEvenOddSquareNumbers(a, b);
    }

    private static void calculateQuadraticEquation() {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;

        System.out.print("Enter coefficient A: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number for A.");
            scanner.next(); // consume the invalid input
        }
        a = scanner.nextDouble();

        System.out.print("Enter coefficient B: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number for B.");
            scanner.next(); // consume the invalid input
        }
        b = scanner.nextDouble();

        System.out.print("Enter coefficient C: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number for C.");
            scanner.next(); // consume the invalid input
        }
        c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("No real solutions.");
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("Solution x: " + x);
        } else {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Solutions x1: " + x1 + " and x2: " + x2);
        }

        displayEvenOddSquareNumbers(a, b, c);
    }

    private static void displayEvenOddSquareNumbers(double... coefficients) {
        System.out.println("Even, odd, and square numbers from inputted coefficients:");

        for (double coefficient : coefficients) {
            System.out.println("Coefficient: " + coefficient);
            
            if (coefficient % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }

            double square = coefficient * coefficient;
            System.out.println("Square: " + square);
        }
    }
}
