package Test_p29_41;



public class Test_p29 {
	public static void main(String[] args) {
		Vehicle[] vc =new Vehicle[2];
		vc[0]=new Car1(1234,5.6);
		vc[0].setSpeed(60);
		vc[1]=new Plane(676);
		vc[1].setSpeed(888);
		
		for(int i=0;i<vc.length;i++) {
			vc[i].show();
		}
		
	}
}
abstract class Vehicle{
	protected int speed;
	public void setSpeed(int s) {
		speed =s;
		System.out.println("�N�t�׳]��"+speed+"�F");
	}
	
	abstract void show();
}
class Car1 extends Vehicle{
	private int num;
	private double gas;
	public Car1(int n,double g) {
		num = n;
		gas = g;
		System.out.println("�Ͳ��F������"+num+"�T�o�q��"+gas+"�����l");
	}
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
		System.out.println("�t�׬O"+speed);
	}
}
class Plane extends Vehicle{
	private int flight;
	public Plane(int f) {
		flight =f;
		System.out.println("�Ͳ��F"+flight+"�Z��������");
	}
	public void show() {
		System.out.println("�������Z���O"+flight);
		System.out.println("�t�׬O"+speed);
	}
}