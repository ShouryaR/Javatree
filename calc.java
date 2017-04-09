import javax.swing.*;
import java.awt.*;
public class calc
{
  static JFrame f;
  JPanel p1,p2,p3;
  JRadioButton r1,r2,r3,r4;
  JTabbedPane tp;
  JLabel limg;
  JCheckBox c1,c2,c3,c4;
  public calc()
  {
    tp=new JTabbedPane();
    f.getContentPane().add(tp);

    p1=new JPanel();
    p1.setBackground(Color.green);
        
    p2=new JPanel();
    p2.setBackground(Color.yellow);

    p3=new JPanel();
    p3.setBackground(Color.blue);

    r1=new JRadioButton("BMC AO");
    r2=new JRadioButton("ITPAM");
    r3=new JRadioButton("SCORCH");
    r4=new JRadioButton("VRO");
    p1.add(r1);
    p1.add(r2);
    p1.add(r3);
    p1.add(r4);
    ButtonGroup bg1=new ButtonGroup();
    bg1.add(r1);
    bg1.add(r2);
    ButtonGroup bg2=new ButtonGroup();
    bg2.add(r3);
    bg2.add(r4);
    c1=new JCheckBox("Bareilly");
    c2=new JCheckBox("Noida");  
    c3=new JCheckBox("Lucknow");
    c4=new JCheckBox("Trimbuk");
    p1.add(c1);
    p1.add(c2);
    p1.add(c3);
    p1.add(c4);
 
    ImageIcon i = new ImageIcon("D:\\Users\\shourya.r\\Desktop\\coolish.jpg");
    limg = new JLabel(i);
    p2.add(limg);

    //JScrollPane sp = new JScrollPane();
    //sp.setHorizontalScrollBarPolicy(ScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    //p2.add(sp);
    
    tp.addTab("Panel 1",i,p1,"THis is Panel one");
    tp.addTab("Panel 2",i,p2,"This is panel two");
    tp.addTab("Panel 3",i,p3,"THis is Panel three"); 

       

  }
  public static void main(String args[])
  {
    f=new JFrame("Trying Checkboxes Experiment");
    calc obj=new calc();
    f.setVisible(true);
    f.setSize(400,600);
    f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
  }
}