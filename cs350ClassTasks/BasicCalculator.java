//BasicCalculator
import java.util.Scanner;
public class BasicCalculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the first number ");
        int number1= scanner.nextInt();
        System.out.println("please enter the second number ");
        int number2= scanner.nextInt();
        
        System.out.println("please enter the operation you want to perform (+,-,*,/)");
        String operation= scanner.next();
    switch(operation ){
        case "+":
            int sum= number1+number2;
            System.out.println("the sum of the two numbers is: "+sum);
            break;
        case "-":
            int difference= number1-number2;
            System.out.println("the difference of the two numbers is: "+difference);
            break;
        case "*":              
            int product= number1*number2;
            System.out.println("the product of the two numbers is: "+product);
            break;
        case "/":
            if(number2==0){System.out.println("division by zero is not allowed ");}else {
                int division = number1/number2;
                System.out.println("the answer of the division is: "+division); }
            break;
        default:
            System.out.println("invalid operation");       
            
        
    }
    }
}