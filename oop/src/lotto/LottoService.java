package lotto;

/**
 * @date   :2016. 6. 23.
 * @author :ckan
 * @file   :LottoService.java
 * @story  :
 */
public interface LottoService {
	public void setLottos(LottoBean lot);
	public int[][] getLottos();
	public boolean isDuplication(int arr,int num);
	public void sort(int[] arr);
	public int getCount(LottoBean lot);
}
