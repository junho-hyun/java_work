package frame01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	//생성자
	public MyFrame(String title) {
		//부모생성자에 프레임의 제목 넘겨주기
		super(title);
		setBounds(100, 100, 500, 500);
			//EXIT_ON_CLOSE 는  JFrame.EXIT_ON_CLOSE 라고 써 주어야 하는데
			//부모 상속자인 JFrame 에서 받아온거기에 클래스명과 . 을 안찍어주고 사용 가능하다.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//프레임의 레이아웃 매니저를 사용하지 않기 때문에 UI를 절대 좌표에 직접 배치해야 한다.
		setLayout(null);
		
		JButton btn1=new JButton("버튼1");
		//버튼의 위치
		btn1.setLocation(10, 10);
		//버튼의 크기
		btn1.setSize(100, 30);
		
		add(btn1); //프레임에 btn1 추가 하기
		
		JButton btn2=new JButton("버튼2");
		btn2.setLocation(120, 10);
		btn2.setSize(100,30);
		add(btn2);
		
		//set Location,size 를 한번해 해주는건 setBounds.
		JButton btn3=new JButton("버튼3");
	    btn3.setBounds(230,10,100,30);
	    add(btn3);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame("나의 프레임");;
		
	}
	
}
