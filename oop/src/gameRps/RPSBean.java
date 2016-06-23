package gameRps;

import java.util.Random;

public class RPSBean {
	private String play,comp,result;
	private int inplay,incomp;
	public void setPlay(int play){
		this.inplay = play;
		switch (play) {
		case 1:
			this.play = "가위";
			break;
		case 2:
			this.play = "바위";
			break;
		case 3:
			this.play = "보";
			break;
		default:
			break;
		}
	}
	public void setComp(){
		Random ran = new Random();
		int compOa = ran.nextInt(3);
		this.incomp = compOa;
		switch (compOa) {
		case 1:
			this.comp = "가위";
			break;
		case 2:
			this.comp = "바위";
			break;
		case 3:
			this.comp = "보";
			break;
		default:
			break;
		}
	}
	public int getPlay(){
		return this.inplay;
	}
	public int getComp(){
		return this.incomp;
	}
	public void setWin(String resul){
		this.result = resul;
	}
	@Override
	public String toString() {
		return "결과 [ 플레이어= " + this.play + " , 컴퓨터= " + this.comp+" ,승패 = "+this.result+" ]";
	}
}
