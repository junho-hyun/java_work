package frame08;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/*
 * 	JTextField 객체의 메소드를 잘 활용해서
 * 
 * 	메세지를 입력하고 눌러보셈 버튼을 누르면
 * 
 * 	입력한 메세지가 알림창에 출력되도록 프로그래밍 해보세요.
 * 
 */


public class MyFrame extends JFrame implements ActionListener{
	JTextField  inputMsg;
	
	//생성자
	public MyFrame(String title) {
		super(title);
		setLayout(new FlowLayout());
	
		//필드에 생성자를 생성하고 사용한다면. 지역변수 선언을 안하고 사용한다면 
		//이 생성자가 끝나고 inputMsg에 new 한 이 생성자를 다시 사용 가능하다.
		//생성한 JTextField 객체의 참조값을 필드에 저장하기
		inputMsg=new JTextField(10);
		
		//지역변수를 사용하여 버튼을 생성한다면 이 생성자가 끝나고 나서 
		//button을 다시 사용 할 수 없다.
		JButton btn=new JButton("눌러보셈");
		
		add(inputMsg);
		add(btn);
		
		//버튼을 눌렀을 때 감시할 객체 등록하기
		btn.addActionListener(this);

		
	}

	
	public static void main(String[] args) {
		JFrame f=new MyFrame("나의 프레임");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 500, 500);
		f.setVisible(true);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		//1. JTextField 에 입력한 문자열을 읽어와서 
		//이곳은 생성자를 참조하는 값이고
		String msg=inputMsg.getText();
		//2. 알림창에 띄우기				
		//여기서 this 는 f main 메소드에 실행된 값. 생성자가 new 해서 새로 만들어진 값.
		//this 는 나의 참조값.
		JOptionPane.showMessageDialog(this, msg);
	}
}




// 아래와 같이 JOptionPane this 대신 작성하는 방법.
////필드
//static JFrame gura;
//
//
//public static void main(String[] args) {
//	JFrame f=new MyFrame("나의 프레임");
//	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	f.setBounds(100, 100, 500, 500);
//	f.setVisible(true);
//	
//	MyFrame.gura=f;
//}
//
//
//@Override
//public void actionPerformed(ActionEvent e) {
//	//1. JTextField 에 입력한 문자열을 읽어와서 
//	String msg=inputMsg.getText();
//	//2. 알림창에 띄우기				
//	JOptionPane.showMessageDialog(MyFrame.gura, msg);
//}
//}