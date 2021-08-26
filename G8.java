package Practice;

import java.util.Scanner;

public class G8 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int i =sc.nextInt();
		if (i<0 || i>100) {
			System.out.println("입력오류!!");
		}
		else System.out.println(i);
		}
		
		
	}

