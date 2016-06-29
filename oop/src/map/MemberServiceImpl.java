package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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
			} else{
				result = "비밀번호가 틀립니다.";
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
		String result  = member.getId()+" ID가 존재하지 않습니다.";
		if(map.containsKey(session.getId())) {
			map.put(session.getId(), session);
			session.setPw(member.getPw());
			result = session.getId()+" 비밀번호가 변경 되었습니다.";
		} 	
		return result;
	}
	@Override
	public String delete() {
		String result = session.getId()+" ID 가 존재하지 않습니다.";
		if (map.containsKey(session.getId())) {
			map.remove(session.getId());
			session = null;
			result = "탈퇴했습니다.";
		} 		
		return result;
	}
	@Override
	public List<MemberBean> list() {
		List<MemberBean> entryList = new ArrayList<MemberBean>();
		for (Map.Entry<String, MemberBean> entry : map.entrySet()) {
			entryList.add((MemberBean) entry.getValue());
		}
		return entryList;
	}
	@Override
	public MemberBean findById(String id) {
		return map.get(id);
	}
	@Override
	public List<MemberBean> findByName(String name) {
		List<MemberBean> tempList = new ArrayList<MemberBean>();
		for (String key : map.keySet()) {
			if (name.equals(map.get(key).getName())) {
				tempList.add(map.get(key));
			}
		}
		return tempList;
	}
	@Override
	public int countByGender(String gender) {
		int count = 0;
		for (String key : map.keySet()) {
			if (gender.equals(map.get(key).getGender())) {
				count++;
			}
		}
		return count;
	}
	@Override
	public int count() {
		return map.size();
	}
}
