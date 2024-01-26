package view;

import java.util.Scanner;

public class Validation {

    public double getDouble(String inputMsg) {
        Scanner sc = new Scanner(System.in);
        double result;
        
        do{
            try {
                System.out.print(inputMsg);
                result = Double.parseDouble(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Pls enter integer number!! Try again!");
            }
        } while (true);
    }
    
    public double getAforQuadraticData(String inputMsg) {
        Scanner sc = new Scanner(System.in);
        double result;
        
        do{
            try {
                System.out.print(inputMsg);
                result = Double.parseDouble(sc.nextLine());
                if(result != 0) { 
                    return result;
                } else { 
                    System.err.println("Variable a != 0 for the equation to be a quadratic equation!");
                    System.out.println("Currently this is a first degree equation if (a=0)");
                }
            } catch (NumberFormatException e) {
                System.err.println("Pls enter integer number!! Try again!");
            }
        } while (true);
    }
    
    public String getString(String inputMsg) {
        Scanner sc = new Scanner(System.in);
        String result;
        do{
            try {
                System.out.print(inputMsg);
                result = sc.nextLine().trim();
                if(result.isEmpty() == true) {
                    System.out.println(">>You input nothing?");
                } else { return result; }
            } catch (Exception e) {
                System.err.println("Pls enter again!");
            }
        } while (true);
    }
    
    public boolean checkInputYN(String inputMsg) {
        while (true) {
            try {
                String result = getString(inputMsg);
                if (result.equalsIgnoreCase("Y")) {
                    return true;
                } else if (result.equalsIgnoreCase("N")) {
                    return false;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Please input y/Y or n/N.");
            }
        }
    }
}
