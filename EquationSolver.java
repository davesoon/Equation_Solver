/**
 * its 4-12-14 and I am writing this poor code
 * its fun time
 * 11:00 PM
 * rgw3d
 */
import java.util.Scanner;
public class EquationSolver{
    public final char variable = 'x';
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
        boolean hasVariable = false;
        for(int i = 0; i < expression.length; i ++){
            switch(expression.charAt(i)){
                case variable:
                    if(!hasVariable)
                        hasVariable = false;
                    else
                        continue;
                case '+':
                case '-':
                case '*':
                case '/':
                case '=':
                    //ends the loop
                    continue;
                break;
                
                default:
                    nomial += expression.charAt(i);
                break;
            }
        }
        
        if(expression.indexOf(variable) != -1){
            if(expression.charAt(indexOf(variable) + 1) == '^'){
                return new Nomial(Float.parseFloat(nomial.substring(0, indexOf(variable) - 1)), Integer.parseInt(nomial.substring(indexOf(variable) + 1));
            }
            else{
                return new Nomial(Float.parseFloat(nomial.substring(0, indexOf(Variable) - 1)), 1);
            }
            
        }
        else{
            return new Nomial(Float.parseFloat(nomial), 0);
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
