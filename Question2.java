import java.util.Scanner;
import java.util.Formatter;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
   
    //System.out.print("Please Input Height in M: ");
     Scanner in = new Scanner(System.in);
    double height = in.nextDouble();
    //System.out.print("Please Input Weight in KG: ");
    double weight = in.nextDouble();
    double bmi = weight / (height * height);
    Formatter formatter = new Formatter();
    formatter.format("%.1f", bmi);
    System.out.println(formatter.toString());
  }
}
