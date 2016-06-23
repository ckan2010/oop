package lotto;

/**
 * @date   :2016. 6. 23.
 * @author :ckan
 * @file   :LottoServiceImpl.java
 * @story  :
 */
public class LottoServiceImpl implements LottoService{
	private int[][] Lottos;	
	private int count;
	@Override
	public void setLottos(LottoBean lot) {
		count = this.getCount(lot);
		Lottos = new int[count][6];
		int num = 0;
		int i = 0;
		if (count <= 0) {
			this.Lottos = null;
			return;
		}
		for (count = 0; count < Lottos.length; count++) {
			while (true) {
				lot.setNumber();
				num = lot.getNumber();
				if(isDuplication(count, num)){
					continue;
				}
				Lottos[count][i] = num;
				i++;
				if (i>5) {
					i = 0;
					break;
				}
			}
		}	
	}
	@Override
	public int[][] getLottos() {
		// 로또를 가져온다
		return Lottos;
	}
	@Override
	public boolean isDuplication(int arr, int num) {
		// 중복방지
		for (int i = 0; i < Lottos.length; i++) {
			if (Lottos[arr][i] == num) {
				return true;
			}
		}
		return false;
	}
	@Override
	public void sort(int[] arr) {
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
