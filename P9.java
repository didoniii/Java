package Practice;

//class Person ���� ��ιٲٱ��ϰ� �ٿ��ֱ�
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
		Person4 p1 = new Person4(1111, "ȫ�浿");
		Person4 p2 = new Person4(1111, "���缮");
		Person4 p3 = new Person4(2222, "ȫ�浿");
		
		if (p1.equals(p2)) System.out.println("p1,p2�� ����");
		else System.out.println("p1,p2�� �ٸ���");
		
		if (p1.equals(p3)) System.out.println("p1,p3�� ����");
		else System.out.println("p1,p3�� �ٸ���");
		
		if (p2.equals(p3)) System.out.println("p2,p3�� ����");
		else System.out.println("p2,p3�� �ٸ���");
	}
}
