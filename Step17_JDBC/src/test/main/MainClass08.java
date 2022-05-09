package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;

import test.mypac.Member;
import test.util.DBConnect;

public class MainClass08 {
	public static void main(String[] args) {
		//�߰��� ȸ���� ����
		String name="���";
		String addr="�󵵵�";
		
		//HashMap ��ü�� �����ؼ�
		Map<String,String> mp=new HashMap<>();
		//�߰��� ȸ�� ������ ��´�.
		mp.put("name", name);
		mp.put("addr", addr);
		
		//�޼ҵ� ȣ���ϸ鼭 ����
		insert(mp);
	}
	
	//ȸ�� �Ѹ��� ������ �߰��ϴ� �޼ҵ�					ȣ�� M
	public static void insert(Map<String, String> map) {
		//SELECT �۾��� ���ؼ� �ʿ��� ��ü�� �������� ���� �������� �̸� �����
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			//DBConnect ��ü�� �̿��ؼ� Connection ��ü�� �������� ���´�.
			conn=new DBConnect().getConn();
			//������ sql ��
			
			String sql="INSERT into member"
					+ " (num, name, addr)"
					+ " VALUES(member_seq.NEXTVAL,?, ?)";
			//PreparedStatement ��ü�� ������ ������
			pstmt=conn.prepareStatement(sql);
			// ? �� ���� ���ε��ؼ� �̿ϼ��� sql ���� �ϼ� ��Ų��.
			pstmt.setString(1, map.get("name"));
			pstmt.setString(2, map.get("addr"));
			
			//sql �� �����ϱ�
			pstmt.executeUpdate();
			
			System.out.println("ȸ�� ������ �����߽��ϴ�.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
				//�������� ������ �ݾ� �ٶ��� ����.
			}catch(Exception e) {}
		}
	}
}
