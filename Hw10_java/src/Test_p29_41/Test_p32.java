package Test_p29_41;

public class Test_p32 {
	public static void main(String[] args) {
		Vehicle[] vc =new Vehicle[2];
		vc[0]=new Car2(12345,88.88);
		vc[1]=new Plane1(8989);
		for(int i=0;i<vc.length;i++) {
			if(vc[i]instanceof Car1)
				System.out.println("第"+(i+1)+"個物件是Car類別");
			else 
				System.out.println("第"+(i+1)+"個物件不是Car類別");
		}
	}
}
abstract class Vehicle1{
	protected int speed;
	public void setSpeed(int s) {
		speed =s;
		System.out.println("將速度設為"+speed+"了");
	}
	
	abstract void show();
}
class Car2 extends Vehicle{
	private int num;
	private double gas;
	public Car2(int n,double g) {
		num = n;
		gas = g;
		System.out.println("生產了車號為"+num+"汽油量為"+gas+"的車子");
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("速度是"+speed);
	}
}
class Plane1 extends Vehicle{
	private int flight;
	public Plane1(int f) {
		flight =f;
		System.out.println("生產了"+flight+"班次的飛機");
	}
	public void show() {
		System.out.println("飛機的班次是"+flight);
		System.out.println("速度是"+speed);
	}
}