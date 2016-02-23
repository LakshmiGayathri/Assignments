package Collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;


public class ReverseDSentence {

	 public static void main(String args[]) {  
		   // create linked list object  	   
		   LinkedList<String> list = new LinkedList<String>();  
		      
		   // populate the list 
		   list.add("Hello");  
		   list.add("Welcome");  
		   list.add("to");  
		   list.add("java");  
		   list.add("training");
		      
		   // create comparator for reverse order
		   Comparator<String> cmp = Collections.reverseOrder();  

		   // sort the list
		   Collections.sort(list, cmp);  
				  
		   System.out.println("List sorted in ReverseOrder: ");      
		   for(String i : list){
		      System.out.print(i+ " ");
		   }	
		   }
		

}
