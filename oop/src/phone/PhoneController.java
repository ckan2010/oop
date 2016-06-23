package phone;

import javax.swing.JOptionPane;

/**
 * @date   :2016. 6. 22.
 * @author :ckan
 * @file   :PhoneController.java
 * @story  :
 */
public class PhoneController {
	public static void main(String[] args) {
		Phone phone = new Phone();
		CelPhone celPhone = new CelPhone();
		IPhone   iPhone = new IPhone();
		AndroidPhone androidPhone = new AndroidPhone();
		while (true) {
			switch (JOptionPane.showInputDialog("1유선폰 2휴대폰 3아이폰 4겔럭시노트 0종료")) {
			case "1":
				phone.setCompany(JOptionPane.showInputDialog("어느회사제품?"));
				phone.setCall(JOptionPane.showInputDialog("통화내용"));
				JOptionPane.showMessageDialog(null, phone.toString());
				break;
			case "2":
				celPhone.setCompany(JOptionPane.showInputDialog("어느회사제품?"));
				celPhone.setCall(JOptionPane.showInputDialog("통화내용"));
				celPhone.setPortable(true); // 이동가능하다
				JOptionPane.showMessageDialog(null, celPhone.toString());
				break;
			case "3":
				iPhone.setCompany(JOptionPane.showInputDialog("어느회사제품?"));
				iPhone.setCall(JOptionPane.showInputDialog("통화내용"));
				iPhone.setData(JOptionPane.showInputDialog("문자내용"));
				iPhone.setPortable(true); // 이동가능하다
				JOptionPane.showMessageDialog(null, iPhone.toString());
				break;
			case "4":
				;
				androidPhone.setData(JOptionPane.showInputDialog("통화내용"), 
						JOptionPane.showInputDialog("사이즈"), 
						JOptionPane.showInputDialog("카톡내용"));
				JOptionPane.showMessageDialog(null, androidPhone.toString());
				break;
			case "0":return;
			default:
				break;
			}
		}
	}
}
