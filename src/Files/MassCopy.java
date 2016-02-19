package Files;

import java.io.*;

public class MassCopy {

	public static void main(String[] args) throws IOException {
	 String ss= null;	
	 String[] paths;
	 File d = new File("C:\\Users\\lakshmi\\Desktop\\learn\\Files");
     System.out.println(d.getAbsolutePath());
     
     if(d.exists()){       
       		 paths=d.list();
       		 for(int i=0;i<paths.length;i++){
       		    	System.out.println(paths[i]);
       		    	ss = d.getAbsolutePath()+"\\"+paths[i];
       		        copy(ss);
       		        }
        	     }
       		    
       		}
       		    	
 
	private static void copy(String ss)throws IOException {
		
		FileReader fr=new FileReader(ss);
		BufferedReader br= new BufferedReader(fr);
		
		FileWriter fw=new FileWriter("C:\\Users\\lakshmi\\Desktop\\learn\\Files1\\fw.txt");       	
       	Writer writer = null;       	
       	String s;
        writer = new BufferedWriter(fw);       	
       	while((s = br.readLine())!=null)
       	   {    		
       	     writer.write(s);    			
       	   }
		
       	br.close();
       	writer.close();
	}	
	
	}

	
     

 
