package controller;

public class Gender {
	public String gender(String inputName,String inputSsid){
		String name="",jumin="",gender="여";
		name = inputName;
		jumin = inputSsid;
		char gendergubun = jumin.charAt(7);
		if (gendergubun == '0' || gendergubun == '9') {
			return "남여 구분은 0,9는 없습니다. ";
		}
		if (gendergubun%2 == 1) {
			gender = "남";
		}
		return name+"("+gender+")";
	}
}
