import java.util.Scanner;
public class helloJava{
    public static void main (String[] args ){
Scanner scanner = new Scanner(System.in);
        System.out.println("hello java!");
        System.out.println("my name is malichi josephat ");
        System.out.println("iam studying computer and iam in university ");
        System.out.println("i am learning cs 350");
        
//design a Java program named StudentProfile. It should store and display:
//name ,id ,age ,gender,year

int age = 20 ;
String name = "malichi josephat ";
String ID = "1234455";
String gender ="male ";
int year =3;
boolean areyouregistered = true ;
System.out.println("name: "+name );
System.out.println("ID :"+ID);
System.out.println("age :"+age);
System.out.println("gender :"+gender);  
System.out.println("year :"+year);
System.out.println("are you registered : "+areyouregistered);
//

//Then declare two numeric variables and calculate their sum, difference, product, quotient and remainder.
//int number1 = 20;
//int number2 = 6;
System.out.println("please enter two numbers  ");
int number1=scanner.nextInt();
int number2=scanner.nextInt();
int sum =number1+number2;
int difference = number1-number2;
int product = number1*number2;
int quotient = number1/number2;
int remainder = number1%number2;
System.out.println("sum :"+sum);
System.out.println("difference :"+difference);
System.out.println("product :"+product);
System.out.println("quotient :"+quotient);
System.out.println("remainder :"+remainder);        

    }
    }