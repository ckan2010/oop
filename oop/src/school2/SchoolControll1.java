/**
 * 
 */
package school2;

import javax.swing.JOptionPane;

import jdk.nashorn.internal.ir.Optimistic;

/**
 * @date   :2016. 6. 17.
 * @author :ckan
 * @file   :SchoolControll1.java
 * @story  :
 */
public class SchoolControll1 {
	public static void main(String[] args) { // String[] params
		StudentServiceImpl student = new StudentServiceImpl();
		while (true) {
			switch (JOptionPane.showInputDialog(null, "1 등록 2보기 3수정 4삭제 0종료")) {
			case "1":
				String open = JOptionPane.showInputDialog("이름,ID,PW,주민번호[800101-1]");
				String open1[] = open.split(",");
				student.openStudente(open1[0], open1[1], open1[2], open1[3]);
				break;
			case "2":
				JOptionPane.showMessageDialog(null, student.showStudente());
				break;
			case "3":
				String pw = student.updateStudente(JOptionPane.showInputDialog("PW"));
				JOptionPane.showMessageDialog(null, student.updateStudente(pw));
				break;
			case "4":
				String op = student.deleteStudente();
				JOptionPane.showMessageDialog(null, student.deleteStudente());
				break;
			case "0":
				return;
			default:
				break;
			}
		}
	}
}
