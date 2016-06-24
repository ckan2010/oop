package lotto;

import java.util.Arrays;

/**
 * @date   :2016. 6. 24.
 * @author :ckan
 * @file   :LottoBallServiceImpl.java
 * @story  :
 */
public class LottoBallServiceImpl implements LottoBallService{
	private int[] lotto;
	public LottoBallServiceImpl() {
		lotto = new int[6];
	}
	@Override
	public void setLottoBall(LottoBean lot) {
		int num = 0;
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = 0;
		}
		for (int i = 0; i < lotto.length; i++) {
			lot.setNumber();
			num = lot.getNumber();
			boolean exist = false;
			for (int j = 0; j < lotto.length; j++) {
				if (lotto[j] == num){
					exist = true;
					break;
				}
			}
			if (exist) {
				i--;
				continue;
			}else{
				lotto[i] = num;
			}
		}
		Arrays.sort(lotto);
		/*int num = 0;
		boolean Duplication = false;
		int i = 0;
		while (true) {
			lot.setNumber();
			num = lot.getNumber();
			for (int j = 0; j < lotto.length; j++) {
				if (lotto[j] == num){
					Duplication = true;
				}
			}
			if (Duplication) {
				continue;
			}
			lotto[i] = num;
			i++;
			if (i == lotto.length) {
				i = 0;
				break;
			}
		}*/
	}
	@Override
	public int[] getLottoBall() {
		return lotto;
	}
}
