package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fizbiz.FizBiz;

public class FizBizTest {
	
	private
	FizBiz fb;
	
	@Before
	public void setup(){
		fb = new FizBiz();
	}
	
	@Test
	public void testNumber() {
		int number  = 1;
		
		String numberReturned = fb.play(number);
		Assert.assertEquals("1", numberReturned);
	}
	
	@Test
	public void test2() {
		int number  = 3;
		
		String numberReturned = fb.play(number);
		Assert.assertEquals("Fiz", numberReturned);
	}
	

	@Test
	public void test3() {
		int number  = 5;
		
		String numberReturned = fb.play(number);
		Assert.assertEquals("Biz", numberReturned);
	}
	
	@Test
	public void test4() {
		int number  = 15;
		
		String numberReturned = fb.play(number);
		Assert.assertEquals("FizBiz", numberReturned);
	}
}
