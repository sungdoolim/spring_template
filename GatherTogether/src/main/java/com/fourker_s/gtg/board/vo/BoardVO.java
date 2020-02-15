package com.fourker_s.gtg.board.vo;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class BoardVO {
	private static final Logger LOGGER = LoggerFactory.getLogger(BoardVO.class);
	 
	private String bid;
	private String bname;
	private String bpw;
	private String buid;
	private int cnt;
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	private String bcontent;
	
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBpw() {
		return bpw;
	}
	public void setBpw(String bpw) {
		this.bpw = bpw;
	}
	public String getBuid() {
		return buid;
	}
	public void setBuid(String buid) {
		this.buid = buid;
	}
	public static Logger getLogger() {
		return LOGGER;
	}
	@Override
	public String toString() {
		return "BoardVO [bid=" + bid + ", bname=" + bname + ", bpw=" + bpw + ", buid=" + buid + "]";
	}
	
	
	
}
