package com.fourker_s.gtg.admin.dao;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fourker_s.gtg.board.vo.BoardVO;
import com.fourker_s.gtg.login.vo.LoginVO;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("adminDAO")
public interface AdminDAO {
	List<BoardVO> searchBoard(BoardVO bvo);

}