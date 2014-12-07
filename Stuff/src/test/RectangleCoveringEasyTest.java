package test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import main.RectangleCoveringEasy;

import org.junit.Test;

public class RectangleCoveringEasyTest {

	@Test
	public void test1111() {
		RectangleCoveringEasy r = new RectangleCoveringEasy();
		assertEquals(-1, r.solve(1,1,1,1));
	}

	@Test
	public void test3546() {
		RectangleCoveringEasy r = new RectangleCoveringEasy();
		assertEquals(1, r.solve(3,5,4,6));
	}

	@Test
	public void test10202515() {
		RectangleCoveringEasy r = new RectangleCoveringEasy();
		assertEquals(1, r.solve(10,20,25,15));
	}
	
	@Test
	public void test310312() {
		RectangleCoveringEasy r = new RectangleCoveringEasy();
		assertEquals(1, r.solve(3,10,3,12));
	}
	
}
