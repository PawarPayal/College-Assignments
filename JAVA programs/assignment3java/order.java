import java.io.*;

abstract class Order
{
    private String des;
 private int id;
    Order()
    {
        des=" ";
id=0;
    }
    Order(String n,int id1)
    {
        des=n;
        id=id1;
    }
    public void accept()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("describtion :");
        des=br.readLine();
        System.out.println("member id :");
        id=Integer.parseInt(br.readLine());
    }
    public void display()
    {
   System.out.println("describtion :"+des+"\nmember id"+id);
    }
}
class PurchaseOrder extends Order
{
    private String custname;
    
    PurchaseOrder()
    {
        super();
        custname=" ";
        
    }
    PurchaseOrder(String n,int id1,String custname1)
    {
        super(n,id1);
        custname=custname1;
        
    }
    public void accept() throws IOException
    {
        super.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("custmer name :");
        custname=br.readLine();
        
    }
    public void display()
    {
        super.display();
        System.out.println("custmer name :"+custname);
    }
}
class SalesOrder extends Order
{
private String vendorname;
    
    SalesOrder()
    {
        super();
        vendorname=" ";
        
    }
    SalesOrder(String n,int id1,String vendorname1)
    {
        super(n,id1);
        vendorname=vendorname1;
        
    }
    public void accept() throws IOException
    {
        super.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("vendor name name :");
        vendorname=br.readLine();
        
    }
    public void display()
    {
        super.display();
        System.out.println("custmer name :"+vendorname);
    }
}
 
class test
{
    public static void main(String arg[]) throws IOException
    {
        int no,n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n1:Purchase Order :");
        System.out.println("2:Sales Order:");
        System.out.println("Which objects you want to create(1/2)? ");
        no=Integer.parseInt(br.readLine());
        System.out.println("Enter how many objects you want to create:");
        n=Integer.parseInt(br.readLine());

        Order m[]=new Order[n];

        if(no==1)
        {
            for(int i=0;i<m.length;i++)
            {
                m[i]=new PurchaseOrder(); 
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
                m[i]=new SalesOrder();
                m[i].accept();

            }
            for(int i=0;i<m.length;i++)
            {
                m[i].display();
            }

        }
        else
        {
            System.out.println("Wrong choice :");
        }
    }
} 
