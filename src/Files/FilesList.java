package Files;

import java.io.*;
import java.io.IOException;

public class FilesList {
    
	public static void main(String[] args) throws IOException {
		String s = "C:/Users/lakshmi/Desktop/learn/Files";
		  File folder = new File(s);	  
		  recursion(s,folder);
	 }
	  static int j=0;
	  //Writes list of files n folders in a Specified folder
	  public static void recursion(String s,File folder1){
		      
		      File[] listOfFiles = folder1.listFiles();
		      for (int i = 0; i < listOfFiles.length; i++) {
		        if (listOfFiles[i].isFile()) {	
		         
		          
		          System.out.println("File:" + listOfFiles[i].getName());
		          
		        } else 
		         if (listOfFiles[i].isDirectory()) {
		          
		          s = folder1.getAbsolutePath()+"/"+listOfFiles[i].getName();
		          File folder2 = new File(s);
		          j++;
		          
		          System.out.println("Directory: " + listOfFiles[i].getName());	
		          
		          recursion(s,folder2);  //recursive method is called if it is folder
		          
		        }
		      }
		     j=0;
		  } 
	  	}


