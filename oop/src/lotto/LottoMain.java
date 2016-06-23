package lotto;

import javax.swing.JOptionPane;

/**
 * @date   :2016. 6. 23.
 * @author :ckan
 * @file   :LottoController.java
 * @story  :
 */
public class LottoMain {
	public static void main(String[] args) {
		LottoBean lot = new LottoBean();
		LottoService service = new LottoServiceImpl();
		lot.setMoney(Integer.parseInt(JOptionPane.showInputDialog("얼마 구입")));
		service.setLottos(lot);
		int[][] lottos = service.getLottos();	
		for (int i = 0; i < lottos.length; i++) {
			service.sort(lottos[i]);
			for (int j = 0; j < lottos[i].length; j++) {
				System.out.print(lottos[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
