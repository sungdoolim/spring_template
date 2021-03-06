package com.fourker_s.gtg.cmm.logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.fourker_s.gtg.cmm.session.SessionManageUtil;
import com.fourker_s.gtg.login.vo.LoginVO;
//인터셉터 전처리기, 후처리기 생성
public class LoggerInterceptor extends HandlerInterceptorAdapter {
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggerInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		if(LOGGER.isDebugEnabled()) {
			LOGGER.debug("====================[     S T A R T     ]====================");
			LOGGER.debug("Request URI \t:  "+request.getRequestURI());
			if(SessionManageUtil.isValidSession(request)){
				LoginVO loginvo = SessionManageUtil.getLoginInfo(request);
  		        LOGGER.debug("세션정보 : "+loginvo);
  		    }
			else {
				LOGGER.debug("세션 없음");
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