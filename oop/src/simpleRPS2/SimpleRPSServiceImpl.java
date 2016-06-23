package simpleRPS2;

import java.util.Random;

import simpleRPS3.SimpleRPSBean;

public class SimpleRPSServiceImpl implements SimpleRPSService{
	SimpleRPSBean rps = new SimpleRPSBean();
	String result = "";
	@Override
	public String playGame(int player) {
		rps.setPlay(player);
		rps.setComp();
		int com = rps.getComp();
		switch (player) {
		case 1:
			switch (com) {
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
			switch (com) {
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
			switch (com) {
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
	@Override
	public String getResult(String result) {
		return "플레이어는 : "+rps.setValue(rps.getPlay())+"\n"
				+" 컴퓨터 : "+rps.setValue(rps.getComp())+"\n"
				+" 승패 : "+result;
	}

}
