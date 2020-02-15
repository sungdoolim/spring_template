package com.fourker_s.gtg.login.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fourker_s.gtg.cmm.session.SessionManageUtil;
import com.fourker_s.gtg.login.service.LoginService;
import com.fourker_s.gtg.login.vo.LoginVO;


@Controller
public class LoginController {
	Logger LOGGER = LoggerFactory.getLogger(LoginController.class);// .class 할때 이름 일치해야함
	
	
	
	@Resource(name="loginService")//쌍따옴표는 앞에 소문자로 바꿔야함
	LoginService loginService;//저 이름으로 쓸께
	
	
	@RequestMapping(value="/login/loginHome.do")//이주소가 오면 밑에 메서드 사용할 것 임
	public String loginHome(Model model, LoginVO vo, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LOGGER.debug("호출됨");
        
		return "/login/loginHome";
    }
	
	@RequestMapping(value="/login/joinHome.do")
	public String joinHome(Model model, LoginVO vo, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LOGGER.debug("호출됨");
        
		return "/login/joinHome";
    }
	
	
	
	
	
	
	@RequestMapping(value="/login/loginCheck.do")
	public String loginCheck(Model model, LoginVO vo, HttpServletRequest request, HttpServletResponse response) throws Exception {
    //vo에는 내가 입력한 정보가 있음
		//로그인에서는 start/end가 없음 = 예외처리 했음
		
		LOGGER.debug("호출됨");
        LoginVO login = new LoginVO();
        int temp = 0;
        int isadmin=0;
        
        System.out.println("cur temp="+temp);
        login = loginService.loginUser(vo);//select 해온 친구를 login에 넣은 것임 
        if(login != null) {// 성공했으면...session생성하는 것임
        	SessionManageUtil.setLoginInfo(request, login);   // 인터셉트에 설정 해주는 것
        	temp = 1;
        	isadmin=login.getIsAdmin();
        }
        System.out.println("last temp="+temp);
        System.out.println("last isadmin="+isadmin);
        model.addAttribute("login", login);
        model.addAttribute("temp", temp);
        model.addAttribute("isadmin", isadmin);
      /*  if(login.getIsAdmin()==1) {
        	return "/admin/loginCheck";
        }*/
        
		return "/login/loginCheck";
    }
	
	
	@RequestMapping(value="/login/loginvalid.do")
	public String loginvalid(Model model, LoginVO vo, HttpServletRequest request, HttpServletResponse response) throws Exception {
		SessionManageUtil.invalidiate(request);
		
		return "/login/loginvalid";
    }
	
	
	
	
	
	
	@RequestMapping(value="/login/del.do")
	public String del(Model model, LoginVO vo, HttpServletRequest request, HttpServletResponse response) throws Exception {

		 HttpSession session = request.getSession(false);
		vo=(LoginVO)session.getAttribute("loginvo");
		
		loginService.deleteUser(vo);
		
		SessionManageUtil.invalidiate(request);
		return "/login/del";
    }
	
	

	
	@RequestMapping(value="/login/mypage.do")
	public String mypage(Model model, LoginVO vo, HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		return "/login/mypage";
    }
		
	@RequestMapping(value="/login/joinCheck.do")
	public String joinCheck(Model model, LoginVO vo, HttpServletRequest request, HttpServletResponse response) throws Exception {
		LOGGER.debug("호출됨");
		LoginVO join = new LoginVO();
		int temp = 0;
        join = loginService.joinUser(vo);
        if(join != null) {
        	temp = 1;
        }
        model.addAttribute("join",join);
        model.addAttribute("temp",temp);
		return "/login/joinCheck";
    }
	
	


	@RequestMapping(value="/login/update.do")
	public String update(Model model, LoginVO vo, HttpServletRequest request, HttpServletResponse response) throws Exception {
		LOGGER.debug("호출됨");
		HttpSession session=request.getSession(false);
		// vo에 저장되어있음 ㅇㅇㅇㅇㅇㅇㅇ
		LoginVO vo2=(LoginVO) session.getAttribute("loginvo");

vo.setUserId(vo2.getUserId());

	loginService.update(vo);

		return "/login/update";
    }
	
}