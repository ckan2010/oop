package lotto;

/**
 * @date   :2016. 6. 23.
 * @author :ckan
 * @file   :LottoServiceImpl.java
 * @story  :
 */
public class LottoServiceImpl implements LottoService{
	private int[][] lottos;
	private int[] lotto;
	private int count;
	@Override
	public void setLottos(LottoBean lot) {
		count = this.getCount(lot);
		lottos = new int[count][6];
		lotto = new int[6];
		int num = 0;
		int i = 0;
		if (count <= 0) {
			this.lottos = null;
			return;
		}
		for (count = 0; count < lottos.length; count++) {
			while (true) {
				lot.setNumber();
				num = lot.getNumber();
				if(isDuplication(count, num)){
					continue;
				}
				lottos[count][i] = num;
				i++;
				if (i==lotto.length) {
					i = 0;
					break;
				}
			}
		}	
	}
	@Override
	public int[][] getLottos() {
		// 로또를 가져온다
		return lottos;
	}
	@Override
	public boolean isDuplication(int arr, int num) {
		// 중복방지
		for (int i = 0; i < lotto.length; i++) {
			if (lottos[arr][i] == num) {
				return true;
			}
		}
		return false;
	}
	@Override
	public void sort(int[] arr) {
		// 오름차순 정렬
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	@Override
	public int getCount(LottoBean lot) {

		return lot.getMoney()/1000;
	}
}
