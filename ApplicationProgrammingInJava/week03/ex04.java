package week03;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int score = 75;
		int score = (int)(Math.random()*20) + 66;
		System.out.println(score);
		
		if(score>=90) {
			System.out.println("������ 100~90 �Դϴ�.");
			System.out.println("����� A �Դϴ�.");
		}
		
		else if(score>=80) {
			System.out.println("������ 80~90 �Դϴ�.");
			System.out.println("����� B �Դϴ�.");
		}
		else if(score>=70) {
			System.out.println("������ 70~80 �Դϴ�.");
			System.out.println("����� C �Դϴ�.");
		}
		else{
			System.out.println("������ 70 �̸��Դϴ�.");
			System.out.println("����� D �Դϴ�.");
			}

	}

}
