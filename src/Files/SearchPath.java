package Files;

import java.io.File;

import java.io.FilenameFilter;
import java.io.IOException;
import java.io.FileFilter;

public class SearchPath {
  
  String str;
  
 

  public static void main(String[] args) throws IOException {
	  
	  
      File f = null;
      File[] paths;
      File[] paths1;
      File[] paths2;
      
      try{      
         // create new file
         f = new File("c:/Users/lakshmi/Desktop/learn/Files");
         File f1 = new File("c:/Users/lakshmi/Desktop/learn/Files/Files1");
         File f2 = new File("c:/Users/lakshmi/Desktop/learn/Files/Files1/file folder");
         // create new filename filter
         FilenameFilter fileNameFilter = new FilenameFilter() {
   
            //@Override
            public boolean accept(File dir, String name) {
               if(name.lastIndexOf('.')>0)
               {
                  // get last index for '.' char
                  int lastIndex = name.lastIndexOf('.');
                  
                  // get extension
                  String str = name.substring(lastIndex);
                  
                  // match path name extension
                  if(str.equals(".txt"))
                  {
                     return true;
                  }
               }
               return false;
            }
         };
         // returns pathnames for files and directory
         paths = f.listFiles(fileNameFilter);
         paths1 = f1.listFiles(fileNameFilter);
         paths2 = f2.listFiles(fileNameFilter);
         
         // for each pathname in pathname array
         for(File path:paths)
         {
        	   //if(path.e=="f1.txt")
            // prints file and directory paths
                System.out.println(path);
         }
         for(File path:paths1)
         {
        	  //if((path.getName())=="f1.txt")
                  System.out.println(path);// prints file and directory paths
         }
         for(File path:paths2)
         {
        	   //if(path.getName()=="f1.txt")
            // prints file and directory paths
                System.out.println(path);
         }
      }catch(Exception e){
         // if any error occurs
         e.printStackTrace();
      }
   }
     
 
}
