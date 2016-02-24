package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.lang.*;

public class ComparatorSortStrng {

	public static void main(String[] args) {
		ArrayList<String> aList=new ArrayList<String>();
		aList.add("Hello");
		aList.add("..");
		aList.add("Welcome");
		aList.add("to");
		aList.add("Java");
		aList.add("training");
		
		System.out.println("Before sorting");
		for(String s:aList)
		{	
			System.out.print(s+" ");
		}    
		
		Collections.sort(aList,new CharCount());
		
		System.out.println("\n\nSorted based on String length");
		for(String s:aList)
		{		
			
			System.out.print(s+" ");
		}   
		
		    
	}

}

class CharCount implements Comparator<String>{

	//override Compare(arg 0, arg 1)
	
	public int compare(String a, String b) {
		if(a.length()>b.length()){
			return 1;
		}else if(a.length()<b.length()){
			return -1;
		}
		
		return 0;
	}
}
