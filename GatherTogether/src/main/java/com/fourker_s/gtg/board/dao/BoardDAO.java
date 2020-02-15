package com.fourker_s.gtg.board.dao;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fourker_s.gtg.board.vo.BoardVO;
import com.fourker_s.gtg.login.vo.LoginVO;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("boardDAO")
public interface BoardDAO {
	
	public List<BoardVO> allboard(LoginVO vo);//joinUser¿Ã∏ß¿« ƒı∏ÆπÆ¿ª æµ≤®æﬂ
	public BoardVO seachboard(BoardVO vo);
	public void deleteboard(BoardVO vo);
	public BoardVO updateboardname(BoardVO vo);
	public BoardVO updateboardcontent(BoardVO vo);
	public BoardVO bcontent(BoardVO vo);
	public void insertcontent(BoardVO bvo);
	public int countboard();
	
}