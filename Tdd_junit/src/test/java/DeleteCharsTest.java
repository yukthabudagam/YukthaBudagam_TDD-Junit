import static org.junit.Assert.*;


import org.junit.Test;

public class DeleteCharsTest {
	@Test
	public void testRemoveA() {
		DeleteChars test1stchar =new DeleteChars();
		assertEquals("badssa",test1stchar.removeA("Abadssa"));
	}
	@Test
	public void testRemoveA1() {
		DeleteChars test2stchar =new DeleteChars();
		assertEquals("bdBB",test2stchar.removeA("bAdBB"));
	}
	@Test
	public void testRemoveA2() {
		DeleteChars testbothchar =new DeleteChars();
		assertEquals("bda",testbothchar.removeA("AAbda"));
	}
	@Test
	public void testRemoveA3() {
		DeleteChars testnochar =new DeleteChars();
		assertEquals("bda",testnochar.removeA("bda"));
	}
}
