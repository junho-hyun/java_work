package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MemberDao {
	
	//ȸ�� ������ �����ϴ� �޼ҵ�
	public boolean insert(MemberDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int updatedRowCount=0;
		try {
	        //DBConnect ��ü�� �̿��ؼ� Connection ��ü�� �������� ���´�. 
	        conn=new DBConnect().getConn();
	        //������ �̿ϼ��� sql ��
	        String sql="INSERT into member"
	        		+ " (num, name, addr)"
	        		+ " VALUES(member_seq.NEXTVAL,?, ?)";
	        //PreparedStatement ��ü�� ������ ������
	        pstmt=conn.prepareStatement(sql);
	        // ? �� ���� ���ε��ؼ� �̿ϼ��� sql ���� �ϼ� ��Ų��.
	        pstmt.setString(1,dto.getName());
	        pstmt.setString(2,dto.getAddr());
	        //sql �� �����ϱ� �߰���(�߰�, ����, ����) row �� ���� ���� �ޱ�
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
	//ȸ�� ������ �����ϴ� �޼ҵ�
	public boolean update(MemberDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int updatedRowCount=0;
		try {
	        //DBConnect ��ü�� �̿��ؼ� Connection ��ü�� �������� ���´�. 
	        conn=new DBConnect().getConn();
	        //������ �̿ϼ��� sql ��
	        String sql="UPDATE member"
	        		+ " SET name=?, addr=?"
	        		+ " WHERE num=?";
	        //PreparedStatement ��ü�� ������ ������
	        pstmt=conn.prepareStatement(sql);
	        // ? �� ���� ���ε��ؼ� �̿ϼ��� sql ���� �ϼ� ��Ų��.
	        pstmt.setString(1, dto.getName());
	        pstmt.setString(2, dto.getAddr());
	        pstmt.setInt(3, dto.getNum());
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
	//ȸ�� �Ѹ��� ������ �����ϴ� �޼ҵ�
	public boolean delete(int num) {
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
	//ȸ�� �Ѹ��� ������ �����ϴ� �޼ҵ�
	public MemberDto getData(int num) {
		//MemberDto ��ü�� ���� ���� ������ �̸� �����.
		MemberDto dto=null;
		
		Connection conn=null;
	    PreparedStatement pstmt=null;
	    ResultSet rs=null;
	    try {
	    	conn=new DBConnect().getConn();
	    	//������ sql ��
			String sql="SELECT name,addr "
					+ " FROM member"
					+ " WHERE num=?";
			//PreparedStatement ��ü�� ������ ������
			pstmt=conn.prepareStatement(sql);
			//�̿ϼ��� ? �� ���ε� �Ұ� ������ �ϱ�
			pstmt.setInt(1, num);
			//PreparedStatment ��ü�� �̿��ؼ� query �� �����ϰ� �����
			//ResultSet ��ü�� �޾ƿ���
			rs=pstmt.executeQuery();

			while(rs.next()) {
				dto=new MemberDto();
				dto.setNum(num);
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		return dto;
	}
	//ȸ�� ����� �����ϴ� �޼ҵ�
	public List<MemberDto> getList(){
		List<MemberDto> list1= new ArrayList<>();
		
		//SELECT �۾��� ���ؼ� �ʿ��� ��ü�� �������� ���� �������� �̸� �����
		Connection conn=null;
	    PreparedStatement pstmt=null;
	    ResultSet rs=null;
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
			
			
			//while �ݺ��� ���鼭 next ���� ����. ����
			while(rs.next()) {
				//ȸ�� ���θ� ������ MemberDto ��ü ����
				MemberDto member=new MemberDto();
				//���� cursor �� ��ġ�� ������ num �̶�� Į���� ���� ����
				member.setNum(rs.getInt("num"));
				//���� cursor �� ��ġ�� ������ name �̶�� Į���� ���� ����
				member.setName(rs.getString("name"));
				//���� cursor �� ��ġ�� ������ addr �̶�� Į���� ���� ����
				member.setAddr(rs.getString("addr"));
				//ArrayList ��ü�� ���� ��Ű��
				list1.add(member);	
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
	         try {
	            if(rs!=null)rs.close();
	        	if(pstmt!=null)pstmt.close();
	            if(conn!=null)conn.close();
	         }catch(Exception e) {}
	
		} return list1;
	}
	
}