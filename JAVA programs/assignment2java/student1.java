import java.io.*;
class student
{
static int rno;
int no;
String name;
double per;
public student()
{
name=null;per=0.0;no=0;
}
public void accept(String str,double p)
{
name=str;
per=p;
rno++;
no=rno;
}
public void show()
{
System.out.println(no+"\t\t\t"+name+"\t\t\t"+per);
}

public static void sortStudent(student []std,int n)
{
student temp=new student();
for(int pass=1;pass<n;pass++)
{
for(int i=0;i<n-pass;i++)
{
if((std[i].per)<(std[i+1].per))
{
temp=std[i];
std[i]=std[i+1];
std[i+1]=temp;
}
}
}
}
}


class e2a2
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("|n enter how many objects you want to create");
int n=Integer.parseInt(br.readLine());
student []s=new student[n];
student p1=new student();
for(int i=0;i<n;i++)
{
s[i]=new student();
}
for(int i=0;i<n;i++)
{
System.out.println("|n enter name of student");
String str=br.readLine();
System.out.println("|n enter percentage of student");
double p=Double.parseDouble(br.readLine());
s[i].accept(str,p);
}
System.out.println("Sorted list of students is as follows:");
p1.sortStudent(s,n);

System.out.println("roll number\t\t\tname\t\t\tpercentage");
for(int i=0;i<n;i++)
{
s[i].show();
}

}
}
