package com.fourker_s.gtg.board.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fourker_s.gtg.board.service.BoardService;
import com.fourker_s.gtg.board.vo.BoardVO;
import com.fourker_s.gtg.cmm.session.SessionManageUtil;
import com.fourker_s.gtg.login.service.LoginService;
import com.fourker_s.gtg.login.vo.LoginVO;


@Controller
public class BoardController {
	Logger LOGGER = LoggerFactory.getLogger(BoardController.class);// .class �Ҷ� �̸� ��ġ�ؾ���


	
	@Resource(name="boardService")//�ֵ���ǥ�� �տ� �ҹ��ڷ� �ٲ����
	BoardService boardService;//�� �̸����� ����
	
	

	//@RequestParam(value="ddd",dsfdf); request.getParameter�� ���� ���
	
	
	
	@RequestMapping(value="/board/boardHome.do")//���ּҰ� ���� �ؿ� �޼��� ����� �� ��
	public String boardHome(Model model, LoginVO vo, HttpServletRequest request,/*@RequestParam(value="ddd",dsfdf);*/ HttpServletResponse response) throws Exception {
        LOGGER.debug("ȣ���");
        HttpSession session=request.getSession();
        List<BoardVO> bvo = null;
        vo=(LoginVO)session.getAttribute("loginvo");
		bvo=boardService.allboard(vo);
	//	int a=bvo.size();
	
		Integer a=boardService.countboard();
	model.addAttribute("count", a);
	System.out.println("a="+a);
		model.addAttribute("all",bvo);
        
		return "/board/boardHome";
    }
	
	
	@RequestMapping(value="/board/bpage.do")//���ּҰ� ���� �ؿ� �޼��� ����� �� ��
	public String bpage(Model model, LoginVO vo, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LOGGER.debug("ȣ���");
        HttpSession session=request.getSession();
 Integer cnt=Integer.parseInt(request.getParameter("cnt"));
 double ppcnt=Double.parseDouble(request.getParameter("pcnt"));
 int a=(int)ppcnt;
 Integer pcnt=a;
 System.out.println(pcnt);
 model.addAttribute("count",cnt);//�������� ���޵�
 model.addAttribute("pcount",pcnt);//�������� ���޵�
 
        
        List<BoardVO> bvo = null;
        vo=(LoginVO)session.getAttribute("loginvo");
		bvo=boardService.allboard(vo);
        
		model.addAttribute("all",bvo);
        
        
		return "/board/bpage";
    }
	
	
	
	
	@RequestMapping(value="/board/bdetail.do")//���ּҰ� ���� �ؿ� �޼��� ����� �� ��
	public String bdetail(Model model, LoginVO vo, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LOGGER.debug("ȣ���");
    String a=request.getParameter("bid");
    String b=request.getParameter("bname");
    System.out.println("request "+a);
BoardVO bvo=new BoardVO();
bvo.setBid(a);
bvo.setBname(b);
    System.out.println("printf"+bvo.getBid());
    System.out.println("2");
    bvo=boardService.bcontent(bvo);
    System.out.println(bvo.getBcontent());
    model.addAttribute("bvo",bvo);
    
        
		return "/board/bdetail";
    }
	
	@RequestMapping(value="/board/bcontent.do")//���ּҰ� ���� �ؿ� �޼��� ����� �� ��
	public String bcontent(Model model, LoginVO vo, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LOGGER.debug("ȣ���");

		return "/board/bcontent";
    }
	@RequestMapping(value="/board/boardinsert.do")//���ּҰ� ���� �ؿ� �޼��� ����� �� �� ��� return���� ���ƾ���
	public String boardinsert(Model model, LoginVO vo,BoardVO bvo, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LOGGER.debug("ȣ���");
        HttpSession session=request.getSession();
        vo=(LoginVO)session.getAttribute("loginvo");

        bvo.setBid(vo.getUserId());
        bvo.setBuid(vo.getUserId());

        System.out.println(bvo.getBcontent()+bvo.getBid()+bvo.getBname()+bvo.getBpw()+bvo.getBuid()+"22222222222222222");
        
        
        System.out.println(bvo.getBcontent());
        boardService.boardinsert(bvo);
        
        
// return "/board/boardinsert"
		return "/board/bcontent";
    }	@RequestMapping(value="/board/bdel.do")//���ּҰ� ���� �ؿ� �޼��� ����� �� �� ��� return���� ���ƾ���
	public String bdel(Model model, LoginVO vo, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LOGGER.debug("ȣ���");
        BoardVO bvo=new BoardVO();    
        String a=request.getParameter("bid");
        String b=request.getParameter("bname");
        bvo.setBid(a);
        bvo.setBname(b);
  boardService.deleteboard(bvo);
        
        
// return "/board/boardinsert"
		return "/board/bdel";
    }
	
	
	
	

	
	
	//-------------------------------------------
    
}