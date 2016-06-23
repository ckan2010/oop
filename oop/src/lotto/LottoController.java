package lotto;

import javax.swing.JOptionPane;

/**
 * @date   :2016. 6. 23.
 * @author :ckan
 * @file   :LottoController.java
 * @story  :
 */
public class LottoController {
	public static void main(String[] args) {
		while (true) {
			switch (JOptionPane.showInputDialog("1계속 0종료")) {
			case "1":
				
				break;
			case "0":
				
				return;
			default:
				return;
			}
		}
	}
}
