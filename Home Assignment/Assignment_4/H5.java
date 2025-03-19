package Assignment_4;

class ex{
	private int intValue;
	private double doubleValue;
	ex(){
		this.intValue = 0;
		this.doubleValue = 0.0;
	}
	void setData(int i,double d) {
		this.intValue = i;
		this.doubleValue = d;
	}
	
	
}
public class H5 {
    public static void main(String[] args) {
		ex obj1 = new ex();
		obj1.setData(5, 55.56);
		obj1.prinData();
		ex obj2 = new ex();
		obj2.setData(99, 24.36);
		obj2.prinData();
	}
}
