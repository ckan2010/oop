package controller;

public class MaxMin {
	public String excute(int[] inputScore){
		int i = 0, maxGrade = 0, minGrade = 100;
		for (; i < inputScore.length; i++) {
			if (inputScore[i] > maxGrade ) {
				maxGrade = inputScore[i];				
			} if (inputScore[i] < minGrade){
				minGrade = inputScore[i];
			}
		}
		return "최고점 : "+maxGrade+"\t최저점 : "+minGrade;
	}
}
