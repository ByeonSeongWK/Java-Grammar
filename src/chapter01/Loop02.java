package chapter01;

import java.util.Scanner;

public class Loop02 {

	public static void main(String[] args) {

		// while 반복문
		// 특정조건이 올때까지 반복, 횟수가 정해지지 않았을 때 반복 사용
		// while (조건) { ... }
		// 조건에 논리 자체가 온다.
		// 조건에 true, false, 리터럴 결과 값이 true나 false가 되는 것이 와야한다.
		
		// while문 실수 조심
		// 1. 초기화 하지 않는 것.
		// 2. 조건 컨트롤 하지 않으면 무한루프에 빠진다.(탈출값 입력)

		/*
		 * for문은 무조건 i가 1씩 증감(i++)해야 한다. 하지만 while은 증감식을 조절해 줄 수 있다.
		 * 
		 * for문은 맨 마지막에 작업을 해야하는데. while은 작업을 할 위치를 정해줄 수 있다.
		 */
//		↓ for(int i = 0; i < 10; i++) {} 을 while 문으로 바꿀시
		int i = 0;
		while (i < 10) {
			// 내용
			i++;
		}

		// 연산을 하고 나면 저장할 공간이 필요하다.
		// 그럴때 변수를 항상 선언해서 공간을 만들어둔다.

		int sum = 0;
		i = 0;

		// [while문 사용]
		while (i < 15) {
			sum += ++i;
		}
		System.out.println(sum);
		System.out.println("-------------");

		boolean flag = false;
		
		/*
		//          ↓ 멈추는 조건을 넣기 때문에 반대값을 넣는 !(부정연산자) 를 앞에 붙인다.
		while (!flag) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();

			if (n > 0)
				System.out.println("입력한 값은 " + n + " 입니다.");
			else
				flag = true;
		}
		System.out.println("-------------");

		i = 0;
		while (i < 10) {
			System.out.println("while 실행문");
			i++;
		}
		*/
		
		// {}(중괄호) : { 중괄호 안이 하나다. } // 블록 형태
		// ;(세미 콜론) : 안 붙은 곳부터 붙은 곳 까지 하나다. ; // 문장 형태
		
		// [do - while 반복문]
		// 무조건 1번 이상은 반복문을 실행해야할 때 사용.
		// do { 반복 실행문 } while ( 조건 );  <-- 세미콜론!
		// 조건에 사용될 변수를 가져오기 위해 사용하는 경우도 있다.
		do {
			System.out.println("반복 실행문");
		} while (false);
		
		int a = 1;
		while(a < 100) {
			
			// [break 문]
			if(a < 1) {
				System.out.println(a + " 는 0이하 입니다.");
				break;
			}
			
			// [continue  문]
			// 3의 배수를 구하는 공식
			if(a % 3 != 0) {
				a++; // continue문을 만나기 전에 증감을 해줘야 한다.// 만나면 바로 조건식으로 돌아가기 때문에.
				continue;
			}
			System.out.println(a + " 는 3의 배수입니다.");
			
			a++;
		}
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			sc = new Scanner(System.in);
			int n = sc.nextInt();
			
//			[break]
//			프로그램 종료시
			if(n == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
//			[continue]
//			원치 않는 값을 얻었을시 즉시 처음으로 되돌아감.(메뉴판에 없는 메뉴를 고를때 다시 입력 받겠다)
			if(n < 0) {
				System.out.println("1이상의 양의 정수를 입력하세요.");
				continue;
			}
			System.out.println("입력한 값은 : " + n);
		}
		
		

	} // end of main

}
