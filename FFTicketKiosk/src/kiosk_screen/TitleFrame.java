//��ü ������ �� Ÿ��Ʋ(Ű����ũ��/�ȳ�����)
//��ư
package kiosk_screen;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.*;

public class TitleFrame extends JFrame {
	//������ ����
	public TitleFrame() {
		
		setTitle("��ȭ Ƽ�� �Ǹ� Ű����ũ");
		setSize(1100,800); 	// ������ ũ�� 1100*800
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	 
							//������ ���� ��ư Ŭ�� �� ������ ������ ���α׷� �����
		setVisible(true); 	// ������ ���
		
		
		//contentPane ���� (��ġ������ ����)
		Container title = getContentPane();		
		title.setLayout(null);
		
		//[Ű����ũ��] ����
		JPanel title1 = new JPanel();						//(�г�): title1
		JLabel titleL1 = new JLabel("������ȭ�� Ƽ�� �Ǹ�");	//(��): titleL1
		//[�ȳ�����] ����
		JPanel title2 = new JPanel();						//(�г�): title2
		JLabel titleL2 = new JLabel("������� �߱޵Ǿ����ϴ�"); //(��): titleL2
		
		//Ÿ��Ʋ ġ�� ����
				int lft = 280;			//Ű����ũ��(�г�) ���� ����
				int rgt = 1100 - lft;	//�ȳ�����(�г�) ���� ���� (������ ���� ���� - Ű����ũ��(�г�) ���� ����)
				int hgt = 70;			//���� ����
		
		//title1 ����
		title1.setLayout(null);
		Color color1 = new Color(0x006633, false);		//���� ����
		title1.setBounds(0,0,lft,hgt);
		title1.setBackground(color1);
		//title1.setVisible(true);
		add(title1);
		
		//title2 ����
		title2.setLayout(null);
		title2.setLocation(lft, 0);
		title2.setSize(rgt, hgt);
		title2.setBackground(Color.DARK_GRAY);
		//title2.setVisible(true);
		add(title2);		
		
		//titleL1 ����
		titleL1.setHorizontalAlignment(JLabel.CENTER);
		titleL1.setSize(lft, hgt);
		titleL1.setFont(new Font("���� ���", Font.PLAIN, 25));
		titleL1.setForeground(Color.WHITE);
		//title.add(title_l);
		title1.add(titleL1);
		
		//titleL2 ����
		titleL2.setHorizontalAlignment(JLabel.LEFT);
		titleL2.setBounds(20,0,rgt, hgt);
		titleL2.setFont(new Font("���� ���", Font.BOLD, 26));
		titleL2.setForeground(Color.WHITE);
		//titleR.add(titleL2);
		title2.add(titleL2);
		
		
		//��ư �����
		//Ȯ�οϷ� ��ư: finish
		JButton finish = new JButton("Ȯ�� �Ϸ�");
		
		//finish ����
		finish.setBounds(820, 800-185, 130, 80);
		Color bColor = new Color(0x3333FF, false);				//��ư �� ����
		finish.setBackground(bColor);
		finish.setFont(new Font("���� ���", Font.BOLD, 21));
		finish.setForeground(Color.WHITE);
		add(finish);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ü ������
		TitleFrame frame = new TitleFrame();
		
	}

}
