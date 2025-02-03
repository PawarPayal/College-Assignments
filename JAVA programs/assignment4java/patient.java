import java.util.*;
class Patient
{
String name;
int age;
int oxylevel;
int HRTCReportl;
Patient (String name,int age,int oxylevel,int HRTCeportl)
{
this.name=name;
this.age=age;
this.oxylevel=oxylevel;
this.HRTCReportl=HRTCReportl;
}
}
class Main extends Exception
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("how many patient you want insert:");
int n=sc.nextInt();
Patient [] p=new Patient[n];
for(int i=0;i<n;i++)
{

System.out.println("enter name=");


String name=sc.next();
System.out.println("enter age=");
int age=sc.nextInt();

System.out.println("enter oxygen level=");
int oxylevel=sc.nextInt();

System.out.println("enter HRTC Report=");
int HRTCReport=sc.nextInt();



}
for(int i=0;i<n;i++)
{
if (p[i].oxylevel<95 && p[i].HRTCReportl>10)
try
{
throw new NullPointerException("\n");
}
catch(Exception e)
{
System.out.println("patient is covid positive(+) and need to hospitalize\n");
}
else
{
System.out.println("name"+p[i].name);
System.out.println("age"+p[i].age);
System.out.println("oxylevel"+p[i].HRTCReportl);
System.out.println("HRTCReportl"+p[i].HRTCReportl);
}

}
}
}


