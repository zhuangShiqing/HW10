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
		System.out.println("生產了車號為"+num+",汽油量為"+gas+"的車子");
	}
	public void vshow() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	public void mshow() {
		System.out.println("車子的材質是鐵");
	}
}