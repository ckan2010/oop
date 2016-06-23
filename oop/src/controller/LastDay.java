/**
 * 
 */
package controller;

/**
 * @date   :2016. 6. 14.
 * @author :ckan
 * @file   :LastDay.java
 * @story  :
 */
public class LastDay {
	public String lastday(int inputYear, int inputMonth){
		int year = 0, month = 0,monthlastday = 0;
		year = inputYear;
		month = inputMonth;
		switch (month) {
		case 1: case 3:case 5:case 7:case 8:case 10:case 12:
			monthlastday = 31;
			break;
		case 4:case 6:case 9:case 11:
			monthlastday = 30;
			break;	
		case 2:
			monthlastday = year%4 == 0 && year%100 != 0 || year%400 == 0?29:28;
			break;
		default:
			return "년월 입력이 잘못되었습니다.";
		}
		return year+" 년 "+month+" 월 "+monthlastday+ "일 ";
	}
}
