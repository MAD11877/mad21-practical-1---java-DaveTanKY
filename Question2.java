import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
   
    System.out.print("Please Input Height in M: ");
     Scanner in = new Scanner(System.in);
    double height = in.nextDouble();
    System.out.print("Please Input Weight in KG: ");
     Scanner x = new Scanner(System.in);
    double weight = x.nextDouble();
    System.out.println("Your Height is: " + height + "M");
    System.out.println("Your Weight is: " + weight + "KG");
    double bmi = weight / (height * height);
    System.out.println("Your BMI is : " + bmi);
  }
}
