package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class test {
	public static void main(String[] args) {
		Connection conn=null;		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
	        String url="jdbc:oracle:thin:@localhost:1521:xe";
	        conn=DriverManager.getConnection(url, "scott", "tiger");
	        System.out.println("Oracle DB ���� ����");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		PreparedStatement pstmt=null;
		
		ResultSet rs=null;
		//
		try {
			String sql="SELECT * FROM sales"
					+ " ORDER BY num ASC";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				int num=rs.getInt("num");
				String kinds=rs.getString("kinds");
				String price=rs.getString("price");
				System.out.println(num+ " | " +kinds +" | "+ price);
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("main �޼ҵ尡 ���� �˴ϴ�.");
		
	}
}













