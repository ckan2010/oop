package simpleRPS5;

import java.util.Random;

public class SimpleRPSBean {
	private String value;
	private int inplay,incomp;
	public void setPlay(int play){
		this.inplay = play;
		this.setValue(play);
	}
	public void setComp(){
		Random ran = new Random();
		this.incomp = ran.nextInt(2) + 1;
		this.setValue(this.incomp);
	}
	public String setValue(int out){
		switch (out) {
		case 1:
			this.value = "홀";
			break;
		case 2:
			this.value = "짝";
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
}
