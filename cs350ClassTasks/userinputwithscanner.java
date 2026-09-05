import java.util.Scanner;
public class userinputwithscanner{
public static void main (String[] args){
System.out.println("===========================================================");
System.out.println("please enter your name:");
Scanner scanner = new Scanner(System.in);
String name = scanner.nextLine();
System.out.println("please enter your age:");
int age = scanner.nextInt();
System.out.println("please enter your gender:");
String gender = scanner.next();
System.out.println("please enter your ID:");
String ID = scanner.next();
System.out.println("please enter your year:");
int year = scanner.nextInt();
System.out.println("===========================================================");
System.out.println("name: "+name);
System.out.println("age: "+age);
System.out.println("gender: "+gender);
System.out.println("ID: "+ID);
System.out.println("year: "+year);  
}
}