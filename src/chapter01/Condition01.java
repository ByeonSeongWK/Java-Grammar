package chapter01;

public class Condition01 {

	public static void main(String[] args) {

		// if 조건문
		// if(조건) { 실행문 }

		int age = 13;

		System.out.println("if문 위");

		// 조건이 true일때만 실행
		if (age > 18) {
			System.out.println("성인"); // false 라서 실행 X
		}
		
		System.out.println("if문 아래");
		System.out.println("-------");

		
		// else 문
		// else {조건이 거짓일 때 실행문}

		if (age > 18) {
			System.out.println("성인");
		} else {
			System.out.println("미성년자");
		}
		
		System.out.println("if문 아래");
		System.out.println("-------");

		
		// else if(조건) { 위의 조건이 거짓이고 해당 조건이 참일 때 실행문 }
		// 중요! : 위에 값이 거짓일시!
		
		if (age < 12) {
			System.out.println("아동");
		} else if (age < 18) {
			System.out.println("청소년");
		} else if (age == 18){
			System.out.println("성인");
		}

		System.out.println("-------");

		
		// 중첩 if문

		int x, y;
		x = 1;
		y = 1;

		// 1 사분면
		if (x > 0 && y > 0) {
			System.out.println("1 사분면");
		} else if (x > 0 && y < 0) {
			System.out.println("4 사분면");
		} else if (x < 0 && y > 0) {
			System.out.println("2 사분면");
		} else if (x < 0 && y < 0) {
			System.out.println("3 사분면");
		} else {
			System.out.println("영점");
		}


		// else if 문을 중첩 if 문으로 변경

		if (x > 0) {
			if (y > 0) {
				System.out.println("1 사분면");
			} else if (y < 0) {
				System.out.println("4 사분면");
			}
		} else if (x < 0) {
			if (y > 0) {
				System.out.println("2 사분면");
			} else if (y < 0) {
				System.out.println("3 사분면");
			}
		}

	} // end of main

} // end of class
