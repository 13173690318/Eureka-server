package com.ouysb.test.test;

import java.util.Iterator;
import java.util.ServiceLoader;

import com.ouysb.test.spi.TestSPIService;

public class Test1 {

	public static void main(String[] args) {
		ServiceLoader<TestSPIService> loader=ServiceLoader.load(TestSPIService.class);
		Iterator<TestSPIService> it=loader.iterator();
		
		while(it.hasNext()) {
			TestSPIService s=it.next();
			s.exe();
		}
	}
}
