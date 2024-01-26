
package executed;

import controller.EquationCaculator;
import view.Menu;

public class Main extends Menu{
    EquationCaculator mt = new EquationCaculator();
    
    public Main(){
        super("\n========= Equation Program =========", 
             new String[] {"Calculate Superlative Equation", "Calculate Quadratic Equation", "Exit!"});
    }
    
    public static void main(String[] args) {
        Main hi = new Main();
        hi.run();
        
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                System.out.println("----- Calculate Superlative Equation -----");
                mt.calculateSuperlativeEquation(mt.inputSuperlativeData());
                break;
            case 2:
                System.out.println("----- Calculate Quadratic Equation -----");
                mt.calculateQuadraticEquation(mt.inputQuadraticData());
                break;
            case 3:
                System.out.println("Program closing!");
                break;
            default:
                System.out.println("We don't have that option!");
                break;
        }
    }
}
