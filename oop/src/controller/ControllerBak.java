/**
 * 
 */
package controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @date   :2016. 6. 14.
 * @author :ckan
 * @file   :Controller.java
 * @story  :
 */
public class ControllerBak {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String menu = "";
		int i = 0,j = 0,studCount = 0;
		Calc calc = new Calc();
		Kaup kaup = new Kaup();
		LastDay lastDay = new LastDay();
		Grade grade = new Grade();
		Hakbun hakbun = new Hakbun();
		MaxMin maxmin = new MaxMin();
		Tax1 tax1 = new Tax1();
		Gender gender = new Gender();
		TimeCalc timecalc = new TimeCalc();
		while (true) {
			menu = JOptionPane.showInputDialog("1.계산기 "
					+ "2.카우프구하기 "
					+ "3.년월말 "
					+ "4.1등구하기"
					+ "5.학번/나이"
					+ "6.최고최저점수"
					+ "7.세금액"
					+ "8.성별판별"
					+ "9.시분초구하기"
					+ "0.종료");
			switch (menu) {
			case "1":
				System.out.print("첫번째 숫자 : ");
				System.out.print("연산자 : ");
				System.out.print("두번째 숫자 : ");
				System.out.println(calc.execute(s.nextInt(), 
						s.next(), s.nextInt()));
				break;
			case "2":
				System.out.println("이름,키,몸무게 ?");
				System.out.println(kaup.kaup(s.next(), 
						s.nextDouble(), s.nextDouble()));
				break;
			case "3":
				System.out.println("년을 입력 하세요(예)2016 : ");
				System.out.println("월 입력 하세요(예)2 : ");
				System.out.println(lastDay.lastday(s.nextInt(), s.nextInt()));
				break;
			case "4":
				System.out.println("3명 이름,점수 입력 : ");
				System.out.println(grade.grade(s.next(), s.nextInt()
						, s.next(), s.nextInt(), s.next(), s.nextInt()));
				break;
			case "5":
				System.out.println("학생 수가 몇명입니까? ");
				studCount = s.nextInt();
				System.out.println(studCount + " 명의 이름,나이를 입력하세요 ");
				String inputStudunte[] = new String[studCount];
				int inputAge[] = new int[studCount];
				int inputId[] = new int[studCount];

				for (; i < inputStudunte.length; i++) {
					j++;
		            inputId[i] = j;
					inputStudunte[i] = s.next();
					inputAge[i] = s.nextInt();
				}
				System.out.println("===================================");
				System.out.println("학번 | 이름 | 나이 ");
				i=0;
				for (; i < inputId.length; i++) {
					System.out.println(hakbun.hakbun(inputStudunte[i], inputAge[i], inputId[i]));
				}
				System.out.println("===================================");
				break;
			case "6":
				i = 0;
				System.out.println("학생수를 입력 하세요 ");
				int inputScore[] = new int[s.nextInt()];
				System.out.println("학생 점수 를 입력 하세요 ");
				for (; i < inputScore.length; i++) {
					inputScore[i] = s.nextInt();
					
				}
				System.out.println(maxmin.excute(inputScore));
				break;
			case "7":
				System.out.println("이름을 입력해 주세요 : [ ]");
				System.out.println("월급을 입력해 주세요 : [ ]");
				System.out.println("세율을 입력해 주세요 : [ ]");
				System.out.println(tax1.tax1(s.next(), s.nextInt(), s.nextDouble()));
				break;
			case "8":
				System.out.println("성명 : ");
				System.out.println("주민번호 [예 xxxxxx-x] : ");
				System.out.println(gender.gender(s.next(), s.next()));
				break;
			case "9":
				System.out.println("작업시간 초로 입력 :");
				System.out.println(timecalc.timecalc(s.nextInt()));
				break;
			case "0":
				JOptionPane.showConfirmDialog(null,"종료하시겠습니다까?");
				return;
			default:
				JOptionPane.showMessageDialog(null, "메뉴에 없는 번호 입니다.");
				break;
			}
			System.out.println();
		}
	}
}
