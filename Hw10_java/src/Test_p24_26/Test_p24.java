package Test_p24_26;

public class Test_p24 {
	public static void main(String[] args) {
		Car24 car2;
		car2=new Car24();
		car2.setcar(1234, 20.5);
		System.out.println(car2);
	}
}
class Car24{
	protected int num;
	protected double gas;
	public Car24() {
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
	public void setcar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+",�T�o�q�]��"+gas);
	}
	public String toString() {
		String str="����"+num+"�T�o�q"+gas;
		return str;
	}
}