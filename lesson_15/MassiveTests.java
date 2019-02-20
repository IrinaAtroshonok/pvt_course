package core;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import core.Massive;

public class MassiveTests {
	static ArrayList<Integer> list;
	static Massive massive;

	@BeforeClass
	public static void beforeClass() {
		massive = new Massive();
		list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
	}

	@Before
	public void before() {
		System.out.println("Before Metod");
	}

	@After
	public void aferMetod() {
		System.out.println("After Metod");
	}

	@AfterClass
	public static void clearArr() {
		list.clear();
	}

	@Test
	public void testEqualsMin() {
		Assert.assertEquals("Зелёный", 5, massive.min(5, 7));
	}

	@Ignore("such task")
	@Test
	public void testNotEqualsMin() {
		Assert.assertNotEquals(3, massive.min(5, 7));
	}

	@Test
	public void testEqualsMax() {
		Assert.assertEquals("Зелёный", 25, massive.max(25, 21));
	}

	@Test
	public void testNotEqualsMax() {
		Assert.assertNotEquals("Зелёный", 25, massive.max(22, 21));
	}

	@Test
	public void testEqualsArr() {
		Assert.assertEquals("Синий, будет почти всегда", list, massive.arrayFill(4));

	}

	@Test
	public void testNotEqualsArr() {
		Assert.assertNotEquals("Зелёный, если массивы разные", list, massive.arrayFill(4));

	}

	@Test(timeout = 5000)
	public void testEqualsStrings() {
		String string = "Irisha";
		Assert.assertEquals("Синий", string, massive.modifiedString(string));
	}

	@Test
	public void testNotEqualsStrings() {
		String string = "Irisha";
		Assert.assertNotEquals("Зеленый", string, massive.modifiedString(string));
	}

	@Test(expected = NumberFormatException.class)
	public void testExpectedException() {
		Assert.assertEquals("Зелёный", 3, massive.parseInteger("str"));
	}

	@Test(expected = NumberFormatException.class)
	public void testExpectedNotException() {
		Assert.assertEquals("Синий", 3, massive.parseInteger("3"));
	}

}
