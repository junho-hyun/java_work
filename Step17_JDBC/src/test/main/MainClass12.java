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
		//메소드가 리턴해주는 전체 회원의 목록을 main 메소드 안에서 사용하고 싶다면?
		List<MemberDto> list=getList(); //메소드를 호출해서 전체 회원목록을 받아온다.
		for(MemberDto tmp:list) {
			System.out.println(tmp.getNum()+"|"+tmp.getName()+"|"+tmp.getAddr());
		}
	}
	//전체 회원의 목록을 리턴해주는 메소드
	public static List<MemberDto> getList(){
		Connection conn=null;
	    PreparedStatement pstmt=null;
	    ResultSet rs=null;
	    List<MemberDto> list1= new ArrayList<>();
	    try {
	    	conn=new DBConnect().getConn();
			//실행할 sql 문
			String sql="SELECT num,name,addr FROM member"
					+ " ORDER BY num ASC";
			//PreparedStatement 객체의 참조값 얻어오기
			pstmt=conn.prepareStatement(sql);
			//PreparedStatment 객체를 이용해서 query 문 수행하고 결과를
			//ResultSet 객체로 받아오기
			rs=pstmt.executeQuery();
			/*
			 * ResultSet 객체의 . next() 메소드는 cursor 밑에 row 가 존재하는지 확인해서
			 * 만일 존재하면 true 를 리턴하고 cursor 가 한칸 밑으로 이동한다.
			 * 만일 존자히자 않으면 false 를 리턴한다.
			 */
			
			//while 반봅문 돌면서 next 다음 문장. 돌기
			while(rs.next()) {
				MemberDto member=new MemberDto();
				//현제 cursor 가 위치한 곳에서 num 이라는 칼럼의 정수 얻어내기
				member.setNum(rs.getInt("num"));
				//현제 cursor 가 위치한 곳에서 name 이라는 칼럼의 정수 얻어내기
				member.setName(rs.getString("name"));
				//현제 cursor 가 위치한 곳에서 addr 이라는 칼럼의 정수 얻어내기
				member.setAddr(rs.getString("addr"));
				
				list1.add(member);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	    return list1;
	}
	
}
