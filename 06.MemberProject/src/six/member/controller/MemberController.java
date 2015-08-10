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
	    // 회원 가입 폼 페이지
	    action = new RegisterFormAction();
	    forward = action.execute(request, response);
	  } else if(command.equals("/register.six")) {
	    // 회원 가입 처리
	    action = new RegisterAction();
	    forward = action.execute(request, response);
	  } else if(command.equals("/list.six")) {
	    // 회원 리스트 처리
	    action = new ListAction();
	    forward = action.execute(request, response);
	  } else if(command.equals("/detail.six")) {
	    // 회원정보 상세보기
	    action = new DetailAction();
	    forward = action.execute(request, response);
	  } else if(command.equals("/delete.six")) {
	    // 회원 정보 삭제
	    action = new DeleteAction();
      forward = action.execute(request, response);
	  } else if(command.equals("/loginForm.six")) {
      // 로그인 폼 페이지
      action = new LoginFormAction();
      forward = action.execute(request, response);
    } else if(command.equals("/login.six")) {
      // 로그인 처리
      action = new LoginAction();
      forward = action.execute(request, response);
    } else if(command.equals("/logout.six")) {
      // 로그아웃 처리
      action = new LogoutAction();
      forward = action.execute(request, response);
    } else if(command.equals("/checkId.six")) {
      // 아이디 중복 체크 처리 페이지
      System.out.println("중복");
      action = new CheckIdAction();
      forward = action.execute(request, response);
    }
	  
	  System.out.println("isForward : " + forward.isForward());
	  System.out.println("getNextURL : " + forward.getNextURL());
	  
	  // 다음페이지 이동
	  if(forward.isForward()){
	    // forward 방식
	    request.getRequestDispatcher(forward.getNextURL()).forward(request, response);
	  } else{
	    // redirect 방식
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
