package Practice;

public class Dice {
	public static void main(String[] args) {
		
		System.out.println("�ֻ������� START");
		
		int p1=(int)(Math.random()*6)+1;
		int p2=(int)(Math.random()*6)+1;
		
		System.out.println("Player1 : "+ p1);
		
		
		System.out.println("Player2 : " + p2);
		
		if(p1>p2) 
			System.out.println("Player 1 Win !!! ");
		else if(p1<p2) 
				System.out.println("Player2 Win !!!");
		else System.out.println("The game ended in a tie.");
		
		System.out.println("���� ����");
	} 

}
