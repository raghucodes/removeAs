package tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class testremoveAs {

	@Test
	public void testremoveAs() {
		NoAs obj = new NoAs("AABC");
		assertEquals("BC",obj.removeAs());
		obj = new NoAs("AA");
		assertEquals("",obj.removeAs());
		obj = new NoAs("ABC");
		assertEquals("BC",obj.removeAs());
		obj = new NoAs("BAC");
		assertEquals("BC",obj.removeAs());
	}

}
