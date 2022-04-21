import java.util.Scanner;

class Day{
	private String work;//하루의 할 일을 나타내는 문자열
	public void set(String work) {this.work=work;}
	public String get() {return work;}
	public void show() {
		if(work == null) System.out.println("없습니다.");
		else System.out.println(work + "입니다");
	}
}

public class MonthSchedule{
	private int nDays;
	private Day[] days;
	private Scanner scanner;
	
	public MonthSchedule(int nDays) {
		//채우기
		this.nDays=nDays;
		this.days=new Day[nDays];
		for(int i=0; i<days.length; i++) {
			days[i]=new Day();
			
		}
		scanner = new Scanner(System.in);
	}
	
	private void input() {
		//채우기
		System.out.println("날짜(1~33)?");
		int day = scanner.nextInt();
		System.out.print("할 일(빈칸없이 입력)?");
		String work= scanner.next();
		day--;
		
		if(day<0 || day>nDays) {
			System.out.println("날짜 잘못 입력하였습니다.!");
			return;
		}
		days[day].set(work);
	}
	
	private void view() {
		//채우기
		System.out.print("날짜(1~30)?");
		int day= scanner.nextInt();
		day--;
		if(day<0 ||day>nDays) {
			System.out.println("날짜 잘못 입력하였습니다.");
			return;
		}
		System.out.println((day+1)+"일의 할 일은");
		days[day].show();
	}
	private void finish() {
		//채우기
		scanner.close();
		System.out.println("프로그램을 종료합니다.");
	}
	private void run() {
		//채우기
		System.out.println("이번달 스케줄 관리 프로그램.");
		while(true){
			System.out.print("할 일(입력:1, 보기:2, 끝내기:3) >> ");
			int menu=scanner.nextInt();
			switch(menu) {
			case 1: input(); break;
			case 2: view(); break;
			case 3: finish(); return;
			default :
				System.out.println("잘못 입력하셨습니다.");
				}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		MonthSchedule april= new MonthSchedule(30);
		april.run();
	}
}