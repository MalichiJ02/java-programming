import java.util.Scanner ;
public class TemperatureConverter {
    public static void main(String[]args){

Scanner scanner =new Scanner(System.in);
/* Write a program that asks the user for a temperature in Celsius and converts it to Fahrenheit.
Formula:
F = (C × 9 / 5) + 32 */
System.out.println("please enter the temperature  in celsius that you want to convert to Fahrenheit");
 Double celsius =scanner.nextDouble();

Double fahrenhiet = (celsius * 9/5)+32;
System.out.println("the temperature in Fahrenheit is :  " + fahrenhiet);


    }
    }