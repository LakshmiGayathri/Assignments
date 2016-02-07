
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++)
		{
	     int j;
		 if (i == 1)
		 {
			 System.out.println(i);
		     continue;
		 }
	   	 for(j=2;j<i;j++)
		 {
		   if(i%j==0) 
			   break;   		    
		 }
		 if(i==j)
		   System.out.println(j);
		 
		}
		

	}

}
