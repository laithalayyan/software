package car_accessories;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import car_accessories.utill.*;



public class testhello {
	
	helloworld obj;
	
	@Test
	public void testAdd_twoPositiveInteger() {
		obj=new helloworld();
		int expected=9;
		int actual=obj.add(5,4);
		//test
		assertTrue(expected==actual);
	}

}
