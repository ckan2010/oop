package matrix;

/**
 * @date   :2016. 6. 22.
 * @author :ckan
 * @file   :MatrixMul5.java
 * @story  :
 */
public class MatrixMul5 {
	public static void main(String[] args) {
		int[][] mtx = new int[5][5];
		int k = 0;
		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				k+=5;
				mtx[i][j] = k;
				System.out.print(mtx[i][j]+"\t");
			}
			System.out.println("");
		}
	}
}
