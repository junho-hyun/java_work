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
 *  1. 선택된 row 인덱스를 읽어온다.
 *  int selectedIndex=table.getSelectedRow();
 *  
 *  2. 선택된 row 의 첫번째(0번째) ㅏㄹ럼의 숫자를 읽어온다(삭제할 회원의 번호)
 *  int num=(int)model.getValueAt(selectedIndex,0);
 *  
 */

public class TestFrame2 extends JFrame implements ActionListener{
   //필드
   JTextField inputName, inputAddr;
   DefaultTableModel model;
   JTable table;
   JButton saveBtn, deleteBtn;
  
   
   
   //생성자
   public TestFrame2() {
      setLayout(new BorderLayout());
      
      JLabel label1=new JLabel("이름");
      inputName=new JTextField(10);
      
      JLabel label2=new JLabel("주소");
      inputAddr=new JTextField(10);
      
      saveBtn=new JButton("저장");
      saveBtn.setActionCommand("save");
      
      //삭제 버튼 추가
      deleteBtn=new JButton("삭제");
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
      
      //표형식으로 정보를 출력하기 위한 JTable
      table=new JTable();
      //칼럼명을 String[] 에 순서대로 준비
      String[] colNames= {"번호", "이름", "주소"};
      //테이블에 출력할 정보를 가지고 있는 모델 객체 (칼럼명, row 갯수)
      model=new DefaultTableModel(colNames, 0);
      //모델을 테이블에 연결한다.
      table.setModel(model);
      //스크롤이 가능 하도록 테이블을 JScrollPane 에 감싼다.
      JScrollPane scroll=new JScrollPane(table);
      //JScrollPane  을 프레임의 가운데에 배치하기 
      add(scroll, BorderLayout.CENTER);
      
      displayMember();
   	}
   
   	//테이블에 데이터 출력하는 메소드
   	public void displayMember() {
	   
	   MemberDao dao=new MemberDao();
	   //MemberDto dto=new MemberDto();
	
	   List<MemberDto> list=dao.getList();
	   
	   for(int i=0; i<list.size();i++) {
		   MemberDto data=list.get(i);
		   model.addRow(new Object[] {list.get(i).getNum(), data.getName(), data.getAddr()});

	   }

   
   	}
   
   
   	//main  메소드
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
   			
   			//테이블에 출력된 데이터 reset 시킨후 
   			//이 테이블 reset 은 display 메소드에서 실행해도 된다.
   			model.setRowCount(0);
   			//테이블 불러오기
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