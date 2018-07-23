package com.dy.demo.service.impl;

import com.dy.test.demo._MyServicePrxI;

public class MyServiceImpl extends _MyServicePrxI{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String hello() {
		return "第一个ice项目"; 
	}
	
}
