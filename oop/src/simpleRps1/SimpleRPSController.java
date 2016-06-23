package simpleRps1;

import java.util.Random;

import javax.swing.JOptionPane;

public class SimpleRPSController {
	public static void main(String[] args) {
		SimpleRPSService rps = new SimpleRPSServiceImpl();
		JOptionPane.showMessageDialog(null, "===가위바위보 게임===");
		int comp = 0,player = 0,gamer = 0;
		String result = "";
		Random r = new Random();
		while (true) {
			switch (JOptionPane.showInputDialog("1계속 0종료")) {
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
				result = rps.gameEngine(comp, player, result);
					break;
				default:
					return;
					
			}
		JOptionPane.showMessageDialog(null, "player = "+player+" comp = "+comp+" 결과 "+result);
		}
	}
}
