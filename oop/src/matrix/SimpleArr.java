package matrix;

/**
 * @date   :2016. 6. 22.
 * @author :ckan
 * @file   :Matrix5.java
 * @story  :
 */
public class SimpleArr {
	public static void main(String[] args) {
		int[][] a = new int[2][5];
		for (int i = 0; i < a.length; i++) {
			for (int j =0; j < a.length; j++) {
				System.out.println(a[i][j]);
			}
			System.out.println("");
		}
	}
}
