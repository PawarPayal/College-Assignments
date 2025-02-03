// Java Program to find Volume and Surface Area of a Cylinder



import java.util.Scanner;

public class VolumeOfCylinder {
	private static Scanner sc;

	public static void main(String[] args) {
		// L = Lateral Surface Area of a Cylinder, T = Top Surface Area
		double radius, sa, Volume, height, L, T;
		sc = new Scanner(System.in);
		
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
	}
}
