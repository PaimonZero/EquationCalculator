
package model;

public class SuperlativeData {
    private int degreeEquation = 1;
    private double numA;
    private double numB;
    private double result;

    public SuperlativeData(double numA, double numB) {
        this.numA = numA;
        this.numB = numB;
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

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    
    public int getDegreeEquation() {
        return degreeEquation;
    }
}
