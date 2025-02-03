import javax.swing.*;
import java.awt.*;

class setb1 extends JFrame
{
private JPanel p1,p2;
private JTextField t1;
private JButton b[];
private JFrame f;

setb1()
{
p1=new JPanel();
p2=new JPanel();
f=new JFrame("Simple Calculator");
t1=new JTextField(30);
String str[]={"1","2","3","4","5","6","-","7","8","9","*","0","=","/"};
b=new JButton[str.length];
for(int i=0;i<str.length;i++)
{
b[i]=new JButton(str[i]);
}

p1.setLayout(new BorderLayout());
p1.add(t1);
p2.setLayout(new GridLayout(4,4));
for(int i=0;i<b.length;i++)
{
p2.add(b[i]);
}
f.setLayout(new BorderLayout());
f.add(p1,BorderLayout.NORTH);
f.add(p2,BorderLayout.CENTER);

f.setSize(700,300);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args)
{
new setb1();
}
}
