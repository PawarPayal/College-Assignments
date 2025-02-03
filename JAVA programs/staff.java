import java.io.*;
abstract class Staff
{
private String name,add;
Staff()
{
name=add=" ";
}
Staff(String n,String a)
{
name=n;
add=a;
}
public void accept()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("NAME:");
name=br.readLine();
System.out.println("ADDRESS:");
add=br.readLine();
}
public void display()
{
System.out.println("NAME:"+name+"\n ADDRESS"+add);
}
}
class FullTimeStaff extends Staff
{
private String dept;
private int salary;
FullTimeStaff()
{
super();
dept="  ";
salary=0;
}
FullTimeStaff(String n,String a,String d,int s)
{
super(n,a);
dept=d;
salary=s;
}
public void accept()throws IOException
{
super.accept();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Dept:");
dept=br.readLine();
System.out.println("Salary:");
salary=Integer.parseInt(br.readLine());
}
public void display()
{
super.display();
System.out.println("Department:"+dept+"\n Salary"+salary);
}
}
class PartTimeStaff extends Staff
{
private int no_of_hr;
private double rate_per_hr;
PartTimeStaff()
{
super();
no_of_hr=0;
rate_per_hr=0;
}
PartTimeStaff(String n,String a,String d,int h,int r)
{
super(n,a);
no_of_hr=h;
rate_per_hr=r;
}
public void accept()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
super.accept();
System.out.println("No Of Hour:");
no_of_hr=Integer.parseInt(br.readLine());
System.out.println("RATE PER Hour:");
rate_per_hr=Double.parseDouble(br.readLine());
}
public void display()
{
super.display();
System.out.println("No_of_hour:"+no_of_hr+"\n Rate_per_hour"+rate_per_hr);
}
}
class test {
public static void main(String args[]) throws IOException
{
int no,n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("\n1.FullTimeStaff:");
System.out.println("2.partTimeStaff:");
System.out.println(".Which object you want to create(1/2)?:");
no=Integer.parseInt(br.readLine());
System.out.println("Enter How many no. you want to create:");
n=Integer.parseInt(br.readLine());
Staff m[]=new Staff[n];
if(no==1)
{
for(int i=0;i<m.length;i++)
{
m[i] =new FullTimeStaff();
m[i].accept();
}
for(int i=0;i<m.length;i++)
{
m[i].display();
}
}
else if(no==2)
{
for(int i=0;i<m.length;i++)
{
m[i] =new PartTimeStaff();
m[i].accept();
}
for(int i=0;i<m.length;i++)
{
m[i].display();
}
}
else
{
System.out.println("Wrong choice:");
}
}
}
