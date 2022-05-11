package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dto.MemberDto;

/*
 *  1. ���õ� row �ε����� �о�´�.
 *  int selectedIndex=table.getSelectedRow();
 *  
 *  2. ���õ� row �� ù��°(0��°) �������� ���ڸ� �о�´�(������ ȸ���� ��ȣ)
 *  int num=(int)model.getValueAt(selectedIndex,0);
 *  
 */

public class TestFrame2 extends JFrame implements ActionListener{
   //�ʵ�
   JTextField inputName, inputAddr;
   DefaultTableModel model;
   JTable table;
   JButton saveBtn, deleteBtn;
  
   
   
   //������
   public TestFrame2() {
      setLayout(new BorderLayout());
      
      JLabel label1=new JLabel("�̸�");
      inputName=new JTextField(10);
      
      JLabel label2=new JLabel("�ּ�");
      inputAddr=new JTextField(10);
      
      saveBtn=new JButton("����");
      saveBtn.setActionCommand("save");
      
      //���� ��ư �߰�
      deleteBtn=new JButton("����");
      deleteBtn.setActionCommand("delete");
      
      add(inputName);
      add(inputAddr);
      add(saveBtn);
      add(deleteBtn);
      
      saveBtn.addActionListener(this);
      deleteBtn.addActionListener(this);
      
      
      JPanel panel=new JPanel();
      panel.add(label1);
      panel.add(inputName);
      panel.add(label2);
      panel.add(inputAddr);
      panel.add(saveBtn);
      panel.add(deleteBtn);
      
      add(panel, BorderLayout.NORTH);
      
      //ǥ�������� ������ ����ϱ� ���� JTable
      table=new JTable();
      //Į������ String[] �� ������� �غ�
      String[] colNames= {"��ȣ", "�̸�", "�ּ�"};
      //���̺� ����� ������ ������ �ִ� �� ��ü (Į����, row ����)
      model=new DefaultTableModel(colNames, 0);
      //���� ���̺� �����Ѵ�.
      table.setModel(model);
      //��ũ���� ���� �ϵ��� ���̺��� JScrollPane �� ���Ѵ�.
      JScrollPane scroll=new JScrollPane(table);
      //JScrollPane  �� �������� ����� ��ġ�ϱ� 
      add(scroll, BorderLayout.CENTER);
      
      displayMember();
   	}
   
   	//���̺� ������ ����ϴ� �޼ҵ�
   	public void displayMember() {
	   
	   MemberDao dao=new MemberDao();
	   //MemberDto dto=new MemberDto();
	
	   List<MemberDto> list=dao.getList();
	   
	   for(int i=0; i<list.size();i++) {
		   MemberDto data=list.get(i);
		   model.addRow(new Object[] {list.get(i).getNum(), data.getName(), data.getAddr()});

	   }

   
   	}
   
   
   	//main  �޼ҵ�
   	public static void main(String[] args) {
      TestFrame2 f=new TestFrame2();
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setBounds(100, 100, 800, 500);
      f.setVisible(true);
   	}

   	@Override
   	public void actionPerformed(ActionEvent e) {
   		String name=inputName.getText();
   		String addr=inputAddr.getText();
   		
   		if(e.getSource() == saveBtn) {
   			MemberDao dao=new MemberDao();
   			MemberDto dto=new MemberDto();
   			
   			dto.setAddr(addr);
   			dto.setName(name);
   			dao.insert(dto);
   			
   			//���̺� ��µ� ������ reset ��Ų�� 
   			//�� ���̺� reset �� display �޼ҵ忡�� �����ص� �ȴ�.
   			model.setRowCount(0);
   			//���̺� �ҷ�����
   			displayMember();
   			
   		}else if(e.getSource() == deleteBtn) {
   			MemberDao dao=new MemberDao();
   			MemberDto dto=new MemberDto();
   			
   			int selectedIndex=table.getSelectedRow();
   			int num=(int)model.getValueAt(selectedIndex,0);
   			
   			dao.delete(num);
   			
   			model.setRowCount(0);
   			displayMember();
   		}
   	}
}