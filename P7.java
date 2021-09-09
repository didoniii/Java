package Practice;
 class Shape{
	void draw() {
		System.out.println("그린다");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("원을 그린다");
	}	
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("사각형을 그린다");
	}	
}
class Triagle extends Shape{
	void draw() {
		System.out.println("삼각형을 그린다");
	}	
}
//public class ShapeEx
public class P7{
	public static void main(String[] args) {
		Shape s1 = new Shape();
		Circle c1 = new Circle();
		Rectangle r1 = new Rectangle();
		Triagle t1 = new Triagle();
		Shape [] sha = {s1, c1, r1, t1};
		for(Shape s : sha) {
			s.draw();
		}
		
	}
	
}