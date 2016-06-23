package simpleRPS3;

import java.util.Random;

public class SimpleRPSServiceImpl implements SimpleRPSService{
	Random r = new Random();
	int comp = 0,gamewin = 0;
	String result = "";
	@Override
	public String playGame(int player) {
		comp = r.nextInt(3)+1;
		gamewin = (int)((player - comp + 3) % 3);
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
	@Override
	public String getResult(String result) {
		return "플레이어는 : "+result;
	}

}
