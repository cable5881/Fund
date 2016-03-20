package test;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fund.controller.converter.CustomDateConverter;

public class TimerTest {

	@Test
	public void test1(){
//		Timer timer = new Timer(true);
//		timer.scheduleAtFixedRate(new myTimerTask(), firstTime, period);
		
	}
	
	
	@Test
	public void test2(){
		ScheduledExecutorService seService = Executors.newSingleThreadScheduledExecutor();
		seService.scheduleAtFixedRate(new Runnable() {
			@Override
			public void run() {
				System.out.println("22222");
			}
		}, 0, 1000, TimeUnit.MILLISECONDS);
	}
	
	public static void main(String[] args) {
		
//		Date date = new CustomDateConverter().convert("2015-11-9 21:13:45");
		
//		ScheduledExecutorService seService = Executors.newSingleThreadScheduledExecutor();
		//周期性地执行
//		seService.scheduleAtFixedRate(new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("22222");
//			}
//		}, 0, date.getTime() - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
		
		
//		Timer timer = new Timer();
//		timer.scheduleAtFixedRate(new myTimerTask(), date, 1000*60);
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mvc.xml");  
	}
}

class myTimerTask extends TimerTask{
	@Override
	public void run() {
		System.out.println("i am sbbbbbb");
	}
	
} 
