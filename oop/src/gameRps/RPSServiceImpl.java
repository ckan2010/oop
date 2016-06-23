package gameRps;

public class RPSServiceImpl implements RPSService{
	RPSBean rps = new RPSBean();
	@Override
	public void betPlayerValue(int playerValue) {
		rps.setPlay(playerValue);
	}
	@Override
	public void setComputerValue() {
		rps.setComp();
	}
	@Override
	public void whoWin() {
		String result="";
		int resu=0;
		resu = (rps.getPlay() - rps.getComp() + 3)%3;
		System.out.println("resu : "+resu);
		switch (resu) {
		case 0:
			result = "SAVE";
			break;
		case 1:
			result = "WIN";
		case 2:
			result = "LOSE";
		default:
			break;
		}
		System.out.println("result : "+result);
		rps.setWin(result);
	}
	@Override
	public String showResult() {
		return rps.toString();
	}
	@Override
	public boolean checkValidation(String rps) {
		switch (rps) {
		case "1":case "2":case "3":
			return true;
		default:
			return false;
		}
	}
}
