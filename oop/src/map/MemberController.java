package map;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/**
 * @date   :2016. 6. 28.
 * @author :ckan
 * @file   :MemberController.java 
 * @story  :
 */
public class MemberController {
	public static void main(String[] args) {
		MemeberService service = new MemberServiceImpl();
		String memberInfo = "";
		while (true) {
			switch (JOptionPane.showInputDialog(""
					+ "---- 회원이 보는 화면 ---\n"
					+ "1회원가입 2로그인 3내정보보기(detail) 4내정보수정(비번) 5탈퇴 0종료\n"
					+ "--- 관리자 화면 ---\n"
					+ "11회원등록 12검색(ID) 13검색(이름) 14검색(성별) 15회원수")) {
			case "1":
				MemberBean member = new MemberBean();
				memberInfo = JOptionPane.showInputDialog("이름,아이디,비번,성별 입력");
				String[] arrMember  = memberInfo.split(",");
				member.setName(arrMember[0]);
				member.setId(arrMember[1]);
				member.setPw(arrMember[2]);
				member.setGender(arrMember[3]);
				JOptionPane.showMessageDialog(null, service.join(member));
				break;
			case "2":
				memberInfo = JOptionPane.showInputDialog("아이디,비번 입력");
				String[] arr2 = memberInfo.split(",");
				MemberBean member2 = new MemberBean();
				member2.setId(arr2[0]);
				member2.setPw(arr2[1]);
				JOptionPane.showMessageDialog(null, service.login(member2));
				break;
			case "3":
				JOptionPane.showMessageDialog(null, service.detail());
				break;
			case "4":
				MemberBean member3 = new MemberBean();
				member3.setPw(JOptionPane.showInputDialog("변경비번 입력"));
				JOptionPane.showMessageDialog(null, service.updatePW(member3));
				break;
			case "5":
				JOptionPane.showMessageDialog(null, service.delete());
				break;
			case "11":
				JOptionPane.showMessageDialog(null,service.list());
				break;
			case "12":
				String serchId = JOptionPane.showInputDialog("검색 ID");
				MemberBean tempBean = new MemberBean();
				tempBean = service.findById(serchId);
				JOptionPane.showMessageDialog(null, (tempBean.getId()==null)?serchId+" ID 가 존재하지 않습니다.":tempBean.toString());
				break;
			case "13":
				JOptionPane.showMessageDialog(null, service.findByName(JOptionPane.showInputDialog("검색 이름")));
				break;
			case "14":
				String tempGender = JOptionPane.showInputDialog("남/여 몇명 인지 조회");
				JOptionPane.showMessageDialog(null, tempGender+" 은 "+service.countByGender(tempGender)+" 명 입니다.");
				break;
			case "15":
				service.count();
				break;
			case "0":
				return;
			default:
				return;
			}
		}
	}
}
