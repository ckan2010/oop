package simpleRPS0;

import java.util.Random;

import javax.swing.JOptionPane;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.InterningXmlVisitor;

public class SimpleRPS {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "===가위바위보 게임===");
		int comp = 0,player = 0,gamer = 0;
		String result = "";
		Random r = new Random();
		while (true) {
			switch (JOptionPane.showInputDialog("1계속 1않이면종료")) {
				case "1":
					String sele = JOptionPane.showInputDialog("1가위 2바위 3보");
					player = Integer.parseInt(sele);
					comp   = r.nextInt(3)+1;
					gamer  = (int)((player - comp + 3)%3);
					/*switch (gamer){
						case 0:
							result = "TIE";
							break;
						case 1:
							result = "LOSE"
							break;
						case 2:
							result = "WIN";
							break;
						default
							break;
					}*/
				result = gameEngine(comp, player, result);
					break;
				default:
					return;
					
			}
		JOptionPane.showMessageDialog(null, "player = "+player+" comp = "+comp+" 결과 "+result);
		}
	}

	/**
	 * @param comp
	 * @param player
	 * @param result
	 * @return
	 */
	private  static String gameEngine(int comp, int player, String result) {
		switch (player) {
		case 1:
			switch (comp) {
			case 1:
				result = "TIE";
				break;
			case 2:
				result = "LOSE";
				break;
			case 3:
				result = "WIN";
				break;
			default:
				break;
			}
			break;
		case 2:
			switch (comp) {
			case 1:
				result = "WIN";
				break;
			case 2:
				result = "TIE";
				break;
			case 3:
				result = "LOSE";
				break;
			default:
				break;
			}
			break;
		case 3:
			switch (comp) {
			case 1:
				result = "LOSE";
				break;
			case 2:
				result = "WIN";
				break;
			case 3:
				result = "TIE";
				break;
			default:
				break;
			}	
			break;
		default:
			break;
		}
		return result;
	}
}
