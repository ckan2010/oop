package map;

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
		MemberBean tempBean = new MemberBean();
		String memberInfo = "";
		String temp = "";
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
				String[] arrMember1  = memberInfo.split(",");
				MemberBean member1 = new MemberBean();
				member1.setId(arrMember1[0]);
				member1.setPw(arrMember1[1]);
				System.out.println("setId = "+arrMember1[0]);
				System.out.println("setPw = "+arrMember1[1]);
				JOptionPane.showMessageDialog(null, service.login(member1));
				break;
			case "3":
				member = service.detail();
				member.toString();
				break;
			case "4":
				MemberBean member2 = new MemberBean();
				service.updatePW(member2);
				break;
			case "5":
				service.delete();
				break;
			case "11":
				service.list();
				break;
			case "12":
				String serchId = JOptionPane.showInputDialog("검색 ID");
				tempBean = service.findById(serchId);
				JOptionPane.showMessageDialog(null, (tempBean.getId()==null)?serchId+" ID 가 존재하지 않습니다.":tempBean.toString());
				break;
			case "13":
				service.findByName(temp);
				break;
			case "14":
				service.findByGender(temp);
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
