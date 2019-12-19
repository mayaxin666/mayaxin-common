/**   
 * Copyright © 2019 北京八维. All rights reserved.
 * 
 * @Title: RandomUtilTest.java 
 * @Prject: mayaxin-common
 * @Package: com.mayaxin.common.utils 
 * @Description: TODO
 * @author: 马亚鑫  
 * @date: 2019年10月11日 下午8:16:23 
 */
package com.mayaxin.common.utils;


import org.junit.Test;

import com.mayaxin.common.utils.RandomUtil;

/** 
 * @ClassName: RandomUtilTest 
 * @Description: TODO
 * @author:马亚鑫
 * @date: 2019年10月11日 下午8:16:23  
 */
public class RandomUtilTest {

	/**
	 * Test method for {@link com.mayaxin.common.utils.RandomUtil#random(int, int)}.
	 */
	@Test
	public void testRandom() {
		for (int i = 0; i < 10; i++) {
			int j = RandomUtil.random(0, 1);
			System.out.println(j);
		}
	}

	/**
	 * Test method for {@link com.mayaxin.common.utils.RandomUtil#subRandom(int, int, int)}.
	 */
	@Test
	public void testSubRandom() {
		int[] random = RandomUtil.subRandom(2, 5, 2);
		for (int i : random) {
			System.out.println(i);
		}
	}
	
	@Test
	public void testRandomCharacter() {
		char c = RandomUtil.randomCharacter();
		System.out.println(c);
	}
	

	@Test
	public void testRandomString() {
		String str = RandomUtil.randomString(4);
		System.out.println(str);
	}
	
	
}
