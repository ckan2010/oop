/**
 * 
 */
package school2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import global.MyConstants;
/**
 * @date   :2016. 6. 17.
 * @author :ckan
 * @file   :Studente1.java
 * @story  :
 */
public class Studente1Bean {
	private String name,id,pw,ssn,regDate,gender;
	private int age,year,curyear;
	public Studente1Bean() {
		// default constructor 기본 생성자
		// 생성자 오버로딩 
	}
	public Studente1Bean(String name,String id,String pw,String ssn) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.ssn = ssn; 
		this.regDate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(System.currentTimeMillis()));
		this.curyear = Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date(System.currentTimeMillis())));
		String[] gendergubun = ssn.split("-");
		this.year = Integer.parseInt(gendergubun[0].substring(0,2));
		switch (Integer.parseInt(gendergubun[1])) {
		case 1:case 5:
			this.gender = "남";
			this.year += 1900;
			break;
		case 3:case 7:
			this.gender = "남";
			this.year += 2000;
			break;		
		case 2:case 6:
			this.gender = "여";
			this.year += 1900;
			break;
		case 4:case 8:
			this.gender = "여";
			this.year += 2000;
			break;
		default:
			break;
		}
		this.age = this.curyear - this.year + 1;
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
	public String getRegDate(){
		return this.regDate;
	}
	public String getGender(){
		return this.gender;
	}
	public int getAge(){
		return this.age;
	}
	public String toString() {
		return MyConstants.SCHOOL_NAME+" [ 성명=" + name + ", 아이디=" + id + ", 비번=****" + ", 주민번호=" + ssn + ", 등록일=" + regDate
				+ ", 성별=" + gender + ", 나이=" + age + "]";
	}
	
	
}
