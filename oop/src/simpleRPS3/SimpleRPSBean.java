package simpleRPS3;

import java.util.Random;

public class SimpleRPSBean {
	private String play,comp,result,value;
	private int inplay,incomp;
	public void setPlay(int play){
		this.inplay = play;
		this.setValue(play);
	}
	public void setComp(){
		Random ran = new Random();
		this.incomp = ran.nextInt(3) + 1;
		this.setValue(this.incomp);
	}
	public String setValue(int out){
		switch (out) {
		case 1:
			this.value = "가위";
			break;
		case 2:
			this.value = "바위";
			break;
		case 3:
			this.value = "보";
			break;
		default:
			break;
		}
		return this.value;
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
