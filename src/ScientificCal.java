
public class ScientificCal implements Calculator {
	static int a=2;
	static int b=3;
	
	public void sum(){
		System.out.println(a+b);
	}
	
	public  void dif(){
		System.out.println(a-b);
	}
	public  void product(){
       System.out.println(a*b);
	}
	
	public  void square(){
		   System.out.println("square of a");
	       System.out.println(a*a);
		}
	public  void cube(){
		   System.out.println("cube of a");
	       System.out.println(a*a*a);
		}
	
}
