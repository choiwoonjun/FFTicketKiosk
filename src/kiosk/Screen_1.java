package kiosk;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;

public class Screen_1 extends JFrame {

	private JPanel namePanel = new Name();
	private JPanel selectPaenl = new Select();
	private JPanel moviePanel = new Movie();
	
	public Screen_1() {
		setTitle("Ƽ�� �Ǹ� Ű����ũ"); //Ÿ��Ʋ
		setSize(1100,800); //��ũ�� ũ��
		setVisible(true);
		
		GridBagLayout grid = new GridBagLayout(); //�׸��庤 ���̾ƿ�
		GridBagConstraints con = new GridBagConstraints(); //�ܽ�Ʈ����Ʈ �����
		setLayout(grid); //���̾ƿ� ����
		
		con.fill = GridBagConstraints.BOTH;
		con.weightx=1.0;
		con.weighty=1.0;
		
		con.gridx=0;
		con.gridy=0;
        con.gridwidth = 1; // ����
        con.weighty = 0.1; // ���� ����(0 ~ 1)
		con.weightx=0.3;
        grid.setConstraints(namePanel, con);
        add(namePanel);
        
        con.gridx = 1;
        con.gridy = 0;
        con.gridwidth = 1;
        con.gridheight = 1;
		con.weightx=0.7;
        grid.setConstraints(selectPaenl, con);
        add(selectPaenl);

        con.gridx = 1;
        con.gridy = 1;
        con.gridwidth = 5;
        con.gridheight = 5;
        con.weighty = 1;
        grid.setConstraints(moviePanel, con);
        add(moviePanel);

      //  Button btn = new Button("1");
        //Button btn2 = new Button("2");
        //Button btn3 = new Button("3");
        //Button btn4 = new Button("4");
        
        
		
	}//screen1
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Screen_1 frame = new Screen_1();
	}
}
