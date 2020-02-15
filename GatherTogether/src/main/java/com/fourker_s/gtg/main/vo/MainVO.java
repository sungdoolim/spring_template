package com.fourker_s.gtg.main.vo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainVO {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MainVO.class);
	 
	 String param;
	 String data;
	public String getParam() {
		return param;
	}
	public void setParam(String param) {
		this.param = param;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "MainVO [param=" + param + ", data=" + data + "]";
	}
}
