//package Gridworld;
//import edu.kzoo.grid.gui.GridAppFrame;
public abstract class ThreadedControlButton extends ControlButton
{

// constructor

 /** Constructs a button that will run in its own thread.
  *    @param gui    graphical user interface containing this button
  *    @param label  label to place on button
  *     @param displayAtEnd true if grid should be displayed when
  *                    button behavior is complete; false otherwise
  **/
 public ThreadedControlButton(GridAppFrame gui, String label,
                              boolean displayAtEnd)
 {
     super(gui, label, displayAtEnd);
 }

// methods that implement the action associated with this button

 /** Executes the action associated with this button in a separate
  *  thread.  Uses the Template Method pattern to separate the
  *  application-specific button behavior from the generic behavior
  *  of creating a new thread and deciding whether or not to display
  *  the grid when the button action is complete.
  **/
 public void onClick()
 {
     Thread myThread = new Thread()
     {
         public void run()
         {
             getGUI().enterRunningMode();

             act();

             // Redisplay grid contents if appropriate.
             if ( displaysAfterButtonAction() )
                 getGUI().showGrid();

             getGUI().enterNotRunningMode();
         }
     };

     myThread.setName(getText());
     myThread.start();
 }

 /** Performs the button action associated with this button. **/
 public abstract void act();
