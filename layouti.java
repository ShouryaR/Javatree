import javax.swing.*;
import java.awt.*;

public class layouti
{
  static JFrame f;
  BorderLayout gb;
  JButton b1,b2,b3,b4,b5,b6;
  JPanel p;
  public layouti()
  {
    p=new JPanel();
    f.getContentPane().add(p);
    gb=new BorderLayout();
    p.setLayout(gb);

    b1=new JButton("Pantaloons");
    b2=new JButton("Big Bazaar");
    b3=new JButton("MAX");
    //b4=new JButton("Shopper$ Stop");
    //b5=new JButton("Titan");
    //b6=new JButton("Food Panda");

    b1.setBounds(60,128,90,25);
    b2.setBounds(149,174,90,25);
    b3.setBounds(549,324,90,25);
 
    p.add(b1);
    p.add(b2);
    p.add(b3);
    //p.add(b4);
    //p.add(b5);
  }
  public static void main(String args[])
  {
    f=new JFrame("Layout Manager");
    layouti obj = new layouti();
    f.setVisible(true);
    f.setSize(400,600);
    f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
  }
}