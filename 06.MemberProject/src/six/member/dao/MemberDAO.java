package six.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import six.member.dto.Member;
import six.member.util.DBManager;

public class MemberDAO {
  private static MemberDAO instance = new MemberDAO();
  
  public static MemberDAO getInstance(){
    return instance;
  }
  
  private MemberDAO() {}
  
  // 회원 가입 처리
  public int insertMember(Member m){
    Connection conn = null;
    PreparedStatement pstmt = null;
    int result = 0;
    
    String sql = "insert into member(id, pwd, name, age, gender, addr, regdate)"
        + "values(?,?,?,?,?,?,default)";
    
    try{
      conn = DBManager.getConnection();
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, m.getId());
      pstmt.setString(2, m.getPwd());
      pstmt.setString(3, m.getName());
      pstmt.setInt(4, m.getAge());
      pstmt.setString(5, m.getGender());
      pstmt.setString(6, m.getAddr());
      result = pstmt.executeUpdate();
      
    } catch(SQLException e){
      e.printStackTrace();
    } finally {
      DBManager.closeAll(conn, pstmt);
    }
    
    return result;
  }
  
  // 회원리스트 처리
  public List<Member> selectAllMembers() {
    List<Member> list = new ArrayList<Member>();
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    
    String sql = "select id, name, gender, regdate from member";
    
    try{
      conn = DBManager.getConnection();
      pstmt = conn.prepareStatement(sql);
      rs = pstmt.executeQuery();
      
      while(rs.next()){
        list.add(new Member(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4)));
      }
      
    }catch(SQLException e) {
      e.printStackTrace();
    }finally {
      DBManager.closeAll(rs, conn, pstmt);
    }
    
    return list;
  }
  
  // 회원 상세정보 처리
  public Member seletOneMemberById(String id) {
    Member m = null;
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    
    String sql = "select id, name, age, gender, addr from member where id=?";
    
    try{
      conn = DBManager.getConnection();
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, id);
      rs = pstmt.executeQuery();
      if(rs.next()){
        m = new Member(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5));
      }
      
    }catch(SQLException e){
      e.printStackTrace();
    }finally {
      DBManager.closeAll(rs, conn, pstmt);
    }
    
    return m;
  }
  
  //회원 정보 삭제 처리
  public int deleteMember(String id) {
    Connection conn = null;
    PreparedStatement pstmt = null;
    int result = 0;
    
    String sql = "delete from member where id = ?";
    
    try{
      conn = DBManager.getConnection();
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, id);
      result = pstmt.executeUpdate();
      
    }catch(SQLException e) {
      e.printStackTrace();
    }finally {
      DBManager.closeAll(conn, pstmt);
    }
    
    return result;
  }
  
  // 회원 로그인 처리
  public Member login(String id, String pwd) {
    Member m = null;
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    
    String sql = "select id, name, age, gender, addr from member where id = ? and pwd = ?";
    
    try{
      conn = DBManager.getConnection();
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, id);
      pstmt.setString(2, pwd);
      rs = pstmt.executeQuery();
      
      if(rs.next())
        m = new Member(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5));
      
    }catch(SQLException e) {
      e.printStackTrace();
    }finally {
      DBManager.closeAll(rs, conn, pstmt);
    }
    
    return m;
  }
  
  // 회원 아이디 중복 체크
  public boolean checkId(String id) {
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    boolean check = false;
    
    String sql = "select id from member where id = ?";
    
    try{
      conn = DBManager.getConnection();
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, id);
      rs = pstmt.executeQuery();
      if(rs.next()){
        check = true;
      }
    }catch(SQLException e) {
      e.printStackTrace();
    }finally {
      DBManager.closeAll(rs, conn, pstmt);
    }
    
    return check;
    
  }
}
