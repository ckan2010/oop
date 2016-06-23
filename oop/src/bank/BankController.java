/**
 * 
 */
package bank;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

import global.MyConstants;

/**
 * @date   :2016. 6. 15.
 * @author :ckan
 * @file   :BankController.java
 * @story  :
 */
public class BankController {
	public static void main(String[] args) {
		AccountServiceImpl service = new AccountServiceImpl();
		int ok = 0;
		while (true) {
			switch (JOptionPane.showInputDialog(null,"1개설 2입금 3조회 4출금 5통장내역 6해지 0종료")) {
			case "1":
				String spec = JOptionPane.showInputDialog("이름,ID,PW");
				String accou[] = spec.split(",");
				service.openAccount(accou[0],accou[1],accou[2]);
				break;
			case "2":
				String inputMoney = JOptionPane.showInputDialog("입금액?");
				JOptionPane.showMessageDialog(null,service.deposit(Integer.parseInt(inputMoney)));
				break;
			case "3":
				// JOptionPane.showMessageDialog(null," 입금액 : "+service.findAccount());
				break;
			case "4":
				String output = JOptionPane.showInputDialog("출금액?");
				JOptionPane.showMessageDialog(null, service.withdrawal(Integer.parseInt(output)));
				break;
			case "5":
				JOptionPane.showMessageDialog(null, service.showAccount());
				break;
			case "6":
				service.deleteAccount();
				JOptionPane.showMessageDialog(null, "해지되었습니다.");
				break;
			default:
				ok = JOptionPane.showConfirmDialog(null, "종료할까요?");
				if (ok == 0){
				    return;
				} else {
					break;
				}
			}
		}
	}

}
