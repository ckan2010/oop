package phone;

/**
 * @date   :2016. 6. 22.
 * @author :ckan
 * @file   :AndroidPhone.java
 * @story  :
 */
public class AndroidPhone extends IPhone{
	public final static String BRAND = "갤럭시노트";
	private String size,data;
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getData() {
		return data;
	}
	public void setData(String call,String size,String data) {
		super.setCompany(BRAND);
		super.setPortable(true);
		super.setCall(call);
		this.setSize(size);
		this.data = KIND+" 이기 때문에 " +super.getMove()+", "+ super.getCompany() 
		+ " 제품을 가지고\n " +BRAND+" 으로 "+ super.getCall() + " (이)라고 통화하고\n"
		+ this.getSize()+" 인치 큰 화면을 통해서\n"
		+ "카톡으로 "+data+" 메시지 전달했다.";
	}
	@Override
	public String toString() {
		return getData();
	}
}
