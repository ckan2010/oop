package collection;

import java.util.HashSet;
import java.util.Set;

import school2.Studente1Bean;

/**
 * @date   :2016. 6. 23.
 * @author :ckan
 * @file   :SetEx.java
 * @story  :
 */
public class HashSetEx {
	public static void main(String[] args) {
		String[] str = {"Java","Beans","Java","XML"};
		Set<Studente1Bean> stu = new HashSet<Studente1Bean>();
		Studente1Bean hong = new Studente1Bean("홍길동","hong","1","800101-1");
		Studente1Bean kim = new Studente1Bean("김유신","kim","2","940101-1");
		Studente1Bean lee = new Studente1Bean("이순신","lee","3","900101-1");
		stu.add(hong);
		stu.add(kim);
		stu.add(lee);
		System.out.println(stu.toString());
	}
}
