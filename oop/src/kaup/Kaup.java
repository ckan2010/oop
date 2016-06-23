/**
 * 
 */
package kaup;

import java.util.Scanner;

/**
 * @date   :2016. 6. 10.
 * @author :ckan
 * @file   :Kaup2.java
 * @story  :카우푸지수 구하는 프로그램
 */
public class Kaup {
	String name,height,weight;
	
	public void setName(String name){ // Write
		this.name = name;
	}
	public void setHeight(String height){
		this.height = height;
	}
	public void setWeight(String weight){
		this.weight = weight;
	}
	public String getName(){
		return this.name;
	}
	public String getHeight(){
		return this.height;
	}
	public String getWeight(){
		return this.weight;
	}
	/**
	 * 개발자님 BMI 지수가 너무 길어요.
	 * 소수점 이하 2자리에서 끊어 주세요.
	 * 그래야 보기 좋습니다.
	 */
	public  String execute() {
		//----- init ------------------------------
		String result="";
		double bmigisu=0.0,height=Double.parseDouble(this.height),weight=Double.parseDouble(this.weight);
		//----------- 수식--------------------------
		bmigisu = weight/(height/100)/(height/100);
		
		if (bmigisu < 18.5) {
			result = "저체중";
		} else if (bmigisu >= 18.5 && bmigisu <= 22.9) {
			result = "정상체중";
		} else if (bmigisu >= 23.0 && bmigisu <= 24.9 ) {
			result = "과체중(위험체중)";	
		} else if (bmigisu >= 25.0 && bmigisu <= 29.9) {
			result = "과체중(비만 1단계)";
		} else if (bmigisu >= 30.0 && bmigisu <= 39.9) {
			result = "과체중(비만 2단계)";
		} else if (bmigisu >= 40.0) {
			result = "과체중(비만 3단계)";
		} else {
			return name+" 님 BMI 지수 구하기 오류입니다.";
		}
		return name+" 은 BMI 지수는 "
		+String.format("%.2f", bmigisu)+" 이고,"
		+ " "+result+" 이다 ";
	}

}
