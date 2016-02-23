package Collections;


//import java.util.Collections;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class ReverseTheStrng {
   public static void main(String[] args){
	//@SuppressWarnings("unchecked")
	HashMap<Integer,String> hmap=new HashMap<Integer,String>();
	hmap.put(1,"Hello");
	hmap.put(2,",");
	hmap.put(3,"Welcome");
	hmap.put(4,"to");
	hmap.put(5,"Java");
	hmap.put(6,"training");
	
	//get a set of the entries 
	Set<Map.Entry<Integer,String>> set = hmap.entrySet();
	
	System.out.println("Before sorting");
	//Display the elements 
	for(Map.Entry<Integer,String> s:set){
		System.out.print(s.getValue());
	}
	
	
	//Collections.sortedMap(hmap,new ReverseStrng());(Map<? extends Integer, ? extends String>) new ReverseStrng()
	 Collections.Sort(hmap, Integer.ReverseStrng, String.ReverseStrng);
	
	System.out.println("\n\nString in reverse order");
	  
	for(Map.Entry<Integer,String> s:set){
		System.out.print(s.getValue());
	}
	    
 }

 }


class ReverseStrng implements Comparator<Integer>{

//override Compare(arg 0, arg 1)
  public int compare(Integer a,Integer b) {
	if(a>b){
		return -1;
	}else if(a<b){
		return 1;
	} 	
	return 0;
 }
}

