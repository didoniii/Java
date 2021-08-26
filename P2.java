package Practice;
import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("한자리 숫자 맞추기 게임!");
			int num = sc.nextInt();
		if(num==7) 
		{ System.out.println(num);break;}
		
		 else System.out.println("아닙니다. 다른수를 입력해보세요"); 
		
		
		}while(true);
		
		 
		
		sc.close();

	}

}
