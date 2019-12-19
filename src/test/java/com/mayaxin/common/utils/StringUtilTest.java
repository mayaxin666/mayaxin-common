/**   
 * Copyright © 2019 北京八维. All rights reserved.
 * 
 * @Title: StringUtilTest.java 
 * @Prject: mayaxin-common
 * @Package: com.mayaxin.common.utils 
 * @Description: TODO
 * @author: 马亚鑫  
 * @date: 2019年10月12日 上午10:00:32 
 */
package com.mayaxin.common.utils;

import org.junit.Test;

import com.mayaxin.common.utils.StringUtil;

/** 
 * @ClassName: StringUtilTest 
 * @Description: TODO
 * @author:马亚鑫
 * @date: 2019年10月12日 上午10:00:32  
 */
public class StringUtilTest {

	/**
	 * Test method for {@link com.mayaxin.common.utils.StringUtil#hasLength(java.lang.String)}.
	 */
	@Test
	public void testHasLength() {
		String str="";
		boolean b = StringUtil.hasLength(str);
		System.out.println(b);
	}

	/**
	 * Test method for {@link com.mayaxin.common.utils.StringUtil#hasText(java.lang.String)}.
	 */
	@Test
	public void testHasText() {
		String str=" ";
		boolean b = StringUtil.hasText(str);
		System.out.println(b);
	}

	/**
	 * Test method for {@link com.mayaxin.common.utils.StringUtil#randomChineseString(int)}.
	 */
	@Test
	public void testRandomChineseString() {
		String randomChineseString = StringUtil.randomChineseString(10);
		System.out.println(randomChineseString);
	}

	/**
	 * Test method for {@link com.mayaxin.common.utils.StringUtil#generateChineseName()}.
	 */
	@Test
	public void testGenerateChineseName() {
		String generateChineseName = StringUtil.generateChineseName();
		System.out.println(generateChineseName);
	}
	
	@Test
	public void testIsNumber() {
		String str = "0.999";
		boolean b = StringUtil.isNumber(str);
		System.out.println(b);
	}
	
	@Test
	public void testPercent() {
		String percent = StringUtil.percent(2, 5);
		System.out.println(percent);
	}
	

	@Test
	public void testToUniqueName() {
		String str = "Spring mvc";
		String percent = StringUtil.toUniqueName(str);
		System.out.println(percent);
	}
	
	@Test
	public void testisHttpUrl() {
		String url ="https://www.baidu.com";
		boolean httpUrl = StringUtil.isHttpUrl(url);
		System.out.println(httpUrl);
	}
}
