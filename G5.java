package Practice;

public class G5 {
	public static void main(String[] args) {
		String name = "민들래";
		int[] score = {90,70,75};
		int sum=0;
		System.out.println("이름:"+name);
		for(int i=0;i<score.length;i++) {
			sum+= score[i];
		}
		System.out.println("합계점수:"+sum+"점");
		double avg = (double)sum/score.length;
		System.out.printf("평균점수:%.1f",avg);
	}

}
