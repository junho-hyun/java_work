package frame05;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame{
	//생성자
	public MyFrame(String title) {
		super(title);
		//MyFrame 의 레이아웃 매니저 지정하기
		setLayout(new FlowLayout());
		//버튼
		JButton sendBtn=new JButton("전송");
		JButton removeBtn=new JButton("삭제");
		//프레임에 버튼 추가하기 ( FlowLayout 의 영향을 받는다 )
		add(sendBtn);
		add(removeBtn);
	
		ActionListener listener=new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("전송?");
				//알림창 생성하는법.
				JOptionPane.showMessageDialog(MyFrame.this, "전송합니다~");
			}
		};
		
		MyFrame a = this;
		
		ActionListener listener2=new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("삭제");
				ActionListener b=this;
										//MyFrame.this, 라고 입력 가능
				JOptionPane.showMessageDialog(MyFrame.this, "삭제 합니다.");
			}
		};
		
		sendBtn.addActionListener(listener);
		removeBtn.addActionListener(listener2);
		/*
		 * removeBtn.addActionListener(new ActionListener() {
         		@Override
         		public void actionPerformed(ActionEvent e) {
            		System.out.println("삭제");
         		}
      		});
		 */
	
	}
	
	//객체 바깥에서 생성, 다른 frame 들은 객체 안에서 생성 되었지만. 
	//아래와 같이 static 영역의 class 안쪽에 생성되는 경우도 있다. main메소드 안쪽.
	public static void main(String[] args) {
		JFrame f=new MyFrame("나의 프레임");;
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 500, 500);
		f.setVisible(true);
		
		
	}
	
}
