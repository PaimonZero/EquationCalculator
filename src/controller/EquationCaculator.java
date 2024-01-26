
package controller;

import java.util.ArrayList;
import model.QuadraticData;
import model.SuperlativeData;
import view.Validation;

public class EquationCaculator {
    Validation val = new Validation();
    
    public SuperlativeData inputSuperlativeData() {
        double a = val.getDouble(">Enter A: ");
        double b = val.getDouble(">Enter B: ");
        SuperlativeData ptb1 = new SuperlativeData(a, b);
        return ptb1;
    }
    
    public QuadraticData inputQuadraticData() {
        double a = val.getAforQuadraticData(">Enter A: ");
        double b = val.getDouble(">Enter B: ");
        double c = val.getDouble(">Enter C: ");
        QuadraticData ptb2 = new QuadraticData(a, b, c);
        return ptb2;
    }
    
    public void calculateSuperlativeEquation(SuperlativeData pt) {
        System.out.printf("Equation: (%.2f)x + %.2f = 0\n", pt.getNumA(), pt.getNumB());
        if (pt.getNumA() == 0) {
            if (pt.getNumB() == 0) {
                System.out.println("The equation has infinitely many solutions.");
                displayEvenOddSquareNumbers(pt.getNumA(), pt.getNumB());
            } else {
                System.out.println("The equation has no solution.");
                displayEvenOddSquareNumbers(pt.getNumA(), pt.getNumB());
            }
        } else {
            pt.setResult( -(pt.getNumB()) / pt.getNumA() );      //= -b / a;
            System.out.println("Solution x: " + pt.getResult());
            displayEvenOddSquareNumbers(pt.getNumA(), pt.getNumB(), pt.getResult());
        }
    }

    public void calculateQuadraticEquation(QuadraticData pt) {
        double a = pt.getNumA();
        double b = pt.getNumB();
        double c = pt.getNumC();
        
        System.out.printf("Equation: (%.2f)x^2 + (%.2f)x + %.2f = 0\n", pt.getNumA(), pt.getNumB(), pt.getNumC());
        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("The equation has no solution.");
            displayEvenOddSquareNumbers(a, b, c);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            pt.setX1(x);
            pt.setX2(x);
            System.out.println("The equation has only one solution: x1=x2= " + x);
            displayEvenOddSquareNumbers(a, b, c, x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            pt.setX1(x1);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            pt.setX2(x2);
            System.out.println("The equation has two solutions: x1 = " + x1 + ", x2 = " + x2);
            displayEvenOddSquareNumbers(a, b, c, x1, x2);
        }
    }

    public void displayEvenOddSquareNumbers(double... coefficients) {      // chưa chỉnh lại square
        ArrayList<Double> odd = new ArrayList<>();
        ArrayList<Double> even = new ArrayList<>();
        ArrayList<Double> square = new ArrayList<>();
        
        for (double coefficient : coefficients) {
            if (coefficient % 2 == 0) {
                even.add(coefficient);
            } else {
                odd.add(coefficient);
            }
            
            if(Math.sqrt(coefficient) % 1 == 0) {
                square.add(coefficient);
            }
        }
        
        System.out.print("Number is Odd: ");
        displayNumber(odd);
        System.out.print("Number is Even: ");
        displayNumber(even);
        System.out.print("Number is Perfect Square: ");
        displayNumber(square);
    }
    
    public void displayNumber(ArrayList<Double> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if(i != arr.size()-1) {
                System.out.printf("%.2f, ", arr.get(i));
            } else {
                System.out.printf("%.2f\n", arr.get(i));
            }
        }
    }
}
