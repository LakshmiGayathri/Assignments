import java.util.Scanner;

  public class Strings {
	
  public static void main(String[] args)
   {
	 Scanner in = new Scanner(System.in);
	 System.out.println("Input String:");
	 String s = in.nextLine();    //takes input from keyboard. "Welcome to Java Programming"
	 System.out.println("s="+s);  //  print output
	 
	 System.out.println("s.trim(): "+s.trim());  //trim() removes space on either side of the string  
	 
	 System.out.println("s.indexOf('e'): "+s.indexOf("e")); // returns index value of first e found
	
	 System.out.println("s.charAt(13): "+s.charAt(13));	// returns character at index 10 of a String
	
	 System.out.println("s.indexOf('e'5): "+s.indexOf("e",5)); /*returns the index of the first occurrence of the 
	                                                          specified character after the specified index. */ 
	
	 System.out.println("s.indexOf('z'): "+s.indexOf("z"));  // returns -1 as specified character is not found
	 
	// System.out.println(s.charAt(19));   String Index outOf bounds Exception  at  compile time
	 
	 
	 System.out.println("s.contains('Welcome'): "+s.contains("Welcome"));  // returns true if found
	 
	 System.out.println("s.indexOf('Welcome'): "+s.indexOf("Welcome"));  /*return  index value of the first 
	                                                           occurrence of the specified string */
	 
	 String  str="Hello helloo..";
	 System.out.println("str.replace('ello', 'i'): "+str.replace("ello", "i")); //replaces  single 'o' with 'oo'  
	 
	 System.out.println("str.replaceAll('ello', 'i'):  "+str.replaceAll("ello(.*)","i"));
	 System.out.println("str.replaceAll('ello', 'i'):  "+str.replaceAll("(.*)ello(.*)","i"));
	 
	 System.out.println("s.substring(4): "+s.substring(4));// return string from specified index
	 System.out.println("s.substring(11,15): "+s.substring(11,15));// returns string between two index values
	 
	 String str1 = "Strings are immutable";
	 String str2 = "Strings are immutable";
     String str3 = "Integers are mutable";
     
     System.out.println(str1.compareTo( str2 ));// returns 0 as fist letter in both Strings are same
   
     System.out.println(str2.compareTo(str3));// returns diff between both Strings (str3 with str1)
     in.close(); //giving warning at declaration as "resource  leak: in never closed" if close function is not called
   } 
  }
