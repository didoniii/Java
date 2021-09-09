package Practice;

//class Person 으로 모두바꾸기하고 붙여넣기
class Person4{
	int no;
	String name;
	public Person4(int no, String name){
		this.no= no; this.name=name;
    }
	    public boolean equals(Object obj) {
			Person4 person = (Person4)obj;
			return no == person.no;
	}
}	
//public class Person4Ex
public class P9 {
	public static void main(String[] args) {
		Person4 p1 = new Person4(1111, "홍길동");
		Person4 p2 = new Person4(1111, "유재석");
		Person4 p3 = new Person4(2222, "홍길동");
		
		if (p1.equals(p2)) System.out.println("p1,p2는 같다");
		else System.out.println("p1,p2는 다르다");
		
		if (p1.equals(p3)) System.out.println("p1,p3는 같다");
		else System.out.println("p1,p3는 다르다");
		
		if (p2.equals(p3)) System.out.println("p2,p3는 같다");
		else System.out.println("p2,p3는 다르다");
	}
}
