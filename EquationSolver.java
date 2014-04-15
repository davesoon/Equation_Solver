/**
 * its 4-12-14 and I am writing this poor code
 * its fun time
 * 11:00 PM
 * rgw3d
 */
import java.util.Scanner;
public class EquationSolver{
    
    public static void main(String args[]){
        
        System.out.println("Input your equation");
        String originalInput=simplifyInput(new Scanner(System.in).nextLine());//get and simplify the input

        //so i need to set up a pemdas system.  the parenthesis can call the rest of it 
        //and so on.  like recurson 
        //yay
        //fuck
        
        /*leftSide=Functions.parenthesis(leftSide);
        leftSide=Functions.exponent(leftSide);
        leftSide=Functions.multiplication(leftSide);
        leftSide=Functions.addition(leftSide);
        
        //I think this part is self explanatory 
        
        rightSide=Functions.parenthesis(rightSide);
        rightSide=Functions.exponent(rightSide);
        rightSide=Functions.multiplication(rightSide);
        rightSide=Functions.addition(rightSide);
        
        */
    }
    
    public static boolean isEquation(String string){
        simplifyInput(string);
        
        if(string.indexOf(string.indexOf(=)))
            return false;
    }
    
    public static String simplifyInput(String fix){
        if(!(fix.contains("=")))//it needs to have a equals sign
            fix=fix+"=0";
            
        fix=fix.replace(" ","");//space is bad
        
        fix=fix.replace("--","+"); //minus a minus is addition.  make it simple
        
        fix=fix.replace("-","+-");  //replace a negative with just plus a minus.  makes it easier
        
        //this will be updated later as I fix all the syntax errors that come with exponents and parentheses
        return fix;
        
    }
    
    public static Nomial nextNomial(String expression){
        string nomial = "";
        for(int i = 0; i < expression.length; i ++){
            switch(expression.charAt(i)){
                case '+':
                case '-':
                case '*':
                case '/':
                case '=':
                    
                break;
            }
        }
    }
    
    public static ArrayList toArrayList(String equation){
        if(! isEquation(equation))
            return null;
        
        ArrayList newEquation = new ArrayList();
        simplifyInput(equation);
        float tempCoefficent = 0.0;
        int tempPower = 0;
        
        
        
        return newEquation;
    }
    
}
