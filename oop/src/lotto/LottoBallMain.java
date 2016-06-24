package lotto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import sun.text.resources.FormatData;

/**
 * @date   :2016. 6. 24.
 * @author :ckan
 * @file   :LottoBallMain.java
 * @story  :관리자용
 */
public class LottoBallMain {
	public static void main(String[] args) {
		LottoBean lot = new LottoBean();
		LottoBallService service = new LottoBallServiceImpl();
		StringBuffer buf = new StringBuffer();
		service.setLottoBall(lot);
		int[] lotto = service.getLottoBall();
		for (int i = 0; i < lotto.length; i++) {
			Arrays.sort(lotto);
			buf.append(lotto[i]+"\t");
		}
		System.out.println("로또Ball\n");
		String nowtime = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date(System.currentTimeMillis()));
		File output = new File("C:\\eclipse\\lotto\\lottoball_"+nowtime+".txt");
		BufferedWriter bw = null;
		String myLotto = buf.toString();
		System.out.println(myLotto);
		try {// 외부파일 의 영역
			bw = new BufferedWriter(new FileWriter(output,true));
			bw.write(myLotto);
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
