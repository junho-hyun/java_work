package frame01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	//������
	public MyFrame(String title) {
		//�θ�����ڿ� �������� ���� �Ѱ��ֱ�
		super(title);
		setBounds(100, 100, 500, 500);
			//EXIT_ON_CLOSE ��  JFrame.EXIT_ON_CLOSE ��� �� �־�� �ϴµ�
			//�θ� ������� JFrame ���� �޾ƿ°ű⿡ Ŭ������� . �� ������ְ� ��� �����ϴ�.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//�������� ���̾ƿ� �Ŵ����� ������� �ʱ� ������ UI�� ���� ��ǥ�� ���� ��ġ�ؾ� �Ѵ�.
		setLayout(null);
		
		JButton btn1=new JButton("��ư1");
		//��ư�� ��ġ
		btn1.setLocation(10, 10);
		//��ư�� ũ��
		btn1.setSize(100, 30);
		
		add(btn1); //�����ӿ� btn1 �߰� �ϱ�
		
		JButton btn2=new JButton("��ư2");
		btn2.setLocation(120, 10);
		btn2.setSize(100,30);
		add(btn2);
		
		//set Location,size �� �ѹ��� ���ִ°� setBounds.
		JButton btn3=new JButton("��ư3");
	    btn3.setBounds(230,10,100,30);
	    add(btn3);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame("���� ������");;
		
	}
	
}
