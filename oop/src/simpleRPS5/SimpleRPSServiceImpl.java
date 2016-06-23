package simpleRPS5;

import java.util.Random;

public class SimpleRPSServiceImpl implements SimpleRPSService{
	SimpleRPSBean rps = new SimpleRPSBean();
	String result = "";
	@Override
	public String playGame(int player) {
		rps.setPlay(player);
		rps.setComp();
		int ply = rps.getPlay();
		int com = rps.getComp();
		if (ply == com) {
			result = "WIN";
		}else{
			result = "LOSE";
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
