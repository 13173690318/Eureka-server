package com.ouysb.test.spi.impl;

import com.ouysb.test.spi.TestSPIService;

public class TestSPIServiceImpl implements TestSPIService{

	@Override
	public void exe() {
		
		System.out.println("你好，这里是spi测试");
		StringBuffer sb = new StringBuffer();
		sb.append("第一步：在classpath目录下创建目录:/META-INFO/services/\r\n");
		sb.append("第二步：在classpath目录中创建需要执行的接口和实现类\r\n");
		sb.append("第三步：在创建的services目录下创建文件:接口的全限定名，文件内容为实现类的全限定名\r\n");
		System.out.println(sb);
	}

}
