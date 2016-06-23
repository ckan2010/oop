package simpleRPS2;

import javax.swing.JOptionPane;

public class SimpleRPSController {
	public static void main(String[] args) {
		SimpleRPSService rps = new SimpleRPSServiceImpl();
		JOptionPane.showMessageDialog(null, "===가위바위보 게임===");
		while (true) {
			switch (JOptionPane.showInputDialog("1계속 0종료")) {
				case "1":
				    JOptionPane.showMessageDialog(null, rps.getResult(rps.playGame(Integer.parseInt(JOptionPane.showInputDialog("1가위 2바위 3보")))));
					break;
				default:
					return;
			}
		}
	}
}
