package Test_p24_26;

public class Test_p25 {
	public static void main(String[] args) {
		Car25 car5=new Car25();
		Car25 car6=new Car25();
		Car25 car7;
		car7=car5;
		System.out.println("car5與car6相同"+car5.equals(car6));
		System.out.println("car5與car7相同"+car5.equals(car7));
	}
}
class Car25{
	protected int num;
	protected double gas;
	
	public Car25() {
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	
}