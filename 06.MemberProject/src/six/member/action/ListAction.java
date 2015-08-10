package six.member.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import six.member.dao.MemberDAO;
import six.member.dto.Member;

public class ListAction implements Action {

  @Override
  public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // TODO Auto-generated method stub
    System.out.println("listaction");
    
    List<Member> m = MemberDAO.getInstance().selectAllMembers();
    
    ActionForward forward = new ActionForward();
   
    if(m!=null){
      request.setAttribute("list", m);
      
      forward.setNextURL("./member/list.jsp");
      forward.setForward(true);
    } else {
      // 회원이 없습니다.
      request.setAttribute("errorMsg", "등록된 회원이 없습니다.");
      forward.setNextURL("./error/error.jsp");
      forward.setForward(true);
    }
    
    return forward;
  }

}
