package com.fourker_s.gtg.board.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fourker_s.gtg.board.dao.BoardDAO;
import com.fourker_s.gtg.board.service.BoardService;
import com.fourker_s.gtg.board.vo.BoardVO;
import com.fourker_s.gtg.login.dao.LoginDAO;
import com.fourker_s.gtg.login.service.LoginService;
import com.fourker_s.gtg.login.vo.LoginVO;



@Service("boardService")//꼭 해야함
public class BoardServiceImpl implements BoardService {

	 private static final Logger LOGGER = LoggerFactory.getLogger(BoardServiceImpl.class);
	 
	 @Resource(name="boardDAO")//controller 에서는 service를 , service는 dao를 사용하고 있음
	 private BoardDAO boardDAO;

	@Override
	public List<BoardVO> allboard(LoginVO vo) {
		// TODO Auto-generated method stub
		List<BoardVO> bvo =null;
	     try{
	    	 bvo = boardDAO.allboard(vo);    
	     }catch(Exception ex){
	    	 LOGGER.error("",ex);
	     }
	     return bvo;
	}

	@Override
	public BoardVO seachboard(BoardVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public  void deleteboard(BoardVO vo) {
		// TODO Auto-generated method stub
	boardDAO.deleteboard(vo);
	}

	@Override
	public BoardVO updateboardname(BoardVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardVO updateboardcontent(BoardVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	
	@Override
	public void boardinsert(BoardVO bvo) {
		// TODO Auto-generated method s

		
	     try{
	    	  boardDAO.insertcontent(bvo);    
	     }catch(Exception ex){
	    	 LOGGER.error("",ex);
	     }
	  
		
		
		
		
		
		
		
	}

	@Override
	public BoardVO bcontent(BoardVO vo) {
		// TODO Auto-generated method stub
		
		BoardVO bvo=null;
	     try{
	    	bvo=boardDAO.bcontent(vo);
	     }catch(Exception ex){
	    	 LOGGER.error("bvo  !   ",ex);
	     }
	  
		
		
		return bvo;
		
		
		
	}

	@Override
	public int countboard() {
		// TODO Auto-generated method stub
	return boardDAO.countboard();
	}
	 
	
		
		
		
	
}
