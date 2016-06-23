package gameRps;

import javax.swing.JOptionPane;

public class RPSControll {
	public static void main(String[] args) {
		RPSService service = new RPSServiceImpl(); 
		while (true) {
			switch (JOptionPane.showInputDialog("1계속 0종료")) {
			case "1":
				String rps = JOptionPane.showInputDialog("1가위 2바위 3보");
				if(service.checkValidation(rps)){
					service.betPlayerValue(Integer.parseInt(rps));
					service.setComputerValue();
					service.whoWin();
					JOptionPane.showMessageDialog(null, service.showResult());
				} else {
					JOptionPane.showMessageDialog(null, "1~3만 가능");
					continue;
				}
				
				break;
			case "0":
				return;
			default:
				return;
			}
		}
	}
}
