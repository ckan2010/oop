package lotto;

/**
 * @date   :2016. 6. 24.
 * @author :ckan
 * @file   :LottoBallServiceImpl.java
 * @story  :
 */
public class LottoBallServiceImpl implements LottoBallService{
	private int[] lotto;
	@Override
	public void setLottoBall(LottoBean lot) {
		lotto = new int[6];
		int num = 0;
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
		}
	}
	@Override
	public int[] getLottoBall() {
		return lotto;
	}
}
