import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class seta2 extends JFrame implements ActionListener
{
	private JTextField t1;
	private JPasswordField t2;
	private JButton b1,b2;
	private JLabel l1,l2;
	JPanel p1,p2;
	int n;

	public seta2(String s)
	{
		super(s);
		n=0;
		p1=new JPanel();
		p2=new JPanel();
		t1=new JTextField(10);
		t2=new JPasswordField(10);
		b1=new JButton("Ok");
		b1.addActionListener(this);
		b2=new JButton("Cancle");
		b2.addActionListener(this);
		l1=new JLabel("Login Name");
		l2=new JLabel("Password");
		t2.setEchoChar('$');
		p1.setLayout(new GridLayout(2,2));
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p2.setLayout(new FlowLayout());
		p2.add(b1);
		p2.add(b2);
		setLayout(new BorderLayout());
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.CENTER);
}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==b1)
	{
		String s=t1.getText();
		char c[]=new char[50];
		c=t2.getPassword();
		String s1=new String(c);
		if(s.equals("root")&&s1.equals("root"))
		{
			JOptionPane.showMessageDialog(null,"Successfully login");
			n=0;
		}
		else
		{
			JOptionPane.showMessageDialog(null,"login fail");
			t1.setText(" ");
			t2.setText(" ");
			n++;
			if(n==3)
			System.exit(0);
		}
	}
else if (e.getSource()==b2)
{
	System.exit(0);
}
}
public static void main(String arg[])
{
seta2 s=new seta2("Login");
s.setSize(400,150);
s.setVisible(true);
s.setLocation(200,200);
s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
