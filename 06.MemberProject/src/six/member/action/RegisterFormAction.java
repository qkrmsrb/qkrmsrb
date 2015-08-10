package six.member.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterFormAction implements Action {

  @Override
  public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
    System.out.println("RegisterFormAction");
    
    ActionForward forward = new ActionForward();
    forward.setForward(true);
    forward.setNextURL("./member/register.jsp");
      
    return forward;
  }

}
