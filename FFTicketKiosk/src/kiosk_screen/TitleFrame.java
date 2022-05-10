//전체 프레임 및 타이틀(키오스크명/안내문구)
//버튼
package kiosk_screen;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.*;

public class TitleFrame extends JFrame {
	//프레임 생성
	public TitleFrame() {
		
		setTitle("영화 티켓 판매 키오스크");
		setSize(1100,800); 	// 프레임 크기 1100*800
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	 
							//프레임 종료 버튼 클릭 시 프레임 닫히고 프로그램 종료됨
		setVisible(true); 	// 프레임 출력
		
		
		//contentPane 생성 (배치관리자 없음)
		Container title = getContentPane();		
		title.setLayout(null);
		
		//[키오스크명] 생성
		JPanel title1 = new JPanel();						//(패널): title1
		JLabel titleL1 = new JLabel("융프영화제 티켓 판매");	//(라벨): titleL1
		//[안내문구] 생성
		JPanel title2 = new JPanel();						//(패널): title2
		JLabel titleL2 = new JLabel("입장권이 발급되었습니다"); //(라벨): titleL2
		
		//타이틀 치수 설정
				int lft = 280;			//키오스크명(패널) 가로 길이
				int rgt = 1100 - lft;	//안내문구(패널) 가로 길이 (프레임 가로 길이 - 키오스크명(패널) 가로 길이)
				int hgt = 70;			//세로 길이
		
		//title1 설정
		title1.setLayout(null);
		Color color1 = new Color(0x006633, false);		//배경색 지정
		title1.setBounds(0,0,lft,hgt);
		title1.setBackground(color1);
		//title1.setVisible(true);
		add(title1);
		
		//title2 설정
		title2.setLayout(null);
		title2.setLocation(lft, 0);
		title2.setSize(rgt, hgt);
		title2.setBackground(Color.DARK_GRAY);
		//title2.setVisible(true);
		add(title2);		
		
		//titleL1 설정
		titleL1.setHorizontalAlignment(JLabel.CENTER);
		titleL1.setSize(lft, hgt);
		titleL1.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		titleL1.setForeground(Color.WHITE);
		//title.add(title_l);
		title1.add(titleL1);
		
		//titleL2 설정
		titleL2.setHorizontalAlignment(JLabel.LEFT);
		titleL2.setBounds(20,0,rgt, hgt);
		titleL2.setFont(new Font("맑은 고딕", Font.BOLD, 26));
		titleL2.setForeground(Color.WHITE);
		//titleR.add(titleL2);
		title2.add(titleL2);
		
		
		//버튼 참고용
		//확인완료 버튼: finish
		JButton finish = new JButton("확인 완료");
		
		//finish 설정
		finish.setBounds(820, 800-185, 130, 80);
		Color bColor = new Color(0x3333FF, false);				//버튼 색 지정
		finish.setBackground(bColor);
		finish.setFont(new Font("맑은 고딕", Font.BOLD, 21));
		finish.setForeground(Color.WHITE);
		add(finish);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//전체 프레임
		TitleFrame frame = new TitleFrame();
		
	}

}