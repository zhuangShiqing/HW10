package Test_p29_41;

public class Test_p41 {
	public static void main(String[] args) {
		Car4 car1=new Car4(3456,99.99);
		car1.vshow();
		car1.mshow();
	}
}
interface iVehicle1{
	void vshow();
}
interface iMaterial{
	void mshow();
}
class Car4 implements iVehicle1,iMaterial{
	private int num;
	private double gas;
	
	public Car4(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�Ͳ��F������"+num+",�T�o�q��"+gas+"�����l");
	}
	public void vshow() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
	public void mshow() {
		System.out.println("���l������O�K");
	}
}