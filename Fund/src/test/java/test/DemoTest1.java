package test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class DemoTest1 {

	@Test//测试mapper返回的空集合能否返回第一个空数据而不抛异常
	public void test1(){
		List<String> list = new ArrayList<>();
		System.out.println(list.size());
		System.out.println(list.get(0).toString());
	}
	
	@Test//测试获得真实文件名
	public void test2(){
		String fileName = "20150904dsgbuibs89a83ne日你麻麻.doc";
		
		String oldFileName = fileName.substring(fileName.indexOf("_") + 1);
		System.out.println(oldFileName);
	}
	
	@Test
	public void test3() throws IOException{
		FileInputStream fis = new FileInputStream("");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
	}
	
}
