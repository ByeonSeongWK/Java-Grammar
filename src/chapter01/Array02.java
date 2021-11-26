package chapter01;

import java.util.Arrays;
import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {

		// 2차원 배열 2칸 기준시
		// 배열의 요소에 배열이 담긴것 (1-1, 1-2, 1-3... 2-1, 2-2, 2-3...)
		// 1차원 배열은 값이 2차원 배열의 주소값이다.

		int[][] iaarr = new int[2][3];

		// 제이슨 형태와 같다.(자바스크립트)
		int[][] iaarr2 = { { 1, 2, 3 }, { 4, 5, 6 } };

		iaarr[0][0] = 1;
		iaarr[0][1] = 2;
		iaarr[0][2] = 3;

		iaarr[1][0] = 4;
		iaarr[1][1] = 5;
		iaarr[1][2] = 6;

		System.out.println(iaarr.length); // --> 길이는 2 이다.

		// 2차원 배열 접근(변경)
		// 1차원
		for (int i = 0; i < iaarr.length; i++) {
			// 2차원
			for (int j = 0; j < iaarr[i].length; j++) {
				iaarr[i][j] = 9;
			}
		}
		System.out.println(Arrays.toString(iaarr)); // --> 주소값이 나온다. 즉 배열 이름이다.

		// 2차원 배열 출력 방법
		System.out.println(Arrays.toString(iaarr[0]));
		System.out.println(Arrays.toString(iaarr[1]));

		// 국어 점수, 수학 점수, 영어 점수를 각각 총 4번씩 입력 받아서
		// 저장하고 각 과목점수에 평균을 출력 하시오.

		int[][] scores = new int[4][3];
		String[] names = new String[4];
		
		Scanner sc;

		for (int i = 0; i < scores.length; i++) {
			System.out.println((i + 1) + "번 째 국어, 수학 영어 점수를 입력하세요.");
			sc = new Scanner(System.in);
			
			for (int j = 0; j < scores[i].length; j++) {
				scores[i][j] = sc.nextInt();
			}

		}
//		int korAvg = 0;
//		int mathAvg = 0;
//		int engAvg = 0;
//		└를 배열로 요약해서 사용 가능 ↓
		int[] avgs = { 0, 0, 0 };
		// 순서 -> 0 : 국어, 1 : 수학, 2 : 영어

		for (int i = 0; i < avgs.length; i++) {
			for (int j = 0; j < scores.length; j++) {
				avgs[i] += scores[j][i];
			}
			avgs[i] /= scores.length;
		}
		
		System.out.println("국어 평균 : " + avgs[0]);
		System.out.println("수학 평균 : " + avgs[1]);
		System.out.println("영어 평균 : " + avgs[2]);
		
	}
}
