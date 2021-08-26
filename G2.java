package Practice;

public class G2 {
   public static void main(String[] args) {
	   int money = 65430;
	   int[] m = {10000,1000,100,10};
	   String[] p = {"만원","천원","백원","십원"};
	   for(int i=0; i<m.length;i++) {
		   System.out.println(p[i]+"="+money/m[i]);
		   money = money%m[i];
	   }
	   
//	   System.out.println("만원="+money/10000);
//	   System.out.println("천원="+(money-60000)/1000);
//	   System.out.println("백원="+(money-65000)/100);
//	   System.out.println("십원="+(money-65400)/10);
	   

	   
	   
	
}
}
