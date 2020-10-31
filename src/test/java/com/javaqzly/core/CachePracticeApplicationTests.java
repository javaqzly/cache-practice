package com.javaqzly.core;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.javaqzly.service.HelloCacheService;

@SpringBootTest(classes = {CachePracticeApplication.class})
class CachePracticeApplicationTests {
	
	@Autowired
	private HelloCacheService helloCacheService;

    @Test
    void contextLoads() {
    }
    
    @Test
    public void testShowCacheable() {
        String ret = this.helloCacheService.showCacheable();
        System.out.println(ret);
    }
    
    @Test
    public void testShowCacheEvict() {
    	this.helloCacheService.showCacheEvict();
    }
    
    @Test
    public void testShowCachePut() {
    	this.helloCacheService.showCacheInput();
    }
    
    @Test
    public void testShowSpringEL() {
    	this.helloCacheService.showSpringEL("javaQzly");
    	this.helloCacheService.showSpringEL("helloWorld");
    }
    
    
}
