package Test_p29_41;

public class Test_p32 {
	public static void main(String[] args) {
		Vehicle[] vc =new Vehicle[2];
		vc[0]=new Car2(12345,88.88);
		vc[1]=new Plane1(8989);
		for(int i=0;i<vc.length;i++) {
			if(vc[i]instanceof Car1)
				System.out.println("��"+(i+1)+"�Ӫ���OCar���O");
			else 
				System.out.println("��"+(i+1)+"�Ӫ��󤣬OCar���O");
		}
	}
}
abstract class Vehicle1{
	protected int speed;
	public void setSpeed(int s) {
		speed =s;
		System.out.println("�N�t�׳]��"+speed+"�F");
	}
	
	abstract void show();
}
class Car2 extends Vehicle{
	private int num;
	private double gas;
	public Car2(int n,double g) {
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
class Plane1 extends Vehicle{
	private int flight;
	public Plane1(int f) {
		flight =f;
		System.out.println("�Ͳ��F"+flight+"�Z��������");
	}
	public void show() {
		System.out.println("�������Z���O"+flight);
		System.out.println("�t�׬O"+speed);
	}
}