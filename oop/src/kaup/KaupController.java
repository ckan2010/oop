/**
 * 
 */
package kaup;

import java.util.Scanner;

import javax.swing.JOptionPane;

import jdk.nashorn.internal.ir.WhileNode;

/**
 * @date   :2016. 6. 15.
 * @author :ckan
 * @file   :KaupController.java
 * @story  :
 */
public class KaupController {
	
	public static void main(String[] args) {
		Kaup k = new Kaup();
		while (true) {
			switch (JOptionPane.showInputDialog("1:실행 0:종료")) {
			case "1":
				String name = JOptionPane.showInputDialog("이름");
				String hegiht = JOptionPane.showInputDialog("키");
				String wegiht = JOptionPane.showInputDialog("몸무게");
				k.setName(name);
				k.setHeight(hegiht);
				k.setWeight(wegiht);
				JOptionPane.showMessageDialog(null, k.execute());
				break;
			default:
				JOptionPane.showConfirmDialog(null, "종료 할까요?");
				return;
			}
		}
	}
}
