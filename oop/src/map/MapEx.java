package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @date   :2016. 6. 29.
 * @author :ckan
 * @file   :MapEx.java 
 * @story  :
 */
public class MapEx {
	public static void main(String[] args) {
		Map<String,Object>map = new HashMap<String,Object>();
		Phone note = new Phone();
		note.setFactory("삼성");
		note.setProduct("SM-N920F");
		note.setPrice(100);
		Phone iphone = new Phone();
		iphone.setFactory("애플");
		iphone.setProduct("iphone6plus");
		iphone.setPrice(110);
		Phone g5 = new Phone();
		g5.setFactory("LG");
		g5.setProduct("LG-H830");
		g5.setPrice(90);
		map.put("갤노트", note);
		map.put("아이폰", iphone);
		map.put("G5", g5);
		List<String> keyList = new ArrayList<String>();
		List<Phone> entryList = new ArrayList<Phone>();
		for (Map.Entry<String, Object> entry : map.entrySet()) {
			keyList.add(entry.getKey());
			entryList.add((Phone) entry.getValue());
		}
		System.out.println("키값목록 : "+keyList);
		System.out.println("엔트리값 : "+entryList);
	}
}
class Phone{
	private String factory;
	private String product;
	private int price;
	@Override
	public String toString() {
		return "명세서 [제조사=" + factory + ", 제품명=" + product + ", 가격=" + price + "]";
	}
	public String getFactory() {
		return factory;
	}
	public void setFactory(String factory) {
		this.factory = factory;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}