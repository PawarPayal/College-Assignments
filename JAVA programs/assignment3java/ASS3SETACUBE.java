interface functionInterface
{
public void print(int n);
}
public class functionInterfaceDemo
{
public static void main(String argd[])
{
functionInterface ad1=(n)->(n*n*n);
System.out.println(ad1.print(10));

}
}

