package Test_p24_26;

public class Test_p25 {
	public static void main(String[] args) {
		Car25 car5=new Car25();
		Car25 car6=new Car25();
		Car25 car7;
		car7=car5;
		System.out.println("car5�Pcar6�ۦP"+car5.equals(car6));
		System.out.println("car5�Pcar7�ۦP"+car5.equals(car7));
	}
}
class Car25{
	protected int num;
	protected double gas;
	
	public Car25() {
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
	
}