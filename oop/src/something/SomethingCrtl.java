/**
 * 
 */
package something;

import javax.swing.JOptionPane;

/**
 * @date   :2016. 6. 17.
 * @author :ckan
 * @file   :Something.java
 * @story  :
 */
public class SomethingCrtl {
	public static void main(String[] args) {
		Something some = null;
		while (true) {
			switch (JOptionPane.showInputDialog("1등록 2조회 0종료")) {
			case "1":
				String a = JOptionPane.showInputDialog("aaa");
				String b = JOptionPane.showInputDialog("bbb");
				String c = JOptionPane.showInputDialog("ccc");
				String d = JOptionPane.showInputDialog("ddd");
				some = new Something(a,b,Integer.parseInt(c),Integer.parseInt(d));
				break;
			case "2":
				JOptionPane.showMessageDialog(null, "aaa : "+some.getAaa()
				+" bbb : "+some.getBbb()+" ccc : "+some.getCcc()+" ddd : "+some.getDdd());
				break;
			default:
				return;
			}
		}
	}
}
