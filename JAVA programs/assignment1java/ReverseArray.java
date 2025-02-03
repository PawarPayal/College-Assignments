    
import java.util.*;
public class ReverseArray {  
        public static void main(String[] args) {      
              
Scanner Sc=new Scanner(System.in);
     System.out.println("Enter array size");
  int n=Sc.nextInt();
            //Initialize array   
            //int [] arr = new int [] {1, 2, 3, 4, 5};   
              int [] arr = new int [n] ; 
                 System.out.println("Enter array element: ");            
            for (int i = 0; i < arr.length; i++)
 {   
                   arr[i]=Sc.nextInt();}
                //System.out.print(arr[i] + " ");   
                 System.out.println("Original array: ");            
  for (int i = 0; i < arr.length; i++)
 {   
                  
                System.out.print(arr[i] + " ");   
            }     
              
            System.out.println();  
              
            System.out.println("Array in reverse order: ");  
            //Loop through the array in reverse order  
            for (int i = arr.length-1; i >= 0; i--) {   
                System.out.print(arr[i] + " ");   
            }    
        }  
    }  
