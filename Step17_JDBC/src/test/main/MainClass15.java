package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import test.util.DBConnect;

public class MainClass15 {
	public static void main(String[] args) {
		//������ ȸ���� ��ȣ�� �Է� �޴´�.
		Scanner scan=new Scanner(System.in);
		System.out.println("������ ȸ�� ��ȣ �Է�:");
		int num=scan.nextInt();
		//�۾��� ���� ���θ� �˰� �ʹٸ� �Ʒ��� ���� �ۼ� �Ͽ� �����ϸ� �ȴ�.
		boolean isSuccess=delete(num);	
		
		if(isSuccess){
			System.out.println(num+" �� ȸ���� ���� �߽��ϴ�.");
		}else {
			System.out.println(num+" �� ȸ���� �������� �ʽ��ϴ�.");
		}
	}
	/*
	 * ���ڷ� ���޵� ��ȣ�� �ش��ϴ� ȸ�� ������ �����ϰ� �۾��� ���� ���θ� �����ϴ� �޼ҵ�
	 * 
	 * �۾��� �������θ� �����ϴ� �޼ҵ�� ����� ������!
	 */
	public static boolean delete(int num) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int updatedRowCount=0;
		try {
	        //DBConnect ��ü�� �̿��ؼ� Connection ��ü�� �������� ���´�. 
	        conn=new DBConnect().getConn();
	        //������ �̿ϼ��� sql ��
	        String sql="DELETE from member"
	        		+ " WHERE num=?";
	        //PreparedStatement ��ü�� ������ ������
	        pstmt=conn.prepareStatement(sql);
	        // ? �� ���� ���ε��ؼ� �̿ϼ��� sql ���� �ϼ� ��Ų��.
	        pstmt.setInt(1, num);
	        //sql �� �����ϱ� ������(�߰�, ����, ����) row �� ���� ���� �ޱ�
	        updatedRowCount=pstmt.executeUpdate();
	        
	     }catch(Exception e) {
	        e.printStackTrace();
	     }finally {
	        try {
	           if(pstmt!=null)pstmt.close();
	           if(conn!=null)conn.close();
	        }catch(Exception e) {}
	    }
		if(updatedRowCount > 0) {
        	//������ ���
        	return true;
        }else {
        	//������ ���
        	return false;
        }
	}	
}

// delete �� ����� ���̸� �Ʒ��� ���� ����ϴ� ���� �������� �� ����.
//public static boolean delete(int num) {
//    boolean isDelete = false;
//    Connection conn = null;
//    PreparedStatement pstmt = null;
//    try {
//       conn = new DBConnect().getConn();
//       String sql = "DELETE FROM member" + " WHERE num=?";
//       pstmt = conn.prepareStatement(sql);
//       pstmt.setInt(1, num);
//       int updatedRowCount = pstmt.executeUpdate();
//       if(updatedRowCount!=0) isDelete=true;
//       System.out.println("ȸ�� ������ �����߽��ϴ�.");
//    } catch (Exception e) {
//       e.printStackTrace();
//    } finally {
//       try {
//          if (pstmt != null)pstmt.close();
//          if (conn != null)conn.close();
//       } catch (Exception e) {}
//    }
//    return isDelete;
// }