import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int length = in.nextInt();
    int[] numberArray = new int[length] ;
    for(int i = 0; i < length; i++)
    {
      numberArray[i] = in.nextInt();  
      
      
    }
    int mode = 0;
    int current = 0;
    for(int x : numberArray)
    {
      int count = 0;
      for(int y : numberArray)
      {
          if(x == y)
          {
            count += 1;
          }
      }
      if(count > current)
      {
        mode = x;
        current = count;
      }
    }

    System.out.println(mode);
  }
}
