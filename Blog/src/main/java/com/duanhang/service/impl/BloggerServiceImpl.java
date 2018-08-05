package com.duanhang.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.duanhang.dao.BloggerDao;
import com.duanhang.entity.Blogger;
import com.duanhang.service.BloggerService;

/**
 * ����Serviceʵ����
 * @author Administrator
 *
 */
@Service("bloggerService")
public class BloggerServiceImpl implements BloggerService{

	@Resource
	private BloggerDao bloggerDao;
	
	public Blogger getByUserName(String userName) {
		return bloggerDao.getByUserName(userName);
	}

	public Blogger find() {
		return bloggerDao.find();
	}

}
