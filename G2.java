package Practice;

public class G2 {
   public static void main(String[] args) {
	   int money = 65430;
	   int[] m = {10000,1000,100,10};
	   String[] p = {"����","õ��","���","�ʿ�"};
	   for(int i=0; i<m.length;i++) {
		   System.out.println(p[i]+"="+money/m[i]);
		   money = money%m[i];
	   }
	   
//	   System.out.println("����="+money/10000);
//	   System.out.println("õ��="+(money-60000)/1000);
//	   System.out.println("���="+(money-65000)/100);
//	   System.out.println("�ʿ�="+(money-65400)/10);
	   

	   
	   
	
}
}
