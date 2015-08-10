package six.member.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import six.member.dao.MemberDAO;
import six.member.dto.Member;

public class LoginAction implements Action {

  @Override
  public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // TODO Auto-generated method stub
    
    String id = request.getParameter("id");
    String pwd = request.getParameter("pwd");
    
    Member m = MemberDAO.getInstance().login(id, pwd);
    
    ActionForward forward = new ActionForward();
    
    if(m != null) {
      HttpSession session=request.getSession();
      session.setAttribute("loginInfo", m);
      forward.setNextURL("./index.jsp");
      forward.setForward(true);
    } else {
      //아이디와 비밀번호가 맞지 않습니다.
      request.setAttribute("errorMsg", "아이디와 비밀번호가 맞지 않습니다.");
      forward.setNextURL("./error/error.jsp");
      forward.setForward(true);
    }

    return forward;
  }

}
