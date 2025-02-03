import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class setb2 extends JFrame implements ActionListener
{
private JPanel p1,p2,p3;
private JButton b1,b2,b3,b4,b5,b6,b7,b8;
private JList l1,l2;
private DefaultListModel d1,d2;

public setb2(String s)
{
super(s);
d1=new DefaultListModel();
d2=new DefaultListModel();
p1=new JPanel();
p2=new JPanel();
p3=new JPanel();
b1=new JButton ("<");
b1.addActionListener(this);
b2=new JButton ("<<");
b2.addActionListener(this);
b3=new JButton (">");
b3.addActionListener(this);
b4=new JButton (">>");
b4.addActionListener(this);
b5=new JButton ("Add");
b5.addActionListener(this);
b6=new JButton ("Remove");
b6.addActionListener(this);
b7=new JButton ("Add");
b7.addActionListener(this);
b8=new JButton ("Remove");
b8.addActionListener(this);
l1=new JList(d1);
l2=new JList(d2);

p1.setLayout(new GridLayout(4,1));
p1.add(b1);
p1.add(b2);
p1.add(b3);
p1.add(b4);
p2.setLayout(new GridLayout(1,3));
p2.add(l1);
p2.add(p1);
p2.add(l2);
p2.setLayout(new GridLayout(1,4));
p3.add(b5);
p3.add(b6);
p3.add(b7);
p3.add(b8);
setLayout(new BorderLayout());
add(p2,BorderLayout.NORTH);
add(p3,BorderLayout.CENTER);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b5)
{
String
s1=JOptionPane.showInputDialog("Enter Element to add in list 1");
d1.addElement(s1);
}
if(e.getSource()==b6);
{
String s1=JOptionPane.showInputDialog("Enter element to remove from list 1");
d1.removeElement(s1);
}
if(e.getSource()==b7)
{
String s1=JOptionPane.showInputDialog("Enter element to add in list 2");
d2.addElement(s1);
}
if(e.getSource()==b1)
{
String s1=(String)l2.getSelectedValue();
d1.addElement(s1);
d2.removeElement(s1);
String ss;int i=0;
while((ss=(String)d1.getElementAt(i++))!=null)
if(!ss.equals(s1))
d1.addElement(s1);
i=0;
}
if(e.getSource()==b2)
{
Object s2[]=l2.getSelectedValues();
for(int i=0;i<s2.length;i++)
{
String s1=new String(s2[i].toString());
d1.addElement(s1);
d2.removeElement(s1);
}
}
if(e.getSource()==b3)
{
String s1=new String(l1.getSelectedValue().toString());
d2.addElement(s1);
d1.removeElement(s1);
}
if(e.getSource()==b4)
{
Object s2[]=l1.getSelectedValues();
for(int i=0;i<s2.length;i++)
{
String s1=new String(s2[i].toString());
d2.addElement(s1);
d1.removeElement(s1);
}
}
}
public static void main(String args[])
{
setb2 c=new setb2("My transfer screen");
c.setSize(400,200);
c.setVisible(true);
c.setLocation(500,200);
c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}}

