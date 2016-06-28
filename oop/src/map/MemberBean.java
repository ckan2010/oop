package map;

/**
 * @date   :2016. 6. 28.
 * @author :ckan
 * @file   :MemberBean.java 
 * @story  :
 */
public class MemberBean {
	private String id,pw,name,gender;
    
	public MemberBean() {
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return global.MyConstants.SCHOOL_NAME+" [name= " + name +", id=" + id + ", pw=****, gender="+ gender + "]";
	}
	
	
}
