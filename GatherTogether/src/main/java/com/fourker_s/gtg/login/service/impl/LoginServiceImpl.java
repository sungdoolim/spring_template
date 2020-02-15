package com.fourker_s.gtg.login.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fourker_s.gtg.login.dao.LoginDAO;
import com.fourker_s.gtg.login.service.LoginService;
import com.fourker_s.gtg.login.vo.LoginVO;



@Service("loginService")//�� �ؾ���
public class LoginServiceImpl implements LoginService {

	 private static final Logger LOGGER = LoggerFactory.getLogger(LoginServiceImpl.class);
	 
	 @Resource(name="loginDAO")//controller ������ service�� , service�� dao�� ����ϰ� ����
	 private LoginDAO loginDAO;
	 
	 public LoginVO joinUser(LoginVO vo) {//ȸ������,���⼭ vo�� ������??? ��¶�� ��� �����͸� ������ �ִ� ��
		 LoginVO loginvo = new LoginVO();
		 try{
			 if(loginDAO.checkUser(vo) != null) { // �̹� �ִٴ� �Ҹ� (null ��ȯ)     , ���ȿ� ���� �̸��� ������ �ִ����� Ȯ�� �ϴ� ��    ���� = �̹� �ִٴ� ��
				 loginvo = null;
			 }
			 else { //���� ���� Ȯ�� ����
				 loginvo = loginDAO.joinUser(vo); // ȸ����� ����  ,     joinUser��� ������ ������ ����� ���� ���� - insert���ε� ���ϰ��� null ������ �ؿ��� �׳� �ٽ� �־��ִ� ��..?
				 loginvo = vo; //null���� ��ȯ�� ���� ����
			 }
			 LOGGER.info("���� ���� ��� : " + loginvo);
		 }catch(Exception ex){
			 LOGGER.error("",ex);
		 }
		 return loginvo;
	 }
	 
	 public LoginVO loginUser(LoginVO vo) { //���̵� ã�Ƽ� ��� Ȯ�� (Ʋ���� null��ȯ)
		 LoginVO loginvo = new LoginVO();
		 try{      
			 loginvo = loginDAO.loginUser(vo);//select ��
			 if(vo.getPassword().equals(loginvo.getPassword())) {
				 // ��� ��ġ�ϸ� loginvo���
			 }
			 else {
				 loginvo = null;// ��ġ���ϸ� null�� �ٲ���
			 }
			 LOGGER.info("���� ���� ��� : " + loginvo);
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
