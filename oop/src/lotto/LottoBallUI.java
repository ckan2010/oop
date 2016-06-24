package lotto;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @date   :2016. 6. 24.
 * @author :ckan
 * @file   :LottoBallUI.java
 * @story  :
 */
public class LottoBallUI extends JFrame implements ActionListener {
	LottoBallService service;
	LottoBean lot = new LottoBean();
	JButton btn; // 버튼
	JPanel panNorth,panSouth; // 패널
	ImageIcon icon;
	List<JButton> btns;
	public LottoBallUI() {
		this.service = new LottoBallServiceImpl(); 
		this.btn = new JButton("로또볼 추첨"); // 제약조건
		this.panNorth = new JPanel();
		this.panSouth = new JPanel();
		this.btns = new ArrayList<JButton>();
		btn.addActionListener(this);
		this.panNorth.add(btn);
		this.add(panNorth,BorderLayout.NORTH);
		this.add(panSouth, BorderLayout.SOUTH);
		this.setBounds(300,400,1200,300);
		// 300,400 은 x,y 좌표값
		// 1200,300 은 가로 세로 픽셀
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (btns.size() == 0) {
			JButton btn = null;
			for (int i = 0; i < 6; i++) {
				btn = new JButton();
				btns.add(btn);
				panSouth.add(btn);
			}
		}
		service.setLottoBall(lot);
		int[] lotto = service.getLottoBall();		
		for (int i = 0; i < lotto.length; i++) {
			btns.get(i).setIcon(this.getIcon(lotto[i]));
		}
	}
	public Icon getIcon(int i){
		String image = "src/images/"+String.valueOf(i)+".gif";
		ImageIcon icon = new ImageIcon(image);
		return icon;
	}
}
