/**
 * 
 */
package school;

import javax.swing.JOptionPane;

/**
 * @date :2016. 6. 16.
 * @author :ckan
 * @file :SchoolControll.java
 * @story : 1. 등록 ssn,아이디,비번,이름 2. 조회 홍길동,아이디,남
 */
public class SchoolControll {
	public static void main(String[] args) {
		Studente studente = null;
		int ok = 0;
		while (true) {
			switch (JOptionPane.showInputDialog("1.등록 2.조회 0.종료")) {
			case "1":
				String id = JOptionPane.showInputDialog("ID");
				String pw = JOptionPane.showInputDialog("PW");
				String name = JOptionPane.showInputDialog("이름");
				String ssn = JOptionPane.showInputDialog("주민번호[800101-1]");
				studente = new Studente(id, name, ssn);
				studente.setPw(pw);
				break;
			case "2":
				JOptionPane.showMessageDialog(null, studente.SCHOOL_NAME + ","
						+ studente.getName() + ","
						+ studente.getId() + "," 
						+ studente.getGender() + ","
						+ studente.getRegDate() + ","
						+ studente.getAge()
						);
				break;
			default:
				JOptionPane.showConfirmDialog(null, "종료할까요?");
				if (ok == 0) {
					return;
				} else {
					break;
				}

			}
		}
	}
}
