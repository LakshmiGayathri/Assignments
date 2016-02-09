
public class MyFirstPojo {
    
	private int car_no;
	private String car_name;
	private String car_type;
	private int model;
	
	public int getCarNo()
	{
		return car_no;
	}
	
    public String getCarName()
    {
    	return car_name;
	}
    public String getCarType()
    {
    	return car_type;
    }
	public int getModel() {
		return model;
	}

	public void setCarNo(int car_no)
	{
		this.car_no = car_no;
	}
	public void setCarName(String car_name) {
		this.car_name = car_name;
	}
	public void setCarType(String car_type )
	{
		this.car_type = car_type;
	}
	public void setModel(int model) {
		this.model = model;
	}
	
	public static void main(String[] args) {
		MyFirstPojo mycar = new MyFirstPojo();//mycar is an object of a class
		
		mycar.setCarNo(876);
		System.out.println("Car No:"+ mycar.getCarNo());
		
		mycar.setCarName("Honda CRV");
		System.out.println("Car Name:"+ mycar.getCarName());
		
		mycar.setCarType("All wheel drive");
		System.out.println("Car Type:"+ mycar.getCarType());
		
		mycar.setModel(2008);
		System.out.println("Car Model:"+ mycar.getModel());
	    }
}
	
	



   