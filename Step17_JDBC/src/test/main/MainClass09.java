package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.mypac.Member;
import test.util.DBConnect;

public class MainClass09 {
	public static void main(String[] args) {
		//�߰��� ȸ���� ����
		String name="�ֵ���";
		String addr="��õ��";
		//ȸ�� �Ѹ��� ������ Member ��ü�� ��´�.
		MemberDto dt=new MemberDto();
		//setter �޼ҵ带 �̿��ؼ� ȸ�������� ���
		dt.setName(name);
		dt.setAddr(addr);
		//�޼ҵ� ȣ���ϸ鼭 MemberDto ��ü�� ������ �����ϱ�
		insert(dt);
		
	}
	
	//ȸ�� �Ѹ��� ������ �߰��ϴ� �޼ҵ�
	public static void insert(MemberDto dto) {
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
			pstmt.setString(1, dto.getName() );
			pstmt.setString(2, dto.getAddr() );
			
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
