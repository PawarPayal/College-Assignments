import java.util.Scanner;
import java.lang.Math;  
class Main {
  public static void main(String[] args) {
// Java Program to find Volume and Surface Area of a Cylinder


	Scanner sc = new Scanner(System.in);
System.out.println("Enter your choice Number 1 Volume of cylinder \n 2:Find Factorial of number \n 3:check number is armstrong \n 4:Exit");
   

    int choice = sc.nextInt();
    //String size;

    // switch statement to check size
    switch (choice) {

      case 1:
       // private static Scanner sc;

	
		// L = Lateral Surface Area of a Cylinder, T = Top Surface Area
		double radius, sa, Volume, height, L, T;
		//sc = new Scanner(System.in);
		
		System.out.println("\n Please Enter the radius of a Cylinder : ");
		radius = sc.nextDouble();
		System.out.println("\n Please Enter the Height of a Cylinder : ");
		height = sc.nextDouble();
		
		sa = 2 * Math.PI * radius * (radius + height);
		Volume = Math.PI * radius * radius * height;
		L = 2 * Math.PI * radius * height;
		T = Math.PI * radius * radius;
		
		System.out.format("\n The Surface area of a Cylinder = %.2f", sa);
		System.out.format("\n The Volume of a Cylinder = %.2f", Volume);
		System.out.format("\n The Lateral Surface area of a Cylinder = %.2f", L);
		System.out.format("\n The Top OR Bottom Surface Area of a cylinder = %.2f", T);
	
        break;

      case 2:

         int fact=1;
  System.out.println("Enter number");
int n=sc.nextInt();
     for(int i=1;i<=n;i++)
{
fact=fact*i; 
}
      

System.out.println("Factorial of number is: "+fact);
     
        
      break;

      
      case 3: 
  System.out.println("Enter Number"); 
 int num=sc.nextInt();
   int number,temp,total=0;
number=num;
 while(number!=0)
{
 temp=number%10;
 total=total+temp*temp*temp;
  number/=10;
}
  if(total==num)
    System.out.println(num+ "is an armstrong number");
 else

System.out.println(num+ "is  not an armstrong number");
   break;

      case 4:System.exit(0);
        //size = "Extra Large";
        break;
      
      default:
        System.out.println("invalid choice");
        break;

    }
    //System.out.println("Size: " + number);
  }
}
