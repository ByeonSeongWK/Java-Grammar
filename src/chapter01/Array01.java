package chapter01;

import java.util.Arrays;
import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {

		// 배열
		// 같은 데이터타입의 여러 데이터를 하나로 관리

		// 배열 선언
		int[] iarr;

		// 배열 생성
		iarr = new int[5];

		// 배열 선언 및 생성
		short[] sarr = new short[3];

		iarr[0] = 1;
		iarr[1] = 2;
		iarr[2] = 3;
		iarr[3] = 4;
		iarr[4] = 5;

		System.out.println(iarr[0]);
		System.out.println(iarr[1]);
		System.out.println(iarr[2]);
		System.out.println(iarr[3]);
		System.out.println(iarr[4]);

		System.out.println("iarr 배열의 길이는 : " + iarr.length);

		char[] carr1 = new char[] { 'a', 'p', 'p', 'l', 'e' };
		char[] carr2 = { 'a', 'p', 'p', 'l', 'e' };

		System.out.println(carr1[4]);
		System.out.println(carr2[3]);

//		주소값이여서 안들어감. ↓
//		carr2 = {'p', 'r', 'i' , 'n', 't'};
		carr2[0] = 'p';
		carr2[1] = 'r';
		carr2[2] = 'i';
		carr2[3] = 'n';
		carr2[4] = 't';

		System.out.println(carr2);
		
//		for (데이터 타입 변수 = 초기값; 조건값 < 배열의 길이 ; 초기값 후위 증감)
		for (int i = 0; i < sarr.length; i++) {
			sarr[i] = (short) (i + 1);
		}

		for (int i = 0; i < sarr.length; i++) {
			System.out.print(sarr[i] + " ");
		}
//		  객체   .   기능
//		Arrays.toString(배열명); 

		System.out.println(Arrays.toString(sarr));

		// 5명의 국어 성적을 입력 받고 그 총합과 평균을 출력하시오.

		int[] korScores = new int[3];
		Scanner sc;

		for (int i = 0; i < korScores.length; i++) {
			sc = new Scanner(System.in);

			int score = sc.nextInt();
			korScores[i] = score;

		}
		// 크기순 정렬하기.(알고리즘에서 선택 정렬이라고 한다.) --> 분석 필수
		int tmp = -1, emp = 0;
		for (int i = 0; i < korScores.length - 1; i++) {
			emp = i;

			for (int j = i + 1; j < korScores.length; j++) {
				if (korScores[j] > korScores[emp])
					emp = j;
			}

			if (i != emp) {
				tmp = korScores[i];
				korScores[i] = korScores[emp];
				korScores[emp] = tmp;
			}
		}
		//////////////////////////////////////////////////////////
		int sum = 0;
		for (int i = 0; i < korScores.length; i++) {

			sum += korScores[i];
		}

		float avg = (float) sum / korScores.length;

		System.out.println(Arrays.toString(korScores));
		System.out.println("국어 성적의 총합은 : " + sum + "점 입니다.");
		System.out.println("국어 성적의 평균은 : " + avg + "점 입니다.");
	}

}
