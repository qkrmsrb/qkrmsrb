package six.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import six.member.action.Action;
import six.member.action.ActionForward;
import six.member.action.CheckIdAction;
import six.member.action.DeleteAction;
import six.member.action.DetailAction;
import six.member.action.ListAction;
import six.member.action.LoginAction;
import six.member.action.LoginFormAction;
import six.member.action.LogoutAction;
import six.member.action.RegisterAction;
import six.member.action.RegisterFormAction;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("*.six")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	  request.setCharacterEncoding("UTF-8");
	  response.setContentType("text/html; charset=UTF-8");
	  
	  String uri = request.getRequestURI();
	  String context =request.getContextPath();
	  String command = uri.substring(context.length());
	  Action action = null;
	  ActionForward forward = null;
	  
	  System.out.println("1");
	  System.out.println("uri : " + uri);
	  System.out.println("context : " + context);
	  System.out.println("command : " + command);
	  System.out.println("2");
	  if(command.equals("/registerForm.six")) {
	    // ȸ�� ���� �� ������
	    action = new RegisterFormAction();
	    forward = action.execute(request, response);
	  } else if(command.equals("/register.six")) {
	    // ȸ�� ���� ó��
	    action = new RegisterAction();
	    forward = action.execute(request, response);
	  } else if(command.equals("/list.six")) {
	    // ȸ�� ����Ʈ ó��
	    action = new ListAction();
	    forward = action.execute(request, response);
	  } else if(command.equals("/detail.six")) {
	    // ȸ������ �󼼺���
	    action = new DetailAction();
	    forward = action.execute(request, response);
	  } else if(command.equals("/delete.six")) {
	    // ȸ�� ���� ����
	    action = new DeleteAction();
      forward = action.execute(request, response);
	  } else if(command.equals("/loginForm.six")) {
      // �α��� �� ������
      action = new LoginFormAction();
      forward = action.execute(request, response);
    } else if(command.equals("/login.six")) {
      // �α��� ó��
      action = new LoginAction();
      forward = action.execute(request, response);
    } else if(command.equals("/logout.six")) {
      // �α׾ƿ� ó��
      action = new LogoutAction();
      forward = action.execute(request, response);
    } else if(command.equals("/checkId.six")) {
      // ���̵� �ߺ� üũ ó�� ������
      System.out.println("�ߺ�");
      action = new CheckIdAction();
      forward = action.execute(request, response);
    }
	  
	  System.out.println("isForward : " + forward.isForward());
	  System.out.println("getNextURL : " + forward.getNextURL());
	  
	  // ���������� �̵�
	  if(forward.isForward()){
	    // forward ���
	    request.getRequestDispatcher(forward.getNextURL()).forward(request, response);
	  } else{
	    // redirect ���
	    response.sendRedirect(forward.getNextURL());
	  }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
