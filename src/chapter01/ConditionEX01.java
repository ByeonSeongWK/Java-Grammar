package chapter01;
// 스캐너를 import 해온다.
import java.util.Scanner;

public class ConditionEX01 {

	public static void main(String[] args) {

		// 나이에 따라서 불려지는 명칭을 출력
		// 12세 미만 - 아동
		// 12세 이상 ~ 18세 미만 - 청소년
		// 18세 이상 ~ - 성인

		// 스캐너 사용(input)
		Scanner sc = new Scanner(System.in);
		
		int age, pay = 0;
		
		age = sc.nextInt();
		// 변수 = 스캐너 이름.next데이터타입();
		
		
		// if 문
		
		if (age < 12) {
			System.out.println("아동");
		}
		if (age >= 18) {
			System.out.println("성인");
		}
		if (age >= 12 && age < 18) {  // 12세 이상 ~ 18세 미만
			System.out.println("청소년");
		}
		
		// 아동이면 무료, 청소년이면 500, 성인이면 1000
		// 마지막에 "금액은 ??? 원 입니다."
		
		if (age < 12) {
			System.out.println("아동");
			pay += 0;
		}
		if (age >= 18) {
			System.out.println("성인");
			pay += 1000;
		}
		if (age >= 12 && age < 18) {
			System.out.println("청소년");
			pay += 500;
		}
		System.out.println("금액은 " + pay + "원 입니다.");
	
		
		// if - else 문
		
		if (age < 12) {
			System.out.println("아동");
		} else if (age < 19) {
			System.out.println("청소년");
			pay += 500;
		} else {  
			System.out.println("성인");
			pay += 1000;
		}
		System.out.println("금액은 " + pay + "원 입니다.");
	}

}
