

public class CalciUsage {
	
	public static void main(String[] args) {
		Calculator2  c = new Calculator2();
        System.out.println(c.sum(1,2));
        System.out.println(c.product(4,2,5,7));
        
        
        ScientificCal s = new ScientificCal();
        System.out.println(s.sum(1,2));
        System.out.println(s.diff(3,2,7));
        
        
        Calculator2  c1 = new ScientificCal();
        System.out.println(c1.sum(1,2,3));
        System.out.println(c1.diff(1,2,3));
	}
}
