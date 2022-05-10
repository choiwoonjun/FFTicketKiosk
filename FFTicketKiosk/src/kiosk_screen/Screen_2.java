package kiosk_screen;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Screen_2 extends JFrame {
	
	int ticket_number=0;
	int ticket_number1=0;
	
	JLabel ticketnumber= new JLabel("0");
	JLabel ticketnumber1= new JLabel("0");
	JLabel inner =new JLabel("내부인 5000원");
	JLabel outer = new JLabel("외부인  6000원");
	JLabel info=new JLabel("[안내 사항] "
			+ "\r\n - 내부인: 재학생, 교수, 교내 종사자"
			+ " \r\n -좌석은 자동 배정됩니다.");
	
	JButton minus_button =new JButton("-");
	JButton plus_button =new JButton("+");
	
	JButton minus1_button =new JButton("-");
	JButton plus1_button =new JButton("+");
	
	Screen_2(){
		setTitle("영화관 키오스크");
		
		
		Container c=getContentPane();
		//c.addMouseListener(new myMouseListener());
		
		//내부인 버튼 생성
		c.setLayout(null);
		
		plus_button.setLocation(300, 200);
		plus_button.setSize(50,50);
		c.add(plus_button);
		plus_button.addActionListener(new MyActionListener());
		
		minus_button.setLocation(200, 200);
		minus_button.setSize(50, 50);
		c.add(minus_button);
		minus_button.addActionListener(new MyActionListener());
		
		ticketnumber.setLocation(270, 170);
		ticketnumber.setSize(100,100);
		c.add(ticketnumber);
		
		inner.setLocation(120, 170);
		inner.setSize(100,100);
		c.add(inner);
		
		//외부인 버튼 생성
		c.setLayout(null);
		
		plus1_button.setLocation(300, 100);
		plus1_button.setSize(50,50);
		c.add(plus1_button);
		plus1_button.addActionListener(new MyActionListener());
		
		minus1_button.setLocation(200, 100);
		minus1_button.setSize(50, 50);
		c.add(minus1_button);
		minus1_button.addActionListener(new MyActionListener());
		
		ticketnumber1.setLocation(270, 70);
		ticketnumber1.setSize(100,100);
		c.add(ticketnumber1);
		
		outer.setLocation(120, 70);
		outer.setSize(100,100);
		c.add(outer);
		
		//정보 설명란
		info.setLocation(120, 170);
		info.setSize(300,300);
		c.add(info);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
	}
	
	class MyActionListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			plus_button=(JButton)(e.getSource());
			minus_button=(JButton)(e.getSource());
			plus1_button=(JButton)(e.getSource());
			minus1_button=(JButton)(e.getSource());
			
			if(plus_button.getText().equals("+")) {
				ticket_number=ticket_number+1;
				ticketnumber.setText(String.valueOf(ticket_number));
			}
			if(minus_button.getText().equals("-")) {
				ticket_number=ticket_number-1;
				ticketnumber.setText(String.valueOf(ticket_number));
			}
			if(plus1_button.getText().equals("+")) {
				ticket_number1=ticket_number1+1;
				ticketnumber1.setText(String.valueOf(ticket_number1));
			}
			if(minus1_button.getText().equals("-")) {
				ticket_number1=ticket_number1-1;
				ticketnumber1.setText(String.valueOf(ticket_number1));
			}
		}
	}
	/*
	class myMouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			Point p=e.getPoint();
			if(plus_button.getText().equals("+")) {
				if(ticket_number>4) {
					//최대 구매 개수 5개로 제한
				}
				else {
				ticket_number=ticket_number+1;
				ticketnumber.setText(String.valueOf(ticket_number));
				}
			}	
			else if(minus_button.getText().equals("-"))
				if(ticket_number<0) {
					// 0개 이하는 선택 불가능
				}
				else {
				ticket_number=ticket_number-1;
				ticketnumber.setText(String.valueOf(ticket_number));
				}
			}
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}	
	}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Screen_2(); 
	}
}

