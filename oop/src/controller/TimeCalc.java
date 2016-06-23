package controller;

public class TimeCalc {
	public String timecalc(int inputIntime){
		int intime = inputIntime;
		return (intime / 60 / 60)+"시간 "
				+(intime / 60 % 60)+"분 "+(intime % 60)+"초 ";
	}
}
