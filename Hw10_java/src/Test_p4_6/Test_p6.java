package Test_p4_6;

public class Test_p6 {
	public static void main(String[] args) {
		RacingCar1 rccar2=new RacingCar1(1234,20.5,5);
	}
}
class Car6{
	private int num;
	private double gas;
	
	public Car6() {
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
	public Car6(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�Ͳ��F������"+num+"�T�o�q"+gas+"�����l");
	}
	public void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+"�T�o�q�]��"+gas);
	}
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
	
}
class RacingCar1 extends Car6{
	private int course;
	public RacingCar1() {
		course=0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	public RacingCar1(int n,double g,int c) {
		super(n,g);
		course=c;
		System.out.println("�Ͳ��F�s����"+course+"���ɨ�");
	}
	public void setCourse(int c) {
		course=c;
		System.out.println("�N�ɨ��s���]��"+course);
	}
}