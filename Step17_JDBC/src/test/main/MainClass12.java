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
		//회원 목록을 담을 ArrayList 객체 생성 (MemberDto) 객체를 담을 List 이니 리스트를 만들어 줘야한다.
		List<MemberDto> list1= new ArrayList<>();
		
		//SELECT 작업을 위해서 필요한 객체의 참조값을 담을 지역변수 미리 만들기
		Connection conn=null;
	    PreparedStatement pstmt=null;
	    ResultSet rs=null;
	    try {
	    	conn=new DBConnect().getConn();
			//실행할 sql 문
			String sql="SELECT num,name,addr FROM member"
					+ " ORDER BY num ASC";
			//PreparedStatement 객체의 참조값 얻어오기
			pstmt=conn.prepareStatement(sql);
			//PreparedStatment 객체를 이용해서 query 문 수행하고 결과를
			//ResultSet 객체로 받아오기
			//		select => executeQuery(); 라는 뜻이다.
			rs=pstmt.executeQuery();
			/*
			 * ResultSet 객체의 . next() 메소드는 cursor 밑에 row 가 존재하는지 확인해서
			 * 만일 존재하면 true 를 리턴하고 cursor 가 한칸 밑으로 이동한다.
			 * 만일 존자히자 않으면 false 를 리턴한다.
			 */
			
			//while 반봅문 돌면서 next 다음 문장. 돌기
			while(rs.next()) {
				//회원 정부를 저장할 MemberDto 객체 생성
				MemberDto member=new MemberDto();
				//현제 cursor 가 위치한 곳에서 num 이라는 칼럼의 정수 얻어내기
				member.setNum(rs.getInt("num"));
				//현제 cursor 가 위치한 곳에서 name 이라는 칼럼의 정수 얻어내기
				member.setName(rs.getString("name"));
				//현제 cursor 가 위치한 곳에서 addr 이라는 칼럼의 정수 얻어내기
				member.setAddr(rs.getString("addr"));
				//ArrayList 객체에 누적 시키기
				list1.add(member);
				
				/*
				 *  혹은 
				 *  //new MemberDto 가 while 문 안에 있어야
				 *  하나가 성생되고 그 다음이 또 생성되고 하지 반복문 밖에 있으면
				 *  여러개를 쓸 수 없다.
				 *  
				 *  MemberDto member=new MemberDto(); 생성하고
				 *
				 *  int num=rs.getInt("num");
				 *  String name=rs.getString("name");
				 *  String addr=rs.getString("addr");
				 *   
				 *  //회원 정보를 객체에 담아서 실행하느 방식 하지만 한번밖에
				 *  안쓸거기 때문에 굳이 지역변수를 만들어서 담을 필요는 없다.
				 *  member.setNum(num);
				 *  member.setName(name);
				 *  member.setAddr(addr);
				 *  //작성 방법만 다를뿐 같은 방식이다.
				 *  list1.add(member);
				 *  이렇게 실해해도 된다.
				 */
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
