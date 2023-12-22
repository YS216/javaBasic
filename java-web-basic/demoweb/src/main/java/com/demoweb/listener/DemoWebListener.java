package com.demoweb.listener;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.demoweb.dto.MemberDto;

@WebListener
public class DemoWebListener implements HttpSessionListener, ServletContextListener {

    public void sessionCreated(HttpSessionEvent se)  {}

    public void sessionDestroyed(HttpSessionEvent se)  {}

    // 웹프로그렘 시작할 때 한 번 호출
    public void contextInitialized(ServletContextEvent sce)  { 
        // 회원가입정보 저장할 ArrayList 객체 만들고 application 객체에 저장
    	ServletContext application = sce.getServletContext();
    	ArrayList<MemberDto> members = new ArrayList<MemberDto>();
    	application.setAttribute("members", members);
   }
    
    // 웹프로그렘 종료할 떄 한 번 호출
    public void contextDestroyed(ServletContextEvent sce)  { 

    }


	
}
