import java.util.*;
class City
{
// declaration of array
String a[];
int n;
City()
{
Scanner s=new Scanner(System.in);
System.out.print("enter how many city you want to enter:");
n=s.nextInt();

//redeclaration of array
a=new String[n];

//to value
for(int i=0;i<n;i++)
{
System.out.print("enter {i+1} element:");
a[i]=s.next();
}
}
// to display values
void display()
{
String temp="";
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i].compareTo(a[j])>0)
{
temp=a[i];
a[i]=a[j];
a[j]=temp;

}
}
}
System.out.println("sorted cities are");
for(int i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
}
}
//to create object
class TestCity
{
public static void main(String args[])
{
City obj=new City();
obj.display();
}
}

