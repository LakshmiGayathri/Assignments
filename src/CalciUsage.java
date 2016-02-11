import java.util.Scanner;



public class CalciUsage {
	
	public static void main(String[] args) {
		
		/*Calculator2  c = new Calculator2();// object of class Calculator
        *System.out.println(c.sum(1,2));// calls sum in  Calculator
        *System.out.println(c.product(4,2,5,7));// Calls pr
        */
        
       /* ScientificCal s = new ScientificCal();
        System.out.println(s.square(5));
        System.out.println(s.diff(3,2));
        */
        CalciUsage c2= new CalciUsage();     
        
        /*Calculator2  c1 = new ScientificCal();
        System.out.println(c1.sum(1,2,3));
        System.out.println(c1.diff(1,2,3));
        System.out.println(c1.product(2,2,3));//calls product function of Scientific cal
	*/
        
        int i,a,b;
        
        
        
        System.out.println("Press 1 for  scientific Calculator\n"
        		         + "press 2 for Regular Calculator \n"
        		         + "Press 3 for Exit\n");
        Scanner sc= new Scanner(System.in);  
        i= sc.nextInt();
        Scanner aa= new Scanner(System.in);
        Scanner ab= new Scanner(System.in);
        switch(i)
        {
        case 1:
        	  System.out.println("Scientific Calculator");
        	  System.out.println("Press 1 for  Addition\n"
     		         + "press 2 for Product");
        	  ScientificCal s = new ScientificCal();
        	  Scanner sc1= new Scanner(System.in);  
              int i1= sc1.nextInt();
              
              
              switch(i1)            
                {
            	  case 1:
            		  System.out.println("Enter value for a:");            		    
                      a= aa.nextInt();
                      System.out.println("Enter value for b:");            		    
                      b= ab.nextInt();
                      s.setAdd(a,b);
                      System.out.println(s.getAdd());
                      break;
            	  case 2:
            		  System.out.println("Enter value for a:");            		    
                      a= aa.nextInt();
                      System.out.println("Enter value for b:");            		    
                      b= ab.nextInt();
                      s.setProduct(a,b);
                      System.out.println(s.getProduct());
                      break;   
                }
              break;
        case 2:
      	        System.out.println("Regular Calculator");
      	        System.out.println("Press 1 for  Addition\n"
   		         + "press 2 for Product");
      	        Calculator2  c = new Calculator2();
      	        Scanner sc2= new Scanner(System.in);  
                int i2= sc2.nextInt();
                          
            switch(i2)            
            {
          	  case 1:
          		  System.out.println("Enter value for a:");            		    
                    a= aa.nextInt();
                    System.out.println("Enter value for b:");            		    
                    b= ab.nextInt();
                    c.setAdd(a,b);
                    System.out.println("output:"+c.getAdd());
                    break;
          	  case 2:
          		  System.out.println("Enter value for a:");            		    
                    a= aa.nextInt();
                    System.out.println("Enter value for b:");            		    
                    b= ab.nextInt();
                    c.setProduct(a,b);
                    System.out.println("Output:"+c.getProduct());
                    //CalciUsage;
                    
                    break;   
              }
              break;
            
          case 3: 
        	    System.out.println("Good bye");
        	    System.exit(0);
        	    break;
          default:
        	    System.out.println("Invalid value");
        	    break;
        }
        
	}
	
	//private static void Switch(int i1) {
		// TODO Auto-generated method stub }
		
	

	CalciUsage()
	   {
		System.out.println("Welcome to Calculator \n");
	   }
	
	
	
}
