package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass12 {
	public static void main(String[] args) {
		//�޼ҵ尡 �������ִ� ��ü ȸ���� ����� main �޼ҵ� �ȿ��� ����ϰ� �ʹٸ�?
		List<MemberDto> list=getList(); //�޼ҵ带 ȣ���ؼ� ��ü ȸ������� �޾ƿ´�.
		for(MemberDto tmp:list) {
			System.out.println(tmp.getNum()+"|"+tmp.getName()+"|"+tmp.getAddr());
		}
	}
	//��ü ȸ���� ����� �������ִ� �޼ҵ�
	public static List<MemberDto> getList(){
		Connection conn=null;
	    PreparedStatement pstmt=null;
	    ResultSet rs=null;
	    List<MemberDto> list1= new ArrayList<>();
	    try {
	    	conn=new DBConnect().getConn();
			//������ sql ��
			String sql="SELECT num,name,addr FROM member"
					+ " ORDER BY num ASC";
			//PreparedStatement ��ü�� ������ ������
			pstmt=conn.prepareStatement(sql);
			//PreparedStatment ��ü�� �̿��ؼ� query �� �����ϰ� �����
			//ResultSet ��ü�� �޾ƿ���
			rs=pstmt.executeQuery();
			/*
			 * ResultSet ��ü�� . next() �޼ҵ�� cursor �ؿ� row �� �����ϴ��� Ȯ���ؼ�
			 * ���� �����ϸ� true �� �����ϰ� cursor �� ��ĭ ������ �̵��Ѵ�.
			 * ���� �������� ������ false �� �����Ѵ�.
			 */
			
			//while �ݺ��� ���鼭 next ���� ����. ����
			while(rs.next()) {
				MemberDto member=new MemberDto();
				//���� cursor �� ��ġ�� ������ num �̶�� Į���� ���� ����
				member.setNum(rs.getInt("num"));
				//���� cursor �� ��ġ�� ������ name �̶�� Į���� ���� ����
				member.setName(rs.getString("name"));
				//���� cursor �� ��ġ�� ������ addr �̶�� Į���� ���� ����
				member.setAddr(rs.getString("addr"));
				
				list1.add(member);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	    return list1;
	}
	
}