package Practice;

public class G5 {
	public static void main(String[] args) {
		String name = "�ε鷡";
		int[] score = {90,70,75};
		int sum=0;
		System.out.println("�̸�:"+name);
		for(int i=0;i<score.length;i++) {
			sum+= score[i];
		}
		System.out.println("�հ�����:"+sum+"��");
		double avg = (double)sum/score.length;
		System.out.printf("�������:%.1f",avg);
	}

}
