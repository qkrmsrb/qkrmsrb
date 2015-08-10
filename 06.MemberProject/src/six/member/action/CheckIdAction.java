package six.member.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import six.member.dao.MemberDAO;

public class CheckIdAction implements Action {

  @Override
  public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // TODO Auto-generated method stub
    
    System.out.println("checkidAction");
    
    String id = request.getParameter("id");
    
    boolean check = MemberDAO.getInstance().checkId(id);
        
    PrintWriter out = response.getWriter();
    out.print(check);
    out.close();
    
    return null;
  }

}
