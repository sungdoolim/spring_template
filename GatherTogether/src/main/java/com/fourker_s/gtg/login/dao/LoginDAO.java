package com.fourker_s.gtg.login.dao;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fourker_s.gtg.login.vo.LoginVO;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("loginDAO")
public interface LoginDAO {
	
	public LoginVO joinUser(LoginVO vo);//joinUser¿Ã∏ß¿« ƒı∏ÆπÆ¿ª æµ≤®æﬂ
	
	public LoginVO checkUser(LoginVO vo);

	public LoginVO loginUser(LoginVO vo);
	public void updateUser(LoginVO vo);
	public List<LoginVO> allUser(LoginVO vo);
	public void deleteUser(LoginVO vo);
	public int countUser();
}