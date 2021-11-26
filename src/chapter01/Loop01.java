package chapter01;

import java.util.Scanner;

public class Loop01 {

	public static void main(String[] args) {

		// for 반복문
		// 특정 횟수만큼 반복시키고자 할때 자주 사용된다.

		// for(초기값; 조건문; 증감식) { 반복할 문장 }

//		System.out.println("1번째 문장");
//		System.out.println("2번째 문장");
//		System.out.println("3번째 문장");
//		System.out.println("4번째 문장");
//		System.out.println("5번째 문장");
//		System.out.println("6번째 문장");
//		System.out.println("7번째 문장");
//		System.out.println("8번째 문장");
//		System.out.println("9번째 문장");
//		System.out.println("10번째 문장");		
//		위의 내용을 간단하게 for 반복문으로 출력 가능. ↓

		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + "번째 문장");
		}

		System.out.println("----------------");

		int i;
		// 1. i 를 초기화 해준다.
		// 2. i < 10 을 검사 후 true면 실행.
		// 3. 반복문이 모두 끝나면 i 를 후위 증감한다.
		// 4. i < 10 이 false가 나오면 for 반복문을 종료한다.
		for (i = 0; i < 10; i++) {
			System.out.println(i + " " + (i < 10));
		}

		System.out.println(i + " " + (i < 10));

		System.out.println("----------------");

		// 1 ~ 15 까지의 합 ( 1 + 2 + 3 + ~ + 14 + 15 ) 등차수열

		int sum1 = 0;

		for (i = 1; i <= 15; i++) {
			sum1 += i;
		}

		System.out.println(sum1);

		// 1부터 300까지의 3의 제곱 값들의 합 (1 + 3 + 9 + 27)

		int sum2 = 0;
		for (int j = 1; j <= 300; j *= 3) {
			sum2 += j;
		}

		System.out.println(sum2);

		// [for문]
		// *을 출력
		// 정수를 입력받아서 입력 받은 정수 만큼의 세로를 가지는 *을 출력.

		Scanner sc = new Scanner(System.in);

		int star = sc.nextInt();

		for (int s = 0; s < star; s++) {
			System.out.println("*");
		}
		System.out.println("별의 개수는 : " + star);
		System.out.println("----------------");

		// [중첩 for문]
		// *을 출력
		// 정수를 입력받아서 입력 받은 정수 만큼의 가로 세로를 가지는 * 정사각형

		for (int j = 0; j < star; j++) {

			for (int k = 0; k < star; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("별의 개수는 : " + star * star);
		System.out.println("----------------");

		for (int j = 1; j <= star; j++) {

			for (int k = 0; k < j; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("----------------");

		// 정수를 입력 받아서 입력 받은 정수만큼의 가로 세로를 가지는 * 역삼각형

		for (int j = 0; j < star; j++) {

			for (int k = 0; k < (star - j); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 2 번문제
		int cnt =0;
		for (int j = 0; j < star; j++) {
			if(j%7==0) {
				cnt++;
			}
		}System.out.println(cnt);
		// 3 번 문제
		//
		// 45678 반전 87654
		Scanner sc1 = new Scanner(System.in);
		int n = sc1.nextInt();
		
		while(n != 0) {
			int a = n%10;
			System.out.print(a);
			n /= 10;
		}
	} // end of main

}
