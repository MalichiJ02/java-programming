import java.util.Scanner;
public class StudentResultsCalculator{
    public static void main (String[] args) {
     
     Scanner scanner = new Scanner(System.in);

     /**Ask for a student's name and three marks. */
    
    System.out.println("please enter your name ");
    String name = scanner.nextLine();
     System.out.println("please enter your ther marks or scores : ");
     int score1 =scanner.nextInt();
     int score2 =scanner.nextInt();
     int score3 =scanner.nextInt();
     // Calculate and display the total and average.
     int total = score1+score2+score3;
      int average = (score1+score2+score3)/3;
      //display 
      System.out.println("the users name is : "+ name );
      System.out.println("the total mark or score is : "+ total);
 System.out.println("the average mark or average score is : "+ average);
    }
}