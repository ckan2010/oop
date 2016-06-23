/**
 * 
 */
package controller;

/**
 * @date   :2016. 6. 14.
 * @author :ckan
 * @file   :Kaup.java
 * @story  :
 */
public class Kaup {
	public String kaup(String inputName,double inputHeight,double inputWeight){
		double bmigisu = 0.0;
		String kaupu = "";
		String name = inputName;
		double height = inputHeight;
		double weight = inputWeight;
		bmigisu = weight/(height/100)/(height/100);
		if (bmigisu < 18.5) {
			kaupu = "저체중";
		} else if (bmigisu >= 18.5 && bmigisu <= 22.9) {
			kaupu = "정상체중";
		} else if (bmigisu >= 23.0 && bmigisu <= 24.9 ) {
			kaupu = "과체중(위험체중)";	
		} else if (bmigisu >= 25.0 && bmigisu <= 29.9) {
			kaupu = "과체중(비만 1단계)";
		} else if (bmigisu >= 30.0 && bmigisu <= 39.9) {
			kaupu = "과체중(비만 2단계)";
		} else if (bmigisu >= 40.0) {
			kaupu = "과체중(비만 3단계)";
		} else {
			return name+" 님 BMI 지수 구하기 오류입니다.";
		}
		return name+" 은 BMI 지수는 "+ (int)(bmigisu * 100) / 100.0 +" 이고 "+kaupu+" 이다";
	}

}
