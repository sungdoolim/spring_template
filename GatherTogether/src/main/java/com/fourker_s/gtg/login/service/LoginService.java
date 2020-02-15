package com.fourker_s.gtg.login.service;

import java.util.List;

import com.fourker_s.gtg.login.vo.LoginVO;

public interface LoginService {

	public LoginVO joinUser(LoginVO vo);
	
	public LoginVO loginUser(LoginVO vo);
	public List<LoginVO> allUser(LoginVO vo);
	public void deleteUser(LoginVO vo);
	public LoginVO update(LoginVO vo);
	public int countuser();
}
