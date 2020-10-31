package com.javaqzly.service.impl;

import java.util.Date;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import com.javaqzly.service.HelloCacheService;

@Service
@CacheConfig(cacheNames = "helloCache")
public class HelloCacheServiceImpl implements HelloCacheService {

	/**
	 * 用来展示@Cacheable注解的用法
	 */
	@Override
	@Cacheable(key = "'showCacheable'")
	public String showCacheable() {
		System.out.println("showCacheable方法被调用了");
		return "showCacheable 这个方法主要用来演示@Cacheable注解的使用！";
	}

	/**
	 * 用来展示@CacheEvict注解的用法
	 */
	@Override
	@CacheEvict(key = "'showCacheable'")
	public void showCacheEvict() {
		System.out.println("showCacheEvict方法被调用了");
	}

	@Override
	@CachePut( key = "'showCacheable'")
	public String showCacheInput() {
		System.out.println("showCacheInput方法被调用了！");
		return "showCacheInput 这个方法主要用来演示@Cacheable注解的使用！" + new Date();
	}

	@Override
	@Cacheable( key = "#username")
	public String showSpringEL(String username) {
		System.out.println("showSpringEL方法被调用了！");
		return "showSpringEL 这个方法主要用来演示@Cacheable注解的使用！" + username;
	}

}
