package com.fourker_s.gtg.cmm.logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.fourker_s.gtg.cmm.session.SessionManageUtil;
import com.fourker_s.gtg.login.vo.LoginVO;
//���ͼ��� ��ó����, ��ó���� ����
public class LoggerInterceptor extends HandlerInterceptorAdapter {
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggerInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		if(LOGGER.isDebugEnabled()) {
			LOGGER.debug("====================[     S T A R T     ]====================");
			LOGGER.debug("Request URI \t:  "+request.getRequestURI());
			if(SessionManageUtil.isValidSession(request)){
				LoginVO loginvo = SessionManageUtil.getLoginInfo(request);
  		        LOGGER.debug("�������� : "+loginvo);
  		    }
			else {
				LOGGER.debug("���� ����");
		}
			}
		return super.preHandle(request, response, handler);
	}
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView model) throws Exception {
		if(LOGGER.isDebugEnabled()) {
			LOGGER.debug("====================[       E N D       ]====================\n");
			LoginVO loginvo = SessionManageUtil.getLoginInfo(request);
			model.addObject("loginvo", loginvo);
		}
	}	
}