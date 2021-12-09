package Test_p29_41;

public class Test_p38 {
	public static void main(String[] args) {
		iVehicle[] ivc=new iVehicle[2];
		ivc[0] = new Car3(12345,55.55);
		ivc[1] = new Plane2(667);
		for(int i=0;i<ivc.length;i++) {
			ivc[i].show();
		}
	}
}
interface iVehicle{
	int weight=1000;
	void show();
}
class Car3 implements iVehicle{
	private int num;
	private double gas;
	
	public Car3(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�Ͳ��F������"+num+",�T�o�q��"+gas+"�����l");
	}
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}
class Plane2 implements iVehicle{
	private int flight;
	public Plane2(int f) {
		flight=f;
		System.out.println("�Ͳ��F"+flight+"�Z��������");
	}
	public void show() {
		System.out.println("�������Z���O"+flight);
	}
}