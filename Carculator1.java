package Practice;

import java.util.Scanner;

public class Carculator1 {
	public static void main(String[] args) {
		double num1,num2,sum;
	
		String op;
		System.out.println("��Ģ���� ����");
		Scanner sc= new Scanner(System.in);
		System.out.println("ù��° ���� �Է��ϼ���.");
		num1 = sc.nextInt();
		System.out.println("��Ģ���� �� �����ϼ��� -ex +,-,*,/");
		op= sc.next();
		System.out.println("�ι�° ���� �Է��ϼ���.");
		num2 = sc.nextInt();
		
		if(op.equals("+")) {
			sum= num1+num2;
			System.out.println("������� : "+ sum);
		}
		else if(op.equals("-")) {
			sum= num1-num2;
			System.out.println("������� : "+ sum);
		}
		if(op.equals("*")) {
			sum= num1*num2;
			System.out.println("������� : "+ sum);
		}
		if(op.equals("/")) {
			sum= num1/num2;
			System.out.println("��������� : "+ sum);

		}
		
		sc.close();
	}
       
}
