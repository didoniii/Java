package Practice;
interface Car{
	void drive();
}
class Bus implements Car{
	public void drive() {
		System.out.println("40명을 싣고 달린다");
	}	
}
class Taxi implements Car{
	public void drive() {
		System.out.println("총알처럼 달린다");
	}	
	public void inwon() {
		System.out.println("정원이 5명이다");
	}
}
class Ambulance implements Car{
	public void drive() {
		System.out.println("싸이렌을 울리며 달린다");
	}	
}
//public class CarEx
public class P8 {
	public static void main(String[] args) {
		Car[] car= {new Bus(), new Taxi(), new Ambulance()};
	for(int i=0; i<car.length; i++ ) {
		car[i].drive();
		if(car[i] instanceof Taxi) {
			((Taxi)car[i]).inwon();
		}
	}
}
}
