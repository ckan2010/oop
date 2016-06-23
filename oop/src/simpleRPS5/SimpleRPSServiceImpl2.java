package simpleRPS5;

import java.util.Random;

public class SimpleRPSServiceImpl2 implements SimpleRPSService{
	SimpleRPSBean rps = new SimpleRPSBean();
	String result = "";
	@Override
	public String playGame(int player) {
		rps.setPlay(player);
		rps.setComp();
		int ply = rps.getPlay();
		int com = rps.getComp();
		if (ply == com) {
			result = "TIE";
		}else{
			switch (Math.abs(ply - com)) {
			case 1:
				result = (ply>com)? "WIN" : "LOSE";
				break;
			case 2:
				result = (ply>com)? "LOSE" : "WIN";
				break;
			default:
				break;
			}
		}
		return getResult(result);
	}
	@Override
	public String getResult(String result) {
		return "플레이어 : "+rps.setValue(rps.getPlay())+"\n"+
				"컴퓨터 : "+rps.setValue(rps.getComp())+"\n"+
				"결과 : "+result;
				
	}

}
