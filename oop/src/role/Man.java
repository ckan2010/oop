package role;

/**
 * @date   :2016. 6. 22.
 * @author :ckan
 * @file   :Man.java
 * @story  :
 */
public class Man implements Human{
	@Override
	public void role() {
		System.out.println("남자의 역할");
	}
	public void worry(){
		System.out.println("아버지의 고민");
	}
}
