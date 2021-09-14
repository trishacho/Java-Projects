import javax.swing.*;
import java.awt.*;
public class HappyFace extends JApplet 
{
	public void paint(Graphics canvas)
	{
		canvas.drawOval(100, 50, 200, 200);
		canvas.fillOval(155, 100, 10, 20);
		canvas.fillOval(230, 100, 10, 20);
		canvas.drawArc(150, 160, 100, 50, 360, 180);
		canvas.drawString("*",150, 150);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		HappyFace hiPeeps = new HappyFace();
		//hiPeeps.paint();
	}
}