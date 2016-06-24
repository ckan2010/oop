package collection;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import school2.Studente1Bean;
/**
 * @date   :2016. 6. 23.
 * @author :ckan
 * @file   :ListEx.java
 * @story  :
 */
public class VectorEx {
	public static void main(String[] args) {
		List<Studente1Bean> v = new ArrayList<Studente1Bean>();
		/** 
		 * 속성만 갔고있다 기능을 못함 다른 곳에서 객체를 만들고 담을때 속성을 담는 바구니
		 * Studente1Bean searchTest = null;
		 */
		Studente1Bean searchMan = new Studente1Bean();// 액션,기능은 할수 있고 
		Studente1Bean hong = new Studente1Bean("홍길동","hong","1","800101-1");
		Studente1Bean kim = new Studente1Bean("김유신","kim","2","940101-1");
		Studente1Bean lee = new Studente1Bean("이순신","lee","3","900101-1");
		v.add(hong);
		v.add(kim);
		v.add(lee);
		/**
		*System.out.println(searchTest.getName()); // nullpointer exception 발생 객체가 null
		*System.out.println(searchMan.getName()); // null 값이나옴 객체의 속성이 null
		*System.out.println(hong.getName()); // 실제값이 나옴
		**/
		String searchName = JOptionPane.showInputDialog("조회할 이름?");
		
		for (int i = 0; i < v.size(); i++) {
			if (v.get(i).getName().equals(searchName)) {
				searchMan = v.get(i);
			}
		}
		/*
		if (searchMan.getName() == null) {
			System.out.println(searchName+" 라는 이름은 없습니다.");
		} else {
			System.out.println(searchMan.toString());
		}*/
		if (!searchName.equals(searchMan.getName())) {
			System.out.println(searchName+" 라는 이름은 없습니다.");
		} else {
			System.out.println(searchMan.toString());
		}
		if (v.contains(searchMan)) {
			v.remove(v.indexOf(searchMan));
			System.out.println("존재함");
		}else{
			System.out.println("존재X");
		}
		System.out.println(v);// collection 은 tostring 쓰지않음
		System.out.println(v.size());
	}
}
