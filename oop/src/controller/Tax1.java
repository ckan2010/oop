package controller;

import java.util.Scanner;

public class Tax1 {
	public String tax1(String inputName,int inputSal
			,double inputTax){
		int sal=0, money=0;
		double tax=0.0;
		String name="",fsal="",fmoney="";
		sal = inputSal;
		tax = inputTax;
		name = inputName;
		money = (int) (sal*tax);
		fsal = String.format("%,d",sal);
		fmoney = String.format("%,d",money);
		return "연봉 "+fsal+" 원을 받으시는 "+name+"님께서 납부할 세금은 "
				+ fmoney+" 원 입니다.";
	}
}
