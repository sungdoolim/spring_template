package com.fourker_s.gtg.admin.service;

import java.util.List;

import com.fourker_s.gtg.board.vo.BoardVO;
import com.fourker_s.gtg.login.vo.LoginVO;

public interface AdminService {

	List<BoardVO> searchBoard(BoardVO vo);


}
