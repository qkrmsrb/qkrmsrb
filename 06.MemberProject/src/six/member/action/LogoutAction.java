package six.member.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutAction implements Action{

  @Override
  public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // TODO Auto-generated method stub
    
    HttpSession session=request.getSession();
    session.invalidate(); // 모든 세션정보를 삭제하고
    
    ActionForward forward = new ActionForward();
    
    forward.setNextURL("./index.jsp");
    forward.setForward(true);
    
    return forward;
  }

}
