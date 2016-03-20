package test;

import org.junit.Test;

import com.fund.exception.ProjectException;
import com.fund.exception.base.BaseException;

public class InstanceTest {

	@Test
	public void test1(){
		ProjectException ex = new ProjectException("xxx");
		System.out.println(ex instanceof BaseException);
		
		
	}
	
}
