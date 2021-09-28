package Practice;

import java.util.Scanner;

public class Carculator1 {
	public static void main(String[] args) {
		double num1,num2,sum;
	
		String op;
		System.out.println("사칙연산 계산기");
		Scanner sc= new Scanner(System.in);
		System.out.println("첫번째 숫자 입력하세요.");
		num1 = sc.nextInt();
		System.out.println("사칙연산 중 선택하세요 -ex +,-,*,/");
		op= sc.next();
		System.out.println("두번째 숫자 입력하세요.");
		num2 = sc.nextInt();
		
		if(op.equals("+")) {
			sum= num1+num2;
			System.out.println("덧셈결과 : "+ sum);
		}
		else if(op.equals("-")) {
			sum= num1-num2;
			System.out.println("뺄셈결과 : "+ sum);
		}
		if(op.equals("*")) {
			sum= num1*num2;
			System.out.println("곱셈결과 : "+ sum);
		}
		if(op.equals("/")) {
			sum= num1/num2;
			System.out.println("나눗셈결과 : "+ sum);

		}
		
		sc.close();
	}
       
}
