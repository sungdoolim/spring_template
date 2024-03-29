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
	Logger LOGGER = LoggerFactory.getLogger(LoginController.class);// .class 拝凶 戚硯 析帖背醤敗
	
	
	
	@Resource(name="loginService")//瞬魚身妊澗 蒋拭 社庚切稽 郊蚊醤敗
	LoginService loginService;//煽 戚硯生稽 承臆
	
	
	@RequestMapping(value="/login/loginHome.do")//戚爽社亜 神檎 購拭 五辞球 紫遂拝 依 績
	public String loginHome(Model model, LoginVO vo, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LOGGER.debug("硲窒喫");
        
		return "/login/loginHome";
    }
	
	@RequestMapping(value="/login/joinHome.do")
	public String joinHome(Model model, LoginVO vo, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LOGGER.debug("硲窒喫");
        
		return "/login/joinHome";
    }
	
	
	
	
	
	
	@RequestMapping(value="/login/loginCheck.do")
	public String loginCheck(Model model, LoginVO vo, HttpServletRequest request, HttpServletResponse response) throws Exception {
    //vo拭澗 鎧亜 脊径廃 舛左亜 赤製
		//稽益昔拭辞澗 start/end亜 蒸製 = 森須坦軒 梅製
		
		LOGGER.debug("硲窒喫");
        LoginVO login = new LoginVO();
        int temp = 0;
        int isadmin=0;
        
        System.out.println("cur temp="+temp);
        login = loginService.loginUser(vo);//select 背紳 庁姥研 login拭 隔精 依績 
        if(login != null) {// 失因梅生檎...session持失馬澗 依績
        	SessionManageUtil.setLoginInfo(request, login);   // 昔斗質闘拭 竺舛 背爽澗 依
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
		LOGGER.debug("硲窒喫");
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
		LOGGER.debug("硲窒喫");
		HttpSession session=request.getSession(false);
		// vo拭 煽舌鞠嬢赤製 ししししししし
		LoginVO vo2=(LoginVO) session.getAttribute("loginvo");

vo.setUserId(vo2.getUserId());

	loginService.update(vo);

		return "/login/update";
    }
	
}