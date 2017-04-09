import javax.swing.*;
import java.awt.*;

public class layouti
{
  static JFrame f;
  JPanel p;
  JTable t;
  
  String cals[] = {"SNo.","Name","Age","Address","Phone"}; 
  String data[][]={{"S001","jOHN","25","Bareilly","9452349764"};{"S002","Smith","22","Rampur","9599589845"};};
  public layouti()
  {
    p=new JPanel();
    f.getContentPane().add(p);
    t=new JTable(data,cals);
    JScrollPane sp= new JScrollPane(t);
    sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    p.add(sp);
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
