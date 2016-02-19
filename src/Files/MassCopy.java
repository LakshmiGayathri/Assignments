package Files;

import java.io.*;

public class MassCopy {

	public static void main(String[] args) throws IOException {
	 String ss,s= null;	
	 String[] paths;
	 File d = new File("C:\\Users\\lakshmi\\Desktop\\learn\\Files");
	 File sd= new File("C:\\Users\\lakshmi\\Desktop\\learn\\Files1");
     System.out.println(d.getAbsolutePath());
     
     if(d.exists()){       
       		 paths=d.list();
       		 System.out.println("Source Folder file list");
       		 for(int i=0;i<paths.length;i++){
       			    
       		    	System.out.println(paths[i]);
       		    	ss = d.getAbsolutePath()+"\\"+paths[i];
       		    	s=sd.getAbsolutePath()+"\\"+paths[i];
       		        copy(ss,s);
       		        }
        	     }
      paths=sd.list();
      System.out.println("destination Folder file list");
	  for(int i=0;i<paths.length;i++){			    
		    	System.out.println(paths[i]);
	          }  
       		}
       		    	
 
	private static void copy(String ss,String s)throws IOException {
		
		FileReader fr=new FileReader(ss);
		BufferedReader br= new BufferedReader(fr);
		
		FileWriter fw=new FileWriter(s);       	
       	Writer writer = null;       	
       	String s1;
        writer = new BufferedWriter(fw);       	
       	while((s1 = br.readLine())!=null)
       	   {    		
       	     writer.write(s1);    			
       	   }
		
       	br.close();
       	writer.close();
	}	
	
	}

	
     

 
