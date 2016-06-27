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
		AccountService service = new AccountServiceImpl();
		BankService serv = new BankServiceImpl();
		AccountBean tempAcc = new AccountBean();
		String spec = "";
		String[] accou = new String[3];
		int ok = 0;
		while (true) {
			switch (JOptionPane.showInputDialog(null,""
					+ "================개인인터넷뱅킹=================\n"
					+ "1개설 2입금 3조회 4출금 5통장내역 \n"
					+ "================은행창구=======================\n"
					+ "11통장개설 12조회(전체) 13계좌번호조회 15전체통장수 6해지 0종료\n")) {
			case "1":
				spec = JOptionPane.showInputDialog("이름,ID,PW");
				accou = spec.split(",");
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
			case "11":
				spec = JOptionPane.showInputDialog("이름,ID,PW");
				accou = spec.split(",");
				AccountBean acc = new AccountBean();
				acc.setAccountNo();
				acc.setId(accou[1]);
				acc.setName(accou[0]);
				acc.setPw(accou[2]);
				serv.openAccount(acc);
				break;
			case "12":
				JOptionPane.showMessageDialog(null, serv.accountList().toString());
				break;
			case "13":
				tempAcc = serv.findByAccountNo(JOptionPane.showInputDialog("검색하려는 계좌번호"));
				JOptionPane.showMessageDialog(null, (tempAcc.getId() != null?tempAcc.getAccountNo()+" 계좌는 없습니다.":tempAcc.toString()));
				break;
			case "14":
				JOptionPane.showMessageDialog(null, serv.findByName(JOptionPane.showInputDialog("검색하려는 이름")));
				break;
			case "15":
				JOptionPane.showMessageDialog(null,serv.count() );
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
