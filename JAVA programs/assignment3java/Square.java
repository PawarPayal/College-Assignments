@FunctionalInterface
interface Square
{
  int cal(int x);
}
 class Test
{
  public static void main(String args)
{
  int a=10;
  Square s= (int x) -> x*x*x;
 int ans=s.cal(a);
System.out.println(ans);
}
}
