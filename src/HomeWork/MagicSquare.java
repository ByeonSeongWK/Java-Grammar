package HomeWork;

import java.util.Arrays;

public class MagicSquare {

	public static void main(String[] args) {

		final int ROW = 5, COL = 5;
		
		int i, j, k, nmg;
		int[][] data = new int[5][5];

		i = 0;
		j = 5 / 2;

		for (k = 1; k <= ROW * COL; k++) {
			data[i][j] = k;
			nmg = k % ROW;

			if (nmg == 0) {
				i++;
				continue;
			}

//			if (nmg != 0) {
//				i--;
//				j++;
//			}
//			↓ 코드 쭐이기 / nmg != 0 이 아닐땐 i, j 가 --, ++ 되서 연산됨.
			
			if (--i < 0) i = ROW - 1;
			if (++j > COL - 1) j = 0;

		}

		for (i = 0; i < ROW; i++) {
			System.out.println(Arrays.toString(data[i]));
		}
	}

}
