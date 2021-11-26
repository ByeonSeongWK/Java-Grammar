package HomeWork;

public class CeilingValue {

	public static void main(String[] args) {

		int i, j, max;
		int[] data = { 20, 40, 42, 111, 4, 50, 5, 22, 60, 98 };
		j = 0;
		max = 0;

		for (i = 0; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
			do {

				j++;
			} while (j < 10);
		}
		System.out.println("최대값은 : " + max);

	}

}