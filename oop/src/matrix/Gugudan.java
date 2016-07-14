package matrix;

/**
 * @date   :2016. 6. 22.
 * @author :ckan
 * @file   :Gugudan.java
 * @story  :
 */
public class Gugudan {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i=i+4) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
				System.out.print((i+1)+"*"+j+"="+(i+1)*j+"\t");
				System.out.print((i+2)+"*"+j+"="+(i+2)*j+"\t");
				System.out.print((i+3)+"*"+j+"="+(i+3)*j+"\t");
				System.out.println("");
			}
			System.out.println("");
		}
	}
}
