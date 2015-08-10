package six.member.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import six.member.dao.MemberDAO;
import six.member.dto.Member;

public class RegisterAction implements Action {

  @Override
  public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // TODO Auto-generated method stub
    
    String id = request.getParameter("id");
    String pwd = request.getParameter("pwd");
    String name = request.getParameter("name");
    int age = Integer.parseInt(request.getParameter("age"));
    String gender = request.getParameter("gender");
    String addr = request.getParameter("addr");
    
    int result = MemberDAO.getInstance().insertMember(new Member(id, pwd, name, age, gender, addr));
    
    ActionForward forward = new ActionForward();
    
    if(result != 0) {
      forward.setNextURL("/loginForm.six");
      forward.setForward(true);
    } else {
      request.setAttribute("errorMsg", "회원가입실패");
      forward.setNextURL("./error/error.jsp");
      forward.setForward(true);
    }

    return forward;
  }

}
