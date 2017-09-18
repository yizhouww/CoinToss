import javax.swing.JFrame;

public class CoinSimViewer
 {
 public static void main(String[] args)
 {
 JFrame frame = new JFrame();

 frame.setSize(500, 500);
 frame.setTitle("Coin Toss");
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 CoinSimComponent component = new CoinSimComponent();
 frame.add(component);

 frame.setVisible(true);
 }
 }
