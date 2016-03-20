package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class ByteTest {
	@Test
	public void demo1(){
		Byte b = 66;
		System.out.println(b);//66
		Byte a = (byte)666;
		System.out.println(a);//-102
	}
	
	@Test
	public void demo2(){
		Integer a = 366666;
		byte ab = a.byteValue();
		Byte b = ab;
		System.out.println(ab);//74
		System.out.println(b);//74
	}
	
	@Test
	public void demo3(){
		byte b = 44;
		System.out.println(b);//44
		System.out.println();
	}
	
	@Test
	public void demo4(){
		Date date = new Date();
		 SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		 System.out.println(formatter.format(date));
		 System.out.println();
	}
	
	@Test
	public void demo5(){
		Calendar calendar = Calendar.getInstance();
		 System.out.println(calendar.get(Calendar.YEAR));
		 System.out.println(calendar.get(Calendar.MONTH));	 
	}
	
}
