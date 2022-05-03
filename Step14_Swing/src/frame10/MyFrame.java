package frame10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
/*
 * 	hint
 * 	
 * 	- ���ڿ��� ���ڷ� �ٲٴ� ���
 * 	
 * 	double num1=Double.parseDouble("���������� ���ڿ�");
 */

public class MyFrame extends JFrame implements ActionListener{
	JButton plusBtn;
	JButton minusBtn;
	JButton multiBtn;
	JButton divideBtn;
	JTextField tf_num1;
	JTextField tf_num2;
	JLabel label_result;
	//������
	public MyFrame(String title) {
		super(title);
		//	BorderLayout ���� ���
		setLayout(new BorderLayout());
		
	    //JPanel
	    JPanel topPanel=new JPanel();
	    topPanel.setBackground(Color.YELLOW);
	    //Panel �� ���ʿ� ��ġ�ϱ� 
	    add(topPanel, BorderLayout.NORTH);
	    
	    //JTextField ��ü�� ���鿡�� JPanel �� �߰��ϱ� 
	    tf_num1=new JTextField(10);
	    topPanel.add(tf_num1);
	    //��� ��ư ��ü�� ���� JPanel �� �߰��ϱ�
	    plusBtn=new JButton("+");
	    minusBtn=new JButton("-");
	    multiBtn=new JButton("*");
	    divideBtn=new JButton("/");
	    topPanel.add(plusBtn);
	    topPanel.add(minusBtn);
	    topPanel.add(multiBtn);
	    topPanel.add(divideBtn);
	    //�ι�° JTextField  ���� ��ο� �߰� �ϱ� 
	    tf_num2=new JTextField(10);
	    topPanel.add(tf_num2);
	    //JLabel
	    JLabel label1=new JLabel("=");
	    label_result=new JLabel("0");
	    //��ο� ���̺� �߰��ϱ�
	    topPanel.add(label1);
	    topPanel.add(label_result);
	    
		plusBtn.addActionListener(this);
		minusBtn.addActionListener(this);
		multiBtn.addActionListener(this);
		divideBtn.addActionListener(this);
	}

	public static void main(String[] args) {
		JFrame f=new MyFrame("���� ������");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 500, 500);
		f.setVisible(true);
		
	}


	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//�Է��� ���ڿ��� �о�ͼ�
		String v1=tf_num1.getText();
		String v2=tf_num2.getText();
	
		
		try {
			//���ڷ� �ٲٱ�
			double n1=Double.parseDouble(v1);
			double n2=Double.parseDouble(v2);
				
			if(e.getSource() == plusBtn) {
				double result = n1 + n2;
				String r1=Double.toString(result);
				label_result.setText(r1);
			}else if(e.getSource() == minusBtn){
				double result = n1 - n2;
				String r1=Double.toString(result);
				label_result.setText(r1);
			}else if(e.getSource() == multiBtn) {
				double result = n1 * n2;
				String r1=Double.toString(result);
				label_result.setText(r1);
			}else if(e.getSource() == divideBtn) {
				//���� �Ƚᵵ��
				String r1=Double.toString(n1/n2);
				label_result.setText(r1);
			}
		}catch (NumberFormatException e1) {
			e1.printStackTrace();
			JOptionPane.showMessageDialog(this, "���� �������� �Է��ϼ���");
		}catch (ArithmeticException ae) {
			ae.printStackTrace();
		}
	}
/*
 * public class Calculator extends JFrame implements ActionListener {
    JPanel topPanel=new JPanel();

    JTextField tf_num1=new JTextField(10);

    JTextField tf_num2=new JTextField(10);

    JLabel label_result=new JLabel("0");

    public Calculator(String title) {
        super(title);

        topPanel.setBackground(Color.YELLOW);
        add(topPanel, BorderLayout.NORTH);
      
        topPanel.add(tf_num1);
      

        JButton plusBtn=new JButton("+");
        JButton minusBtn=new JButton("-");
        JButton multiBtn=new JButton("*");
        JButton divideBtn=new JButton("/");

        plusBtn.addActionListener(this);
        minusBtn.addActionListener(this);
        multiBtn.addActionListener(this);
        divideBtn.addActionListener(this);

        topPanel.add(plusBtn);
        topPanel.add(minusBtn);
        topPanel.add(multiBtn);
        topPanel.add(divideBtn);      
        topPanel.add(tf_num2);
      
        JLabel label1=new JLabel("=");
      
        topPanel.add(label1);
        topPanel.add(label_result);
    }

    public void calculate(String operator) {
        try {
            double num1 = Double.parseDouble(this.tf_num1.getText());
            double num2 = Double.parseDouble(this.tf_num2.getText());

            switch (operator) {
                case "+":
                    show(num1 + num2 + "");
                    break;
                case "-":
                    show(num1 - num2 + "");
                    break;
                case "*":
                    show(num1 * num2 + "");
                    break;
                case "/":
                    if (num2 == 0) {
                        throw new ArithmeticException("/ by zero");
                    }
                    show(num1 / num2 + "");
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            show("���ڸ� �Է��ϼ���!!");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            show("0���� ���� �� �����ϴ�!!");
        } finally {
            this.tf_num1.setText("");
            this.tf_num2.setText("");
            this.tf_num1.grabFocus();
        }
    }

    public void show(String message) {
        this.label_result.setText(message);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        calculate(event.getActionCommand());
    }   

    public static void main(String[] args) {
        JFrame calculator = new Calculator("CALCULATOR");   

        calculator.setBounds(100, 100, 800, 500);
        calculator.setVisible(true);
    }
}
 */
	
	
	
	/*
	 * package frame10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
   //�ʵ�
   JTextField tf_num1, tf_num2;
   JLabel label_result;
   
   
   //default  ������
   public MyFrame() {
      //�������� ���̾ƿ� ��Ģ �����ϱ� 
      setLayout(new BorderLayout());
      
      //JPanel
      JPanel topPanel=new JPanel();
      topPanel.setBackground(Color.YELLOW);
      //Panel �� ���ʿ� ��ġ�ϱ� 
      add(topPanel, BorderLayout.NORTH);
      
      //JTextField ��ü�� ���鿡�� JPanel �� �߰��ϱ� 
      JTextField tf_num1=new JTextField(10);
      topPanel.add(tf_num1);
      //��� ��ư ��ü�� ���� JPanel �� �߰��ϱ�
      JButton plusBtn=new JButton("+");
      JButton minusBtn=new JButton("-");
      JButton multiBtn=new JButton("*");
      JButton divideBtn=new JButton("/");
      topPanel.add(plusBtn);
      topPanel.add(minusBtn);
      topPanel.add(multiBtn);
      topPanel.add(divideBtn);
      //�ι�° JTextField  ���� ��ο� �߰� �ϱ� 
      JTextField tf_num2=new JTextField(10);
      topPanel.add(tf_num2);
      //JLabel
      JLabel label1=new JLabel("=");
      JLabel label_result=new JLabel("0");
      //��ο� ���̺� �߰��ϱ�
      topPanel.add(label1);
      topPanel.add(label_result);
      
      //��ư�� ������ ����ϱ�
      plusBtn.addActionListener(this);
      minusBtn.addActionListener(this);
      multiBtn.addActionListener(this);
      divideBtn.addActionListener(this);
      //��ư�� �׼� command �����ϱ�
      plusBtn.setActionCommand("plus");
      minusBtn.setActionCommand("minus");
      multiBtn.setActionCommand("multi");
      divideBtn.setActionCommand("divide");
      
   }
   
   public static void main(String[] args) {
      //MyFrame Ŭ������ �̿��ؼ� ��ü �����ϰ� �������� �������� frame �� ��� 
      MyFrame frame=new MyFrame();
      //�������� ���� ����
      frame.setTitle("����");
      //�������� ������ �ڵ����� ���μ����� ���� �ǵ��� �Ѵ�.
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setBounds(100, 100, 500, 500);
      frame.setVisible(true);
   }
   //ActionListener �������̽��� ���� �ؼ� ���� �������̵�� �޼ҵ� 
   @Override
   public void actionPerformed(ActionEvent e) {
      try {
         //JTextField �� �Է��� ���ڿ��� �о�ͼ� ����(�Ǽ�)�� �ٲ��ش�.
         double num1=Double.parseDouble(tf_num1.getText());
         double num2=Double.parseDouble(tf_num2.getText());
         //������ ������� ���� ���� ����
         double result=0;
         //������ ��ư�� command �о����
         String command=e.getActionCommand();
         if(command.equals("plus")) {
            result=num1+num2;
         }else if(command.equals("minus")) {
            result=num1-num2;
         }else if(command.equals("multi")) {
            result=num1*num2;
         }else if(command.equals("divide")) {
            result=num1/num2;
         }
         //��� ���� JLabel �� ����ϱ� 
         label_result.setText(Double.toString(result));
      }catch(Exception exe) {
         JOptionPane.showMessageDialog(this, "���� �������� �Է��� �ּ���");
      }
   }
}






	 */
}	

