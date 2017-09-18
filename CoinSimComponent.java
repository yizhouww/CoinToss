import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
public class CoinSimComponent extends JComponent
{
  public void paintComponent(Graphics g)
  {
    Graphics2D g2 = (Graphics2D) g;

    Bar barchart = new Bar((double)tweheads,(double)headtail,(double)tweTails);

    barchart.draw(g2);

  }
}
