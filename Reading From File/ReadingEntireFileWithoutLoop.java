import java.io.File; 
import java.util.Scanner; 
public class ReadingEntireFileWithoutLoop
{ 
  public static void main(String[] args) throws Exception 
  { 
    // pass the path to the file as a parameter 
    File file = new File("E:\\test.txt"); 
    Scanner sc = new Scanner(file);
    while(sc.hasNextLine())
    {
        int input = 0, total = 0, n = 0;
    	Scanner secondScan = new Scanner(sc.next());
        secondScan.useDelimiter(",");
    	while(secondScan.hasNextLine())
    	{
    		input = secondScan.nextInt();
    		total  = total + input;
    		n++;
    	}
    	double average = (double) total/n;
        System.out.println("Average = " + average);
    }
    sc.close();
  } 
} 