
package model;

public class QuadraticData {
    private int degreeEquation = 2;
    private double numA;
    private double numB;
    private double numC;
    private double x1;
    private double x2;

    public QuadraticData(double numA, double numB, double numC) {
        this.numA = numA;
        this.numB = numB;
        this.numC = numC;
    }

    public double getNumA() {
        return numA;
    }

    public void setNumA(double numA) {
        this.numA = numA;
    }

    public double getNumB() {
        return numB;
    }

    public void setNumB(double numB) {
        this.numB = numB;
    }

    public double getNumC() {
        return numC;
    }

    public void setNumC(double numC) {
        this.numC = numC;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public int getDegreeEquation() {
        return degreeEquation;
    }
}
