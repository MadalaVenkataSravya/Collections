package com.epam.Collections;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
@SuppressWarnings("unused")
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to CustomList!" );
        @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        Listcustom<Integer> list=new Listcustom<Integer>();
   	 
   	 //Add elements
     list.add(0);
   	 list.add(1);
   	 list.add(2);
   	 list.add(3);
   	 list.add(4);
  	 list.add(5);
  	 list.add(6);
  	 list.add(7);
  	 list.add(8);
  	 list.add(9);
  	 
   	 
   	 //printing initial list
   	 //System.out.println(list);
   	 
   	 //remove element
   	 //list.remove(1); //passing index
   	 //System.out.println(list);
   	 
   	 //fetching element 
   	 //System.out.println(list.get(1)); //passing index
  	 
  	
  	    	System.out.println("List at initial is");
  	        System.out.println(list);
  	        int count=1;
  	        while(count == 1) {
  	        	System.out.println("\nOperations on a list");
  	            System.out.println("\n1.Add\n2.Fetch\n3.Remove\n4.PrintList");
  	            System.out.println("Enter your choice");
  	        	int choice = sc.nextInt();
  		        switch(choice) {
  		        case 1:
  		        	System.out.println("Enter a number to add");
  		        	int n=sc.nextInt();
  		        	list.add(n);
  		        	
  		        	System.out.println(list);
  		        	break;
  		      case 2:
		        	System.out.println("Enter a index to get a value");
		        	int ind=sc.nextInt();
		        	System.out.println("The element is "+list.get(ind));
		        	break;
  		        case 3:
  		        	System.out.println("Enter a index to remove");
  		        	int index=sc.nextInt();
  		        	System.out.println("The removed element is "+list.remove(index));
  		        	System.out.println("the list after removing element"+list);
  		        	break;
  		        
  		        case 4:
  		        	System.out.println(list);
  		        	break;
  		        default:
  		        	System.out.println("Select a valid operation...!\n");
  		        	break;
  		        }
  		        System.out.println("\nDo you want to continue:");
  		        System.out.println("1.Yes\n2.No");
  		        int c = sc.nextInt();
  		        count =c;
  	        }
    }
}