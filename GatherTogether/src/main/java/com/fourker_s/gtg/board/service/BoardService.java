package com.fourker_s.gtg.board.service;

import java.util.List;

import com.fourker_s.gtg.board.vo.BoardVO;
import com.fourker_s.gtg.login.vo.LoginVO;

public interface BoardService {

	public int countboard();
	public List<BoardVO> allboard(LoginVO vo);//joinUser이름의 쿼리문을 쓸꺼야
	public BoardVO seachboard(BoardVO vo);
	public void deleteboard(BoardVO vo);
	public BoardVO updateboardname(BoardVO vo);
	public BoardVO updateboardcontent(BoardVO vo);
	public void boardinsert(BoardVO bvo);
	public BoardVO bcontent(BoardVO vo);
}
