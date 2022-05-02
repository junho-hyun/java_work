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
	//������
	public MyFrame(String title) {
		super(title);
		//MyFrame �� ���̾ƿ� �Ŵ��� �����ϱ�
		setLayout(new FlowLayout());
		//��ư
		JButton sendBtn=new JButton("����");
		JButton removeBtn=new JButton("����");
		//�����ӿ� ��ư �߰��ϱ� ( FlowLayout �� ������ �޴´� )
		add(sendBtn);
		add(removeBtn);
	
		ActionListener listener=new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("����?");
				//�˸�â �����ϴ¹�.
				JOptionPane.showMessageDialog(MyFrame.this, "�����մϴ�~");
			}
		};
		
		MyFrame a = this;
		
		ActionListener listener2=new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("����");
				ActionListener b=this;
										//MyFrame.this, ��� �Է� ����
				JOptionPane.showMessageDialog(MyFrame.this, "���� �մϴ�.");
			}
		};
		
		sendBtn.addActionListener(listener);
		removeBtn.addActionListener(listener2);
		/*
		 * removeBtn.addActionListener(new ActionListener() {
         		@Override
         		public void actionPerformed(ActionEvent e) {
            		System.out.println("����");
         		}
      		});
		 */
	
	}
	
	//��ü �ٱ����� ����, �ٸ� frame ���� ��ü �ȿ��� ���� �Ǿ�����. 
	//�Ʒ��� ���� static ������ class ���ʿ� �����Ǵ� ��쵵 �ִ�. main�޼ҵ� ����.
	public static void main(String[] args) {
		JFrame f=new MyFrame("���� ������");;
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 500, 500);
		f.setVisible(true);
		
		
	}
	
}
