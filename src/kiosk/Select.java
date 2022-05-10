package kiosk;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

public class Select extends JPanel {
	
	JLabel SelectExplain;
	
	public Select() {
		setLayout(new BorderLayout());	
        setBackground(Color.blue);
		SelectExplain = new JLabel("영화를 클릭해서 선택하세요");
		SelectExplain.setForeground(Color.white);
		add(SelectExplain);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
