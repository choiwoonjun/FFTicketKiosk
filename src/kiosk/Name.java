package kiosk;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class Name extends JPanel {
	
	JLabel KioskTitle;
	
	public Name() {
		setLayout(new BorderLayout());
        setBackground(new Color(0x7EBCBE));
		KioskTitle = new JLabel("������ȭ�� Ƽ�� �Ǹ�");
		
		KioskTitle.setForeground(Color.white);
		//Font font = new Font("���� ���", Font.BOLD, 20);
		//KioskTitle.setHorizontalAlignment(JLabel.CENTER);
		add(KioskTitle);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
