package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dto.SalesDto;
import util.DBConnect;

public class SalesDao {
	
	public boolean insert(SalesDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int updatedRowCount=0;
		try {
	        conn=new DBConnect().getConn();
	        String sql="INSERT into sales"
	        		+ " (num, kinds, price)"
	        		+ " VALUES(sales_seq.NEXTVAL,?, ?)";
	        pstmt=conn.prepareStatement(sql);
	        pstmt.setString(1,dto.getKinds());
	        pstmt.setString(2,dto.getPrice());
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
        	return true;
        }else {
        	return false;
        }
	}
	//회원 정보를 수정하는 메소드
		public boolean update(SalesDto dto) {
			Connection conn=null;
			PreparedStatement pstmt=null;
			int updatedRowCount=0;
			try {
		        conn=new DBConnect().getConn();
		        String sql="UPDATE sales"
		        		+ " SET kinds=?, price=?"
		        		+ " WHERE num=?";
		        pstmt=conn.prepareStatement(sql);
		        pstmt.setString(1, dto.getKinds());
		        pstmt.setString(2, dto.getPrice());
		        pstmt.setInt(3, dto.getNum());
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
	        	return true;
	        }else {
	        	return false;
	        }
		}
		public boolean delete(int num) {
			Connection conn=null;
			PreparedStatement pstmt=null;
			int updatedRowCount=0;
			try {
		        conn=new DBConnect().getConn();
		        String sql="DELETE from sales"
		        		+ " WHERE num=?";
		        pstmt=conn.prepareStatement(sql);
		        pstmt.setInt(1, num);
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
	        	return true;
	        }else {
	        	return false;
	        }
		}
		public SalesDto getData(int num) {
			SalesDto dto=null;
			
			Connection conn=null;
		    PreparedStatement pstmt=null;
		    ResultSet rs=null;
		    try {
		    	conn=new DBConnect().getConn();
				String sql="SELECT kinds,price "
						+ " FROM sales"
						+ " WHERE num=?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1, num);
				rs=pstmt.executeQuery();

				while(rs.next()) {
					dto=new SalesDto();
					dto.setNum(num);
					dto.setKinds(rs.getString("kinds"));
					dto.setPrice(rs.getString("price"));
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
		public List<SalesDto> getList(){
			List<SalesDto> list1= new ArrayList<>();
			
			Connection conn=null;
		    PreparedStatement pstmt=null;
		    ResultSet rs=null;
		    try {
		    	conn=new DBConnect().getConn();
				String sql="SELECT num,kinds,price FROM sales"
						+ " ORDER BY num ASC";
				pstmt=conn.prepareStatement(sql);
				rs=pstmt.executeQuery();
				
				
				while(rs.next()) {
					SalesDto sales=new SalesDto();
					sales.setNum(rs.getInt("num"));
					sales.setKinds(rs.getString("kinds"));
					sales.setPrice(rs.getString("price"));
					//ArrayList 객체에 누적 시키기
					list1.add(sales);	
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
