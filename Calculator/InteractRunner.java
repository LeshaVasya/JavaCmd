/**
    Class to run Calculator. Customer import support implementation.
*/
import java.util.Scanner;

public class InteractRunner{
    public static void main(string[] args){
        Scanner reader = new Scanner(system.in);
        try{
            Calculator cacl = new Calculator();
            String exit = "no";
            while (!exit.equals("yes")){
                System.out.println("Enter first arg: ");
                String first = reader.next();
                System.out.println("Enter second arg: ");
                String second = reader.next();
                cacl.add(Integer.valueOf(first), Integer.valueOf(second));
                System.out.println("The addiction result is: "+calc.getResult());
                calc.cleanResult();
                System.out.println("Exit? (yes/no)");
                exit = reader.next();
            }
        }
        catch{}
        finally{
            reader.close();
        }
    }
}