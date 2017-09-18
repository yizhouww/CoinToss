// Name:
// USC NetID:
// CS 455 PA1
// Fall 2017

// we included the import statements for you
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;

/**
 * Bar class
 * A labeled bar that can serve as a single bar in a bar graph.
 * The text for the label is centered under the bar.
 *
 * NOTE: we have provided the public interface for this class. Do not change
 * the public interface. You can add private instance variables, constants,
 * and private methods to the class. You will also be completing the
 * implementation of the methods given.
 *
 */
public class Bar {
  private double hh1;
  private double th1;
  private double tt1;



   /**
      Creates a labeled bar.  You give the height of the bar in application
      units (e.g., population of a particular state), and then a scale for how
      tall to display it on the screen (parameter scale).

      @param bottom  location of the bottom of the label
      @param left  location of the left side of the bar
      @param width  width of the bar (in pixels)
      @param barHeight  height of the bar in application units
      @param scale  how many pixels per application unit
      @param color  the color of the bar
      @param label  the label at the bottom of the bar
   */
   public Bar(double hh, double th, double tt)
{ hh1 = hh; th1 = th; tt1 = tt;
   }

   /**
      Draw the labeled bar.
      @param g2  the graphics context
   */
   public void draw(Graphics2D g2) {
	 g2.setColor(Color.RED);
     Rectangle bar1 = new Rectangle(0,(int)(800-((hh1/th1)*500)),200,(int)(500*(hh1/th1)));
     g2.fill(bar1);
     g2.setColor(Color.GREEN);
     Rectangle bar2 = new Rectangle(400,300,200,500);
     g2.fill(bar2);
     g2.setColor(Color.BLUE);
     Rectangle bar3 = new Rectangle(800,(int)(800-((tt1/th1)*500)),200,(int)(500*(tt1/th1)));
     g2.fill(bar3);
     g2.draw(bar1); g2.draw(bar2); g2.draw(bar3);
     g2.drawString("Two Heads: ", 80, 900);
     g2.drawString("A head and a Tail: ", 450, 900);
     g2.drawString("Two Tails: ", 850, 900);
   
   }
}

