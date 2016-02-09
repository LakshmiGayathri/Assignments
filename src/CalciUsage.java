

public class CalciUsage {
	
	public static void main(String[] args) {
		
		Calculator2  c = new Calculator2();// object of class Calculator
        System.out.println(c.sum(1,2));// calls sum in  Calculator
        System.out.println(c.product(4,2,5,7));// Calls pr
        
        
        ScientificCal s = new ScientificCal();
        System.out.println(s.square(5));
        System.out.println(s.diff(3,2));
        
        
        Calculator2  c1 = new ScientificCal();
        System.out.println(c1.sum(1,2,3));
        System.out.println(c1.diff(1,2,3));
        System.out.println(c1.product(2,2,3));//calls product function of Scientific cal
	}
}
