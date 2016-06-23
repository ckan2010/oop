/**
 * 
 */
package controller;

/**
 * @date :2016. 6. 14.
 * @author :ckan
 * @file :Grade.java
 * @story :
 */
public class Grade {
	public String grade(String inputName1,int inputAvg1
			,String inputName2,int inputAvg2
			,String inputName3,int inputAVg3){
		int    avg1=0,avg2=2,avg3=0,result1=0,result2=0,result3=0; 
		String name1="",name2="",name3="",
				   one="",two="",three="";
		name1 = inputName1;
		avg1 = inputAvg1;
		name2 = inputName2;
		avg2 = inputAvg2;
		name3 = inputName3;
		avg3 = inputAVg3;
		if(avg1 > avg2 && avg1 > avg3) {
			one = name1;
			result1 = avg1;
			if (avg2 > avg3 ) {
				two   = name2;
				result2 = avg2;
				three = name3;
				result3 = avg3;
			} else{
				two   = name3;
				result2 = avg3;
				three = name2;
				result3 = avg2;
			}
		} else if(avg2 > avg1 && avg2 > avg3) {
				one = name2;
				result1 = avg2;
				if (avg1 > avg3 ) {
					two   = name1;
					result2 = avg1;
					three = name3;
					result3 = avg3;
				} else{
					two   = name3;
					result2 = avg3;
					three = name1;
					result3 = avg1;
				}
			} else if(avg3 > avg1 && avg3 > avg2) {
					one = name3;
					result1 = avg3;
					if (avg1 > avg2 ) {
						two   = name1;
						result2 = avg1;
						three = name2;
						result3 = avg2;
					} else{
						two   = name2;
						result2 = avg2;
						three = name1;
						result3 = avg1;
					}
		} else {
	    	return "평균점수로 순위를 할수 없습니다.";
		}
	    return "===================================\n"
	    		+ "1등 "+one+" "+result1+" 점\n"
	    		+ "2등 "+two+"  "+result2+" 점\n"
	    		+ "3등 "+three+"  "+result3+" 점\n"
	    		+"===================================";
	}
}
