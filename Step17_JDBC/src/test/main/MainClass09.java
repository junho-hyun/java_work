package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.mypac.Member;
import test.util.DBConnect;

public class MainClass09 {
	public static void main(String[] args) {
		//추가할 회원의 정도
		String name="주뎅이";
		String addr="봉천동";
		//회원 한명의 정보를 Member 객체에 담는다.
		MemberDto dt=new MemberDto();
		//setter 메소드를 이용해서 회원정보를 담고
		dt.setName(name);
		dt.setAddr(addr);
		//메소드 호출하면서 MemberDto 객체의 참조값 전달하기
		insert(dt);
		
	}
	
	//회원 한명의 정보를 추가하는 메소드
	public static void insert(MemberDto dto) {
		//SELECT 작업을 위해서 필요한 객체의 참조값을 담을 지역변수 미리 만들기
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			//DBConnect 객체를 이용해서 Connection 객체의 참조값을 얻어온다.
			conn=new DBConnect().getConn();
			//실행할 sql 문
			
			String sql="INSERT into member"
					+ " (num, name, addr)"
					+ " VALUES(member_seq.NEXTVAL,?, ?)";
			//PreparedStatement 객체의 참조값 얻어오기
			pstmt=conn.prepareStatement(sql);
			// ? 에 값을 바인딩해서 미완성의 sql 문을 완성 시킨다.
			pstmt.setString(1, dto.getName() );
			pstmt.setString(2, dto.getAddr() );
			
			//sql 문 실행하기
			pstmt.executeUpdate();
			
			System.out.println("회원 정보를 저장했습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
				//참조값을 가져와 닫아 줄때는 역순.
			}catch(Exception e) {}
		}
	}
}
