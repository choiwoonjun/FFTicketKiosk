package kiosk;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

public class Movie extends JPanel {

	JPanel MovieList;
	JButton btn_img_1;
	JButton btn_img_2;
	JButton btn_img_3;
	JButton btn_img_4;
	JButton btn_img_5;
	
	ImageIcon img = new ImageIcon("C:/Users/�ּҿ�/Desktop/�ڳ���/3�г�/����2/Ű����ũ ��ȭ �̹���/�׸�1.jpg");
	ImageIcon img2 = new ImageIcon("C:/Users/�ּҿ�/Desktop/�ڳ���/3�г�/����2/Ű����ũ ��ȭ �̹���/�׸�2.jpg");
	ImageIcon img3 = new ImageIcon("C:/Users/�ּҿ�/Desktop/�ڳ���/3�г�/����2/Ű����ũ ��ȭ �̹���/�׸�3.jpg");
	ImageIcon img4 = new ImageIcon("C:/Users/�ּҿ�/Desktop/�ڳ���/3�г�/����2/Ű����ũ ��ȭ �̹���/�׸�4.jpg");
	ImageIcon img5 = new ImageIcon("C:/Users/�ּҿ�/Desktop/�ڳ���/3�г�/����2/Ű����ũ ��ȭ �̹���/�׸�5.jpg");

	public Movie() {
		MovieList= new JPanel();
		
//		setLayout(new FlowLayout(FlowLayout.LEFT,10,50));
		
//		GridBagLayout gridbag = new GridBagLayout();
//		GridBagConstraints cons = new GridBagConstraints();
//		setLayout(gridbag);
//		cons.fill = GridBagConstraints.BOTH;
		
//        cons.weightx = 1;
//        cons.weighty = 1;
//        cons.gridwidth = 1;
//        cons.gridheight = 1;
	
		GridLayout grid = new GridLayout(2,3);
		grid.setVgap(5);
		
		MovieList.setLayout(grid);
		
       
        btn_img_1 = new JButton(img);
        btn_img_1.setPreferredSize(new Dimension(300,300));

        btn_img_2 = new JButton(img2);
        btn_img_2.setPreferredSize(new Dimension(300,300));
        
        btn_img_3 = new JButton(img3);
        btn_img_3.setPreferredSize(new Dimension(300,300));
        
        btn_img_4 = new JButton(img4);
        btn_img_4.setPreferredSize(new Dimension(300,300));
        
        btn_img_5 = new JButton(img5);
        btn_img_5.setPreferredSize(new Dimension(300,300));

        //btn_img_1.setBounds(0,170,122,30);
        
        MovieList.add(btn_img_1);
        MovieList.add(btn_img_2);
        MovieList.add(btn_img_3);
        MovieList.add(btn_img_4);
        MovieList.add(btn_img_5);
        add(MovieList);
        setVisible(true);
        
        btn_img_1.setText("<HTML>�������� ���<br>13:00 ~ 14:40 </HTML>");
        btn_img_2.setText("<HTML>������ ���<br>14:50 ~ 16:00 </HTML>");
        btn_img_3.setText("<HTML>���Ӿ��� ��Ź��<br>16:20 ~ 16:50 </HTML>");
        btn_img_4.setText("<HTML>���콺<br>17:00 ~ 17:50 </HTML>");
        btn_img_5.setText("<HTML>���ۼҴ� 2<br>18:00 ~ 19:40 </HTML>");
        
        btn_img_1.setVerticalTextPosition(JButton.BOTTOM);
        btn_img_2.setVerticalTextPosition(JButton.BOTTOM);
        btn_img_3.setVerticalTextPosition(JButton.BOTTOM);
        btn_img_4.setVerticalTextPosition(JButton.BOTTOM);
        btn_img_5.setVerticalTextPosition(JButton.BOTTOM);
        
        
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
