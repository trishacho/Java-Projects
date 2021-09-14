//Trisha Choudhary
//Period 2B, 9/13/19
import javax.swing.*;
public class Average2
{
  public static void main(String[] args)
  {
    String input;
    int total = 0;
    for(int i=0; i<5; i++)
    {
      input = JOptionPane.showInputDialog("Enter integer.");
      int fiveInt = Integer.parseInt(input);
      total = total + fiveInt;
    }
    double average = total/5.0;
    JOptionPane.showMessageDialog(null, "Average = " + average);
    System.exit(0);
  }
}