package Test_p9_17;

public class Test_p11 {
	public static void main(String[] args) {
		RacingCar1 rccar1;
		rccar1=new RacingCar1();
		rccar1.setCar(1234, 20.5);
		rccar1.setCourse(5);
		rccar1.show();
	}
}
class Car1{
	protected int num;
	protected double gas;
	
	public Car1() {
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
class RacingCar1 extends Car{
	private int course;
	public RacingCar1() {
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