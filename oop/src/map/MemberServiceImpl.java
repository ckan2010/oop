package map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @date   :2016. 6. 28.
 * @author :ckan
 * @file   :MemberServiceImpl.java 
 * @story  :
 */
public class MemberServiceImpl implements MemeberService{
	Map<String,MemberBean> map;
	MemberBean session;
	public MemberServiceImpl() {
		map = new HashMap<String,MemberBean>();
	}
	public String join(MemberBean member) {
		// 1회원가입
		return (map.containsKey(member.getId()))?member.getId()+" 은 이미 존재하는 ID 입니다.":success(member);
	}
	private String success(MemberBean member){
		map.put(member.getId(), member);
		return member.getName()+" 님 회원가입이 완료되었습니다.";
	}
	@Override
	public String login(MemberBean member) {
		String result = "ID가 존재하지 않습니다.";
		if (map.containsKey(member.getId())) {
			if (findById(member.getId()).getPw().equals(member.getPw())) {
				result = map.get(member.getId()).getName()+" 님 안녕하세요.";
				session = findById(member.getId());
			} 
		} 
		return result;
	}
	@Override
	public MemberBean detail() {
		return session;
	}
	@Override
	public String updatePW(MemberBean member) {
		return "";
	}
	@Override
	public String delete() {
		return "";
	}
	@Override
	public List<MemberBean> list() {
		return null;
	}
	@Override
	public MemberBean findById(String id) {
		return map.get(id);
	}
	@Override
	public List<MemberBean> findByName(String name) {
		return null;
	}
	@Override
	public List<MemberBean> findByGender(String gender) {
		return null;
	}
	@Override
	public int count() {
		return map.size();
	}
}
