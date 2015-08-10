package six.member.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import six.member.dao.MemberDAO;

public class DeleteAction implements Action {

  @Override
  public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // TODO Auto-generated method stub
    
    String id = request.getParameter("id");
    
    int result = MemberDAO.getInstance().deleteMember(id);
    
    ActionForward forward = new ActionForward();
    
    if(result != 0) {
      forward.setNextURL("/list.six");
      forward.setForward(true);
    } else {
      // 해당 ID가 없습니다.
      request.setAttribute("errorMsg", "등록된 ID가 없습니다.");
      forward.setNextURL("./error/error.jsp");
      forward.setForward(true);
    }
    
    return forward;
  }

}
