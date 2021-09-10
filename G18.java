package google;

public class G18 {
	public static void v() {
		System.out.print(" ");
	}  
	
	public static void main(String[] args) {
		int[] num = {0,1,2,3,4,5,6,7,8,9};
	
		for(int i=1; i<10; i++) {
			if(i%2==1) {
				
			for(int k=0;k<(9-i)/2;k++) {
				G18.v();
			}	
			for(int j=1; j<=i ; j++) {				
				System.out.print(num[j]);			
			}
			
			for(int k=0;k<(9-i)/2;k++) {
				G18.v();
			}	
		System.out.println();
			}
			
		}
		for(int i=8; i>=0; i--) {
			if(i%2==1) {
				for(int k=0;k<(9-i)/2;k++) {
					G18.v();
				}	
				for(int j=1; j<=i ; j++) {
				System.out.print(num[j]);			
			}
				for(int k=0;k<(9-i)/2;k++) {
					G18.v();
				}	
		System.out.println();
				
			}
	}
}

}