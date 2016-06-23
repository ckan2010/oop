package simpleRPS5;

import javax.swing.JOptionPane;

public class SimpleRPSController {
	public static void main(String[] args) {
		SimpleRPSService rps = new SimpleRPSServiceImpl();
		JOptionPane.showMessageDialog(null, "===홀짝 게임===");
		while (true) {
			switch (JOptionPane.showInputDialog("1계속 0종료")) {
				case "1":
				    JOptionPane.showMessageDialog(null, rps.playGame(Integer.parseInt(JOptionPane.showInputDialog("1홀 2짝"))));
					break;
				default:
					return;
			}
		}
	}
}
