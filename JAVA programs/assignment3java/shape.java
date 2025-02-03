interface Operation 
{
public void calc_area();
public void calc_volume();
double PI=3.142;
int radius=10;
int height=5;
}
class Cylinder implements Operation
{
//int radius=10;
//int height=5;
public void calc_area()
{
double area=2*PI*radius*radius+height*(2*PI*radius);
System.out.println("cylinder area ="+area);
}
public void calc_volume()
{
double volume=PI*radius*radius+height;
System.out.println("cylinder volume ="+volume);
}
}
class demo4
{
public static void main(String args[])
{
Operation s;
//Cylinder s;
s=new Cylinder();
s.calc_area();
s.calc_volume();
}
}
