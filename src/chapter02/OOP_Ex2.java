package chapter02;

import java.util.Arrays;

import tmp.MyMath;

public class OOP_Ex2 {

	public static void main(String[] args) {
		
		int[] arr = {9, 8 , 7, 2, 3, 7};
		MyMath.sort(arr);
		System.out.println("오름 차순 정렬 : " + Arrays.toString(arr));
		
		MyMath.sortR(arr);
		System.out.println("내림 차순 정렬 : " + Arrays.toString(arr));
		
		int[] arr2 = {2, 55, 100, 7, 32, 1001};
		MyMath.reverse(arr2);
		System.out.println("배열 역순 정렬 : " + Arrays.toString(arr2));
		
	}
	
}