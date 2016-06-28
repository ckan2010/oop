package map;

import java.util.List;

/**
 * @date   :2016. 6. 28.
 * @author :ckan
 * @file   :MemeberService.java 
 * @story  :
 */
public interface MemeberService {
	public abstract String join(MemberBean member);
	public String login(MemberBean member);
	public MemberBean detail();
	public String updatePW(MemberBean member);
	public String delete();
	public List<MemberBean> list();
	public MemberBean findById(String id);
	public List<MemberBean> findByName(String name);
	public List<MemberBean> findByGender(String gender);
	public int count();
}
