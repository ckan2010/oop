package collection;

import java.util.List;
import java.util.Vector;
import school2.Studente1Bean;
/**
 * @date   :2016. 6. 23.
 * @author :ckan
 * @file   :ListEx.java
 * @story  :
 */
public class VectorEx {
	public static void main(String[] args) {
		List<Studente1Bean> v = new Vector<Studente1Bean>();
		Studente1Bean hong = new Studente1Bean("홍길동","hong","1","800101-1");
		Studente1Bean kim = new Studente1Bean("김유신","kim","2","940101-1");
		Studente1Bean lee = new Studente1Bean("이순신","lee","3","900101-1");
		v.add(hong);
		v.add(kim);
		v.add(lee);
		System.out.println("::::::::::::::요소 추가후:::::::::::::::::");
		System.out.println("size : "+v.size());
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i).getName());
		}
		
	}
}
