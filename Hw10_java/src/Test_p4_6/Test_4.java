package Test_p4_6;

public class Test_4 {
	public static void main(String[] args) {
		RacingCar rccar1;
		rccar1=new RacingCar();
		rccar1.setCar(1234, 20.5);
		rccar1.setCourse(5);
	}
}
class Car{
	private int num;
	private double gas;
	
	public Car() {
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
	public void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�N���l�]��"+num+",�T�o�q�]��"+gas);
	}
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}
class RacingCar extends Car{
	private int course;
	public RacingCar() {
		course=0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	public void setCourse(int c) {
		course=c;
		System.out.println("�N�ɨ��s���]��"+course);
	}
}