package frame02;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	//������
	public MyFrame(String title) {
		super(title);
		setBounds(100, 100, 500, 500);
				//�θ� class �̱⿡ JFrame�� �������� (JFrame.EXIT_ON_CLOSE)
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//�������� ���̾ƿ� �Ŵ����� ������� �ʱ� ������ UI�� ���� ��ǥ�� ���� ��ġ�ؾ� �Ѵ�.
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JButton btn1=new JButton("��ư1");
		add(btn1); //�����ӿ� btn1 �߰� �ϱ�
		
		JButton btn2=new JButton("��ư2");
		add(btn2);
		
		JButton btn3=new JButton("��ư3");
	    add(btn3);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame("���� ������");;
		
	}
	
}
