package simpleRps1;

public class SimpleRPSServiceImpl implements SimpleRPSService{
	@Override
	public String gameEngine(int comp, int player, String result) {
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
