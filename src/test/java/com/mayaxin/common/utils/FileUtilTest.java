/**   
 * Copyright © 2019 北京八维. All rights reserved.
 * 
 * @Title: FileUtilTest.java 
 * @Prject: mayaxin-common
 * @Package: com.mayaxin.common.utils 
 * @Description: TODO
 * @author: 马亚鑫
 * @date: 2019年10月11日 下午6:39:23 
 */
package com.mayaxin.common.utils;

import java.io.File;

import org.junit.Test;

import com.mayaxin.common.utils.FileUtil;

/** 
 * @ClassName: FileUtilTest 
 * @Description: TODO
 * @author:马亚鑫
 * @date: 2019年10月11日 下午6:39:23  
 */
public class FileUtilTest {

	/**
	 * Test method for {@link com.mayaxin.common.utils.FileUtil#getExtendName(java.lang.String)}.
	 */
	@Test
	public void testGetExtendName() {
		String fileName = FileUtil.getExtendName("D:\\AuI18N\\2052\\StringBundle.xml");
		System.out.println(fileName);
		
	}

	/**
	 * Test method for {@link com.mayaxin.common.utils.FileUtil#getTempDirectory()}.
	 */
	@Test
	public void testGetTempDirectory() {
		File file = FileUtil.getTempDirectory();
		System.out.println(file);
	}

	/**
	 * Test method for {@link com.mayaxin.common.utils.FileUtil#getUserDirectory()}.
	 */
	@Test
	public void testGetUserDirectory() {
		File file = FileUtil.getUserDirectory();
		System.out.println(file);
	}
}
