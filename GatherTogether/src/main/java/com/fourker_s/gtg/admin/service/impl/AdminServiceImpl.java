package com.fourker_s.gtg.admin.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fourker_s.gtg.admin.dao.AdminDAO;
import com.fourker_s.gtg.admin.service.AdminService;
import com.fourker_s.gtg.board.vo.BoardVO;
import com.fourker_s.gtg.login.dao.LoginDAO;
import com.fourker_s.gtg.login.service.LoginService;
import com.fourker_s.gtg.login.vo.LoginVO;



@Service("adminService")//꼭 해야함
public class AdminServiceImpl implements AdminService {

	 private static final Logger LOGGER = LoggerFactory.getLogger(AdminServiceImpl.class);
	 
	 @Resource(name="adminDAO")//controller 에서는 service를 , service는 dao를 사용하고 있음
	 private AdminDAO adminDAO;

	@Override
	public List<BoardVO> searchBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return adminDAO.searchBoard(vo);
	}
	 

}
