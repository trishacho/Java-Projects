//package Gridworld;
import java.lang.*;
//import javax.swing.JOptionPane;
import javax.swing.*;
public class ArrayPlotter
{
	/** The Array Plotter Graphical User Interface. */
  	private ArrayPlotterGUI gui;

	/** The Color Array.  The element values indicate how to color a grid cell:
	 *  - true: Color the cell with the Drawing Color.
	 *  - false: Color the cell with the Background Color.
	 */
  	private boolean[][] colorArray;


	/** Constructs an Array Plotter */
	public ArrayPlotter()
	{
		gui = new ArrayPlotterGUI(this);
		colorArray = null;
	}

	/** Initialize this's Color Array to a new 2D array of boolean values
	 *  with the given dimensions.
	 *  @param rows the number of rows in the new array.
	 *  @param cols the number of columns in the new array.
	 *  Postcondition: All of the Color Array's elements have the value false.
	 */
	public void initializeColorArray(int rows, int cols)
	{
		colorArray = new boolean[rows][cols];
	}


  	// Drawing Methods

	/** Removes all objects from the grid. */
	public void onClearGridButtonClick()
	{
		for (int r = 0; r<colorArray.length;r++)
			for (int c = 0; c<colorArray[r].length; c++)
				colorArray[r][c]=false;
		gui.update(colorArray);
	}

	/** Fills in all the cells of the grid using a row-major traversal. */
	public void onRowMajorFillButtonClick()
	{
		for (int r = 0; r<colorArray.length;r++)
		{
			for (int c = 0; c<colorArray[r].length; c++)
			{
				colorArray[r][c]=true;
				gui.update(colorArray);
			}
		}
	}

	public void onColumnMajorFillButtonClick()
	{
		for(int r=0; r<colorArray.length; r++)
		{
			for(int c=0; c<colorArray[r].length; c++)
			{
				colorArray[c][r] = true;
				gui.update(colorArray);
			}
		}
	}

	public void onMajorDiagonalFillButtonClick()
	{
		for(int r=0; r<colorArray.length; r++)
		{
			for(int c=0; c<colorArray[r].length; c++)
			{
				if(r==c)
				{
					colorArray[c][r] = true;
					gui.update(colorArray);
				}
			}
		}
	}
	
	public void onMinorDiagonalFillButtonClick()
	{
		for(int r=0; r<colorArray.length; r++)
		{
			for(int c=colorArray.length-1; c>=0; c--)
			{
				if(r==c)
				{
					colorArray[c][r] = true;
					gui.update(colorArray);
				}
			}
		}
	}
	
	public void onUpperTriangleFillButtonClick()
	{
		for(int r=0; r<colorArray.length; r++)
		{
			for(int c=r; c<colorArray[r].length; c++)
			{
				colorArray[r][c] = true;
				gui.update(colorArray);
			}
		}
	}
	public void onLowerTriangleFillButtonClick()
	{
		for(int r=0; r<colorArray.length; r++)
		{
			for(int c=r; c<colorArray[r].length; c++)
			{
				colorArray[c][r] = true;
				gui.update(colorArray);
			}
		}
	}
	
  	/** main method that creates the grid plotter application. */
	public static void main(String[] args)
   {
   	ArrayPlotter temp = new ArrayPlotter();
	}
}