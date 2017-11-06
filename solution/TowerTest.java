import junit.framework.*;
import org.junit.Test;
import org.junit.Assert;

public class TowerTest extends TestCase {
	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void test1() throws Exception {
		String[] tower = new String[]{
			"*"
		};
		Assert.assertArrayEquals(tower, Tower.buildTower(1));
	}

	@Test
	public void test2() throws Exception {
		String[] tower = new String[]{
			" * ",
			"***"
		};
		Assert.assertArrayEquals(tower, Tower.buildTower(2));
	}

	@Test
	public void test5() throws Exception {
		String[] tower = new String[]{
			"    *    ",
			"   ***   ",
			"  *****  ",
			" ******* ",
			"*********",
		};
		Assert.assertArrayEquals(tower, Tower.buildTower(5));
	}
}