package Test_p9_17;

public class Test_p14 {
	public static void main(String[] args) {
		Car14 car1;
		car1=new RacingCar14();
		car1.setCar(1234, 20.5);
		car1.show();
	}
}
class Car14{
	protected int num;
	protected double gas;
	
	public Car14() {
		num=0;
		gas=0;
		System.out.println("�Ͳ��F���l");
	}
	public void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+",�T�o�q�]��"+gas);
	}
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}
class RacingCar14 extends Car14{
	private int course;
	public RacingCar14() {
		course=0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	public void setCourse(int c) {
		course =c;
		System.out.println("�N�ɨ��s���]��"+course);
	}
	public void show() {
		System.out.println("�ɨ��������O"+num);
		System.out.println("�T�o�q�O"+gas);
		System.out.println("�ɨ��s���O"+course);
	}
}