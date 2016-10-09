import java.util.*;
public class ArrayIndexOutOfBoundsExcep {
	 public static void main (String args[]) {
		 
	      Scanner sc = new Scanner(System.in);
	      int size=0;
	      try {
	    	  System.out.print("Enter Size of Array (less than 5) : ");
	    	  size=sc.nextInt();
	    	  int array[]= new int[size];
	    	  
	    	  System.out.println("\nEnter "+size+" Elements in Array : ");
	    	  for(int i =0;i <size; i++) {		            
		            array[i]=sc.nextInt();
		         }
	    	  
	    	  System.out.println("\nDisplay Elements in Array : ");
	    	  for(int i =0;i <=size; i++) {
		            System.out.println("The value of array is " +array[i]);
		         }		         
	      }
	      catch (ArrayIndexOutOfBoundsException e) {
	         System.err.println("Array is out of Bounds "+e);
	      }
	   }
}
