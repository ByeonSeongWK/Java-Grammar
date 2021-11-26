package tmp;

import java.util.Arrays;

// import문 2
public class MyMath {

	// 오름차순 정렬 메소드(버블 정렬)
	public static void sort(int arr[]) {
		int tmp = 0;

		for (int i = 1; i < arr.length; i++) { // 배열의 길이보다 1 작은 만큼 회전을 한다 i는 회전 수
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {		// arr[j]가 arr[j+1](바로 뒤의 값)보다 크다면 실행
					tmp = arr[j]; 				// tmp에는 arr[j]값을 넣어주고
					arr[j] = arr[j + 1];		// 빈 arr[j]의 자리에 arr[j+1]을 넣어준다.
					arr[j + 1] = tmp; 			// 빈 arr[j+1]의 자리엔 임시로 넣어둔 tmp를 넣는다.
				}	
			}
		}
	}

	// 내림차순 정렬 메소드(버블 정렬)
	public static void sortR(int arr[]) {
		int tmp = 0;
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] < arr[j + 1]) {		// arr[j]가 arr[j+1](바로 뒤의 값)보다 작다면 실행
					tmp = arr[j]; 				// tmp에는 arr[j]값을 넣어주고
					arr[j] = arr[j + 1];		// 빈 arr[j]의 자리에 arr[j+1]을 넣어준다.
					arr[j + 1] = tmp; 			// 빈 arr[j+1]의 자리엔 임시로 넣어둔 tmp를 넣는다.
				}
			}
		}
	}

	// 배열 역전 메소드
	public static void reverse(int arr[]) { // 참조형 타입(배열이 가지고 있는 주소)
		
		final int LENGTH = arr.length - 1;
		final int CYCLE = arr.length / 2;
		
		// 회전을 절반만 하지 않으면 다시 값이 바껴서 원래대로 돌아온다.
		for(int i = 0; i < CYCLE; i++) {
			// 임의에 공간에 하나의 값을 복사해서 넣어둔다.
			int tmp = arr[LENGTH - i];
			arr[LENGTH - i] = arr[i];
			arr[i] = tmp;
			
		}
	}

	// 최대값 반환하는 메소드
	public static int getMax(int arr[]) {

		int rs = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > rs)
				rs = arr[i];
		}
		return rs;
	}

	// 최소값 반환하는 메소드
	public static int getMin(int arr[]) {

		// 비교하는 숫자가 처음 오게 해줘야 한다. 아니면 0이 나옴.
		int rs = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < rs)
				rs = arr[i];
		}
		return rs;
	}
}
