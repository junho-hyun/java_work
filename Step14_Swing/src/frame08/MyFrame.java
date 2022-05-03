package frame08;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/*
 * 	JTextField ��ü�� �޼ҵ带 �� Ȱ���ؼ�
 * 
 * 	�޼����� �Է��ϰ� �������� ��ư�� ������
 * 
 * 	�Է��� �޼����� �˸�â�� ��µǵ��� ���α׷��� �غ�����.
 * 
 */


public class MyFrame extends JFrame implements ActionListener{
	JTextField  inputMsg;
	
	//������
	public MyFrame(String title) {
		super(title);
		setLayout(new FlowLayout());
	
		//�ʵ忡 �����ڸ� �����ϰ� ����Ѵٸ�. �������� ������ ���ϰ� ����Ѵٸ� 
		//�� �����ڰ� ������ inputMsg�� new �� �� �����ڸ� �ٽ� ��� �����ϴ�.
		//������ JTextField ��ü�� �������� �ʵ忡 �����ϱ�
		inputMsg=new JTextField(10);
		
		//���������� ����Ͽ� ��ư�� �����Ѵٸ� �� �����ڰ� ������ ���� 
		//button�� �ٽ� ��� �� �� ����.
		JButton btn=new JButton("��������");
		
		add(inputMsg);
		add(btn);
		
		//��ư�� ������ �� ������ ��ü ����ϱ�
		btn.addActionListener(this);

		
	}

	
	public static void main(String[] args) {
		JFrame f=new MyFrame("���� ������");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 500, 500);
		f.setVisible(true);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		//1. JTextField �� �Է��� ���ڿ��� �о�ͼ� 
		//�̰��� �����ڸ� �����ϴ� ���̰�
		String msg=inputMsg.getText();
		//2. �˸�â�� ����				
		//���⼭ this �� f main �޼ҵ忡 ����� ��. �����ڰ� new �ؼ� ���� ������� ��.
		//this �� ���� ������.
		JOptionPane.showMessageDialog(this, msg);
	}
}




// �Ʒ��� ���� JOptionPane this ��� �ۼ��ϴ� ���.
////�ʵ�
//static JFrame gura;
//
//
//public static void main(String[] args) {
//	JFrame f=new MyFrame("���� ������");
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
//	//1. JTextField �� �Է��� ���ڿ��� �о�ͼ� 
//	String msg=inputMsg.getText();
//	//2. �˸�â�� ����				
//	JOptionPane.showMessageDialog(MyFrame.gura, msg);
//}
//}