package com.fourker_s.gtg.login.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fourker_s.gtg.login.dao.LoginDAO;
import com.fourker_s.gtg.login.service.LoginService;
import com.fourker_s.gtg.login.vo.LoginVO;



@Service("loginService")//꼭 해야함
public class LoginServiceImpl implements LoginService {

	 private static final Logger LOGGER = LoggerFactory.getLogger(LoginServiceImpl.class);
	 
	 @Resource(name="loginDAO")//controller 에서는 service를 , service는 dao를 사용하고 있음
	 private LoginDAO loginDAO;
	 
	 public LoginVO joinUser(LoginVO vo) {//회원가입,여기서 vo가 누구지??? 어쨋든 얘는 데이터를 가지고 있는 애
		 LoginVO loginvo = new LoginVO();
		 try{
			 if(loginDAO.checkUser(vo) != null) { // 이미 있다는 소리 (null 반환)     , 디비안에 같은 이름의 유저가 있는지를 확인 하는 것    낫널 = 이미 있다는 뜻
				 loginvo = null;
			 }
			 else { //새로 유저 확인 가능
				 loginvo = loginDAO.joinUser(vo); // 회원등록 성공  ,     joinUser라는 쿼리를 실행한 결과를 담을 것임 - insert문인데 리턴값은 null 때문에 밑에서 그냥 다시 넣어주는 것..?
				 loginvo = vo; //null로의 반환을 막기 위함
			 }
			 LOGGER.info("쿼리 실행 결과 : " + loginvo);
		 }catch(Exception ex){
			 LOGGER.error("",ex);
		 }
		 return loginvo;
	 }
	 
	 public LoginVO loginUser(LoginVO vo) { //아이디 찾아서 비번 확인 (틀리면 null반환)
		 LoginVO loginvo = new LoginVO();
		 try{      
			 loginvo = loginDAO.loginUser(vo);//select 문
			 if(vo.getPassword().equals(loginvo.getPassword())) {
				 // 비번 일치하면 loginvo사용
			 }
			 else {
				 loginvo = null;// 일치안하면 null로 바꾸자
			 }
			 LOGGER.info("쿼리 실행 결과 : " + loginvo);
		 }catch(Exception ex){
			 LOGGER.error("",ex);
		 }
		 return loginvo;
	 }

	@Override
	public List<LoginVO> allUser(LoginVO vo) {
		// TODO Auto-generated method stub
		List<LoginVO> allvo =null;
	     try{
	    	 allvo = loginDAO.allUser(vo);    
	     }catch(Exception ex){
	    	 LOGGER.error("",ex);
	     }
	     return allvo;
		
		
		
	}

	@Override
	public void deleteUser(LoginVO vo) {
		// TODO Auto-generated method stub9
		
	     try{
	    	 loginDAO.deleteUser(vo);    
	     }catch(Exception ex){
	    	 LOGGER.error("",ex);
	     }
	

	}

	@Override
	public LoginVO update(LoginVO vo) {
		
		 try{
	    	 loginDAO.updateUser(vo);    
	     }catch(Exception ex){
	    	 LOGGER.error("",ex);
	     }
		
		return vo;
		// TODO Auto-generated method stub
		
		
		
		
		
	}

	@Override
	public int countuser() {
		// TODO Auto-generated method stub
		
		
		return loginDAO.countUser();
	}
}
