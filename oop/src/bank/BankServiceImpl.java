package bank;

import java.util.ArrayList;
import java.util.List;

/**
 * @date   :2016. 6. 27.
 * @author :ckan
 * @file   :BankServiceImpl.java 
 * @story  :
 */
public class BankServiceImpl implements BankService{
	// AccountBean[] arr = new AccountBean[15];
	List<AccountBean> list;
	public BankServiceImpl() {
		list = new ArrayList<AccountBean>();
	}
	public void openAccount(AccountBean account) {
		// 11개설(은행창구개설)
		list.add(account);
	}
	public List<AccountBean> accountList() {
		// return list.toString();
		return list;
	}
	public AccountBean findByAccountNo(String accountNo) {
		AccountBean accout = new AccountBean();
		int i = 0;
		for (; i < list.size(); i++) {
			if (String.valueOf(list.get(i).getAccountNo()).equals(accountNo)) {
				accout = list.get(i);
				break;
			}
		}
		/*
		for (int i = 0; i < list.size(); i++) {
			if (String.valueOf(list.get(i).getAccountNo()).equals(AccountNo)) {
				accout = list.get(i);
				break;
			}
		}
		if (!AccountNo.equals(Integer.toString(accout.getAccountNo()))) {
			return AccountNo+" 계좌는 없습니다.";
		} else {
			return accout.toString();
		}
		
		String result = AccountNo+" 계좌는 없습니다.";
		int i = 0;
		for (; i < list.size(); i++) {
			if (String.valueOf(list.get(i).getAccountNo()).equals(AccountNo)) {
				result = list.get(i).toString();
				break;
			}
		}
		return result;
		*/
		return accout;
	}
	public List<AccountBean> findByName(String name) {
		List<AccountBean> tempList = new ArrayList<AccountBean>();
		int i = 0;
		for (; i < list.size(); i++) {
			if (list.get(i).getName().equals(name)) {
				tempList.add(list.get(i));
			}
		}
		return tempList;
	}
	public String count() {
		// 15계좌수
		return "전체통장 갯수 : "+list.size();
		
	}
	public void updateAccount() {
		// TODO Auto-generated method stub
		
	}
	public String deleteAccount(String accNo) {
		// 17 삭제
		AccountBean tempAcc = this.findByAccountNo(accNo);
		String result = accNo+" 계좌가 없습니다.";
		int i = 0;
		if (!tempAcc.getId().equals("")) {
			for (; i < list.size(); i++) {
				if (String.valueOf(list.get(i).getAccountNo()).equals(accNo)) {
					list.remove(i);
					result = accNo+" 계좌가 해지되었습니다.";
					break;
				}
			}
		}
		return result;
	}

}
