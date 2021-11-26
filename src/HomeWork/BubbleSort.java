package HomeWork;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int n, i, j, k;
		int[] data = {20, 40, 42, 50, 111, 50, 5, 22, 60, 98 };
		
		n = 0;
		System.out.println("정렬 전 : " + Arrays.toString(data));
		System.out.println("-----------"
				+ "---------------------------------------");
		
		do {
			n++;

			for (i = 1; i < data.length - 1; i++) {
				for (j = 0; j < data.length - i; j++) {
					if (data[j] > data[j + 1]) {
						k = data[j];
						data[j] = data[j + 1];
						data[j + 1] = k;
					}
				}
			}

		} while (n < 10);
		System.out.println("정렬 후 : " + Arrays.toString(data));
	}
}