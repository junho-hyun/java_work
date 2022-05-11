package frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import dao.SalesDao;
import dto.SalesDto;

public class SalesFrame extends JFrame implements ActionListener, PropertyChangeListener{
	JTextField inputKinds,inputPrice;
	JTable table;
	DefaultTableModel model;
	JLabel label_result;
	public SalesFrame() {
		setLayout(new BorderLayout());
		
		JLabel label1=new JLabel("종류");
		inputKinds=new JTextField(20);
		
		JLabel label2=new JLabel("가격");
		inputPrice=new JTextField(20);
		
		JButton saveBtn=new JButton("추가");
		saveBtn.setActionCommand("add");
		
		JButton deleteBtn=new JButton("삭제");
		deleteBtn.setActionCommand("delete");
		
		JLabel label3=new JLabel("매출액: ");
		label_result=new JLabel("0");
		
		
		JPanel panel=new JPanel();
		panel.add(label1);
		panel.add(inputKinds);
		panel.add(label2);
		panel.add(inputPrice);
		panel.add(saveBtn);
		panel.add(deleteBtn);
		panel.add(label3);
		panel.add(label_result);
		
		add(panel, BorderLayout.NORTH);
		
		
		table=new JTable();
		String[] colNames= {"번호","종류","가격"};
		model=new DefaultTableModel(colNames, 0);
		
		table.setModel(model);
		JScrollPane scroll=new JScrollPane(table);
		add(scroll, BorderLayout.CENTER);
		
		displaySales();
		
		saveBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		table.addPropertyChangeListener(this);
			

	}
	
	public void displaySales() {
		model.setRowCount(0);
		SalesDao dao=new SalesDao();
		List<SalesDto> list=dao.getList();
		
		for(SalesDto tmp:list) {
			Object[] row= {tmp.getNum(),tmp.getKinds(),tmp.getPrice()};
			model.addRow(row);
		}
		double sold3 = 0;
		List<SalesDto> list3=dao.getList();
		for(SalesDto tmp2:list) {
			String sm=tmp2.getPrice();
			double sm1=Double.parseDouble(sm);
			sold3+=sm1;
			String result=Double.toString(sold3);
			label_result.setText(result);}
	}
	
	public static void main(String[] args) {
		SalesFrame f=new SalesFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 800, 500);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double sold = 0;
		SalesDao dao=new SalesDao();
		
		try {
			
		String command=e.getActionCommand();
		if(command.equals("add")) {
			String kinds=inputKinds.getText();
			String price=inputPrice.getText();
			
			SalesDto dto=new SalesDto();
			dto.setKinds(kinds);
			dto.setPrice(price);
			
			dao.insert(dto);
			displaySales();
			
			
		}else if(command.equals("delete")) {
			int[] rows=table.getSelectedRows();
			if(rows.length == 0) {
				JOptionPane.showMessageDialog(this, "선택된게 없습니다.");
				return;
			}
			for(int tmp:rows) {
				int num=(int)model.getValueAt(tmp, 0);
				dao=new SalesDao();
				dao.delete(num);		
			}
		}
		
		}catch(Exception e1) {
			e1.printStackTrace();
			JOptionPane.showMessageDialog(this, "가격에 숫자만 입력해 주세요");
			
		}displaySales();
		
	
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println("property change!");
		System.out.println("property name:"+evt.getPropertyName());

		System.out.println("isEditing:"+table.isEditing());		
		if(evt.getPropertyName().equals("tableCellEditor") && !table.isEditing()) {
			
		int selectedIndex=table.getSelectedRow();
        int num=(int)model.getValueAt(selectedIndex, 0);
        String kinds=(String)model.getValueAt(selectedIndex, 1);
        String price=(String)model.getValueAt(selectedIndex, 2);
        
        SalesDto dto=new SalesDto(num, kinds, price);
        new SalesDao().update(dto);
        table.clearSelection();
		}
	}
}
