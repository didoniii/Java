package Practice;
interface Car{
	void drive();
}
class Bus implements Car{
	public void drive() {
		System.out.println("40���� �ư� �޸���");
	}	
}
class Taxi implements Car{
	public void drive() {
		System.out.println("�Ѿ�ó�� �޸���");
	}	
	public void inwon() {
		System.out.println("������ 5���̴�");
	}
}
class Ambulance implements Car{
	public void drive() {
		System.out.println("���̷��� �︮�� �޸���");
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
