/**
 * 
 */
package school;

import java.util.Calendar;

/**
 * @date   :2016. 6. 16.
 * @author :ckan
 * @file   :Studente.java
 * @story  :
 * iv : string id, pw,gendoer,name,regDate,ssn
 *      int age
 */
public class Studente {
	public final static String SCHOOL_NAME = "한빛학원";
	private String id,pw,gender,name,regDate,ssn;
	private int age,year;
	 Calendar date = Calendar.getInstance();
	 
	public Studente(String id,String name,String ssn){
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		year=0;
		year = Integer.parseInt(ssn.substring(0, 2));
		char gendergubun = ssn.charAt(7);		
		if (gendergubun%2 == 1) {
			this.gender = "남";
		} else {
			this.gender = "여";
		}
		this.regDate = new java.text.SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date());
		switch (gendergubun) {
		case '1':
			year += 1900;
			break;
		case '2':
			year += 1900;
			break;
		case '3':
			year += 2000;
			break;
		case '4':
			year += 2000;
			break;
		case '5':
			year += 1900;
			break;
		case '6':
			year += 1900;
			break;
		case '7':
			year += 2000;
			break;
		case 8:
			year += 2000;
			break;
		default:
			break;
		}
		this.age = (date.get(Calendar.YEAR)) - year + 1;
	}
	public void setPw(String pw){
		this.pw = pw;
	}
	public String getName(){
		return this.name;
	}
	public String getId(){
		return this.id;
	}
	public String getGender(){
		return this.gender;
	}
	public String getRegDate(){
		return this.regDate;
	}
	public int getAge(){
		return this.age;
	}
}
