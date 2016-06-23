package lotto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
		StringBuffer buf = new StringBuffer();
		lot.setMoney(Integer.parseInt(JOptionPane.showInputDialog("얼마 구입")));
		service.setLottos(lot);
		int[][] lottos = service.getLottos();	
		for (int i = 0; i < lottos.length; i++) {
			service.sort(lottos[i]);
			for (int j = 0; j < lottos[i].length; j++) {
				buf.append(lottos[i][j]+"\t");
			}
			buf.append("/");
		}
		System.out.println("로또\n");
		int lottoSerialNo = (int)(Math.random()*999999+100000);
		File output = new File("C:\\eclipse\\lotto\\"+lottoSerialNo+".txt");
		BufferedWriter bw = null;
		String[] myLotto = buf.toString().split("/");
		for (int i = 0; i < myLotto.length; i++) {
			System.out.println(myLotto[i]+"\n");
		}
		try {// 외부파일 의 영역
			bw = new BufferedWriter(new FileWriter(output,true));
			for (String lots : myLotto) {
				lots += System.getProperty("line.separator");
				bw.write(lots);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				bw.flush();// 화장실 물내림 잘못된것 버리고
				bw.close();// 화장실 문닫고 나감 완전히 완료함
			} catch (IOException e) { 
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
	}
}
