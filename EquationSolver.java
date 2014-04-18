/**
 * its 4-12-14 and I am writing this poor code
 * its fun time
 * 11:00 PM
 * rgw3d
 */
import java.util.ArrayList;
import java.util.Scanner;
public class EquationSolver{
    public static final char variable = 'x';
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
        
        if(string.indexOf(string.indexOf('=')) == -1)
            return false;
        
        return true;
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
        String nomial = "";
        boolean hasVariable = false;
        for(int i = 0; i < expression.length(); i ++){
            switch(expression.charAt(i)){
                case variable:
                    if(!hasVariable)
                        hasVariable = true;
                    else
                        continue;
                case '+':
                case '-':
                case '*':
                case '/':
                case '=':
                    //ends the loop
                    continue;
                default:
                    nomial += expression.charAt(i);
                break;
            }
        }
        
<<<<<<< HEAD
        if(expression.indexOf(variable) != -1){
            if(expression.charAt(expression.indexOf(variable) + 1) == '^'){
                return new Nomial(Float.parseFloat(nomial.substring(0, expression.indexOf(variable) - 1)), Integer.parseInt(nomial.substring(expression.indexOf(variable) + 1)));
            }
            else{
                return new Nomial(Float.parseFloat(nomial.substring(0, expression.indexOf(variable) - 1)), 1);
=======
        if(hasVAriable){
            //Finds the power symbol
            if(expression.charAt(indexOf(variable) + 1) == '^'){
                //returns the coefficient, and the power is the rest of the string
                
                //CAUSES A PROBLEM WITH FLOAT POWERS
                return new Nomial(Float.parseFloat(nomial.substring(0, indexOf(variable) - 1)), Integer.parseInt(nomial.substring(indexOf(variable) + 1));
            }
            else{
                //No power = 1st power
                return new Nomial(Float.parseFloat(nomial.substring(0, indexOf(Variable) - 1)), 1);
>>>>>>> d548784448c2d6ba9b48ab54f100fa7d2ce01cb0
            }
            
        }
        else{
            //returns coefficient
            return new Nomial(Float.parseFloat(nomial), 0);
        }
    }
    
    public static ArrayList toArrayList(String equation){
        if(! isEquation(equation))
            return null;
        
        ArrayList newEquation = new ArrayList();
        simplifyInput(equation);
        float tempCoefficent = 0;
        int tempPower = 0;
        
        newEquation.add(nextNomial(equation)));
        
        return newEquation;
    }
    
}
