import java.util.Scanner;
public class matrix{
public static void main(String args[])
{
//Scanner class to take input
Scanner scan = new Scanner(System.in);
int row, col; 
int mat1[][] = new int[3][3];
int mat2[][] = new int[3][3];
//Entering first matrix
System.out.println("Enter the 3x3 matrix elements for 1st matrix : "); 
// Loop to take array elements as user input for first matrixn i.e mat1
for(row=0;row<3;row++) 
for(col=0;col<3;col++) 
mat1[row][col] = scan.nextInt();
//print the elements of first matrix i.e mat1 
System.out.print("1st matrix : "); 
for(row=0;row<3;row++) 
{ 
// Used for formatting 
System.out.print("\n"); 
for(col=0;col<3;col++) 
{ 
System.out.print(mat1[row][col]+" "); 
} 
}
//Entering second matrix
System.out.println("\nEnter the 3x3 matrix elements for 2nd matrix : "); 
// Loop to take array elements as user input for second matrix
for(row=0;row<3;row++) 
for(col=0;col<3;col++) 
mat2[row][col] = scan.nextInt();
//print the elements of second matrix i.e mat2 
System.out.print("2nd matrix : "); 
for(row=0;row<3;row++) 
{ 
// Used for formatting 
System.out.print("\n"); 
for(col=0;col<3;col++) 
{ 
System.out.print(mat2[row][col]+" "); 
} 
} 
int res[][] = new int[3][3], operationHolder = 0;
int choice ;
while(true)
{
//Prints the menu to choose operation from
System.out.println("\n\nBASIC MATRIX OPERATIONS");
System.out.println("_______________________");
System.out.println("1. Addition of two matrices");
System.out.println("2. Subtraction of two matrices");
System.out.println("3. Multiplication of two matrices");
System.out.println("4. Transpose");
System.out.println("5. Exit");
System.out.println("_______________________");
System.out.println("Enter your choice : ");
choice = scan.nextInt();
// Switch cases to run the menu
switch(choice)
{
case 1: res = add(mat1,mat2);
System.out.println("After add operation");
printMatrix(res);
break;
case 2: res = sub(mat1,mat2);
System.out.println("After subtract operation");
printMatrix(res);
break;
case 3: res = prod(mat1,mat2);
System.out.println("After multiply operation");
printMatrix(res);
break;
case 4: res = trans(mat1);
System.out.println("After transpose operation");
printMatrix(res);
break;
case 5: System.out.println("Exited from the program");
return;
default: System.out.println("Wrong input, please try again!!");
}
}
}
// Function to print the matrix
static void printMatrix(int arr[][])
{
int row, col;
System.out.print("The array elements are : ");
// Loop to print the elements
for(row=0;row<3;row++)
{
// Used for formatting
System.out.print("\n");
for(col=0;col<3;col++)
{
System.out.print(arr[row][col]+" ");
}
}
}
// Function to calculate the sum
static int[][] add(int[][] mat1,int[][] mat2)
{
int row, col, add[][] = new int[3][3];
for(row=0;row<3;row++)
for(col=0;col<3;col++)
add[row][col] = mat1[row][col]+mat2[row][col];
return add;
}
// Function to calculate the difference
static int[][] sub(int[][] mat1,int[][] mat2)
{
int row, col, sub[][] = new int[3][3];
for(row=0;row<3;row++)
for(col=0;col<3;col++)
sub[row][col] = mat1[row][col]-mat2[row][col];
return sub;
}
// Function to calculate the product
static int[][] prod(int[][] mat1,int[][] mat2)
{
int row, col, prod[][] = new int[3][3];
for(row=0;row<3;row++)
for(col=0;col<3;col++)
{
// Initializes the array element to zero first
prod[row][col] = 0;
for(int i = 0; i<3; i++)
prod[row][col]+=mat1[row][i]*mat2[i][col];
}
return prod;
}
// Function to find the transpose
static int[][] trans(int[][] mat)
{
int row, col, trans[][] = new int[3][3];
for(row=0;row<3;row++)
for(col=0;col<3;col++)
trans[row][col] = mat[col][row];
return trans;
}
}
