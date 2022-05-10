package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import test.util.DBConnect;

public class MainClass15 {
	public static void main(String[] args) {
		//삭제항 회원의 번호를 입력 받는다.
		Scanner scan=new Scanner(System.in);
		System.out.println("삭제할 회원 번호 입력:");
		int num=scan.nextInt();
		//작업의 성공 여부를 알고 싶다면 아래와 같이 작성 하여 실행하면 된다.
		boolean isSuccess=delete(num);	
		
		if(isSuccess){
			System.out.println(num+" 번 회원을 삭제 했습니다.");
		}else {
			System.out.println(num+" 번 회원은 존재하지 않습니다.");
		}
	}
	/*
	 * 인자로 전달된 번호에 해당하는 회원 정보를 삭제하고 작업의 성공 여부를 리턴하는 메소드
	 * 
	 * 작업의 성공여부를 리턴하는 메소드로 만들어 보세요!
	 */
	public static boolean delete(int num) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int updatedRowCount=0;
		try {
	        //DBConnect 객체를 이용해서 Connection 객체의 참조값을 얻어온다. 
	        conn=new DBConnect().getConn();
	        //실행할 미완성의 sql 문
	        String sql="DELETE from member"
	        		+ " WHERE num=?";
	        //PreparedStatement 객체의 참조값 얻어오기
	        pstmt=conn.prepareStatement(sql);
	        // ? 에 값을 바인딩해서 미완성의 sql 문을 완성 시킨다.
	        pstmt.setInt(1, num);
	        //sql 문 실행하기 삭제된(추가, 수정, 삭제) row 의 갯수 리턴 받기
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
        	//성공인 경우
        	return true;
        }else {
        	//실패인 경우
        	return false;
        }
	}	
}

// delete 만 사용할 것이면 아래와 같이 사용하는 것이 가독성에 더 좋다.
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
//       System.out.println("회원 정보를 삭제했습니다.");
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