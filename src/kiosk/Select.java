package kiosk;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

public class Select extends JPanel {
	
	JLabel SelectExplain;
	
	public Select() {
		setLayout(new BorderLayout());	
        setBackground(Color.blue);
		SelectExplain = new JLabel("��ȭ�� Ŭ���ؼ� �����ϼ���");
		SelectExplain.setForeground(Color.white);
		add(SelectExplain);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
