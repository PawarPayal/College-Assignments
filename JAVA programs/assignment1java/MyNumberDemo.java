class MyNumber
{
    private int num;
    public  MyNumber()
    {
        num=0;
    }
     public  MyNumber(int num)
    {
        this.num=num;
    }
    public void isnegative()
    {
        if(num<0)
        System.out.println("Number is negative:");
    }
    public void ispositive()
    {
        if(num>0)
         System.out.println("Number is positive:");
        else
         System.out.println("Number is not positive");
    }
    public void iszero()
    {
        if(num==0)
         System.out.println("Number is zero");
        else
         System.out.println("Number is not zero");
    }
    public void isodd()
    {
        if((num%2)!=0)
         System.out.println("Number is odd:");
        else
         System.out.println("Number is not odd");
    }
    public void iseven()
    {
        if((num%2)==0)
         System.out.println("Number is even");
        else
          System.out.println("Number is not even");
    }

}
class MyNumberDemo
{
    public static void main(String  []args)
    {   
       
//        int n = Integer.parseInt(args[0]);
        if(args.length==1)
        {
                 int n = Integer.parseInt(args[0]);
        MyNumber n1 = new MyNumber(n);
              
        n1.isnegative();
        n1.ispositive();
        n1.iszero();
        n1.isodd();
        n1.iseven();   
        }
        else
        {
        System.out.println("Wrong number of arguments");
        }
    }
}
