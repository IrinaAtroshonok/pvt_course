package core;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MassiveTest {
	static ArrayList<Integer> list;
	static Massive massive;
	int[] array = { 1, 3, 2, 4 };

	@BeforeClass
	public static void beforeClass() {
		massive = new Massive();
		list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(4);
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void aferTets() {
		System.out.println("After Test");
	}

	@AfterClass
	public static void clearArr() {
		list.clear();
	}

	@BeforeMethod
	public void beforeMetod() {
		System.out.println("Before Method");
	}

	@AfterMethod
	public void afterMetod() {
		System.out.println("After Method");
	}

	@Test
	public void testEqualsMin() {
		Assert.assertEquals(5, massive.min(5, 7));
	}

	@Test(enabled = false)
	public void testNotEqualsMin() {
		Assert.assertNotEquals(3, massive.min(5, 7));
	}

	@Test
	public void testEqualsMax() {
		Assert.assertEquals(25, massive.max(25, 21));
	}

	@Test
	public void testNotEqualsMax() {
		Assert.assertNotEquals(25, massive.max(22, 21));
	}

	@Test
	public void testEqualsDifference() {
		Assert.assertEquals(4, massive.difference(25, 21));
	}

	@Test
	public void testNotEqualsDifference() {
		Assert.assertNotEquals(5, massive.difference(25, 21));
	}

	@Test
	public void testEqualsSum() {
		Assert.assertEquals(25, massive.sum(10, 15));
	}

	@Test
	public void testNotEqualsSum() {
		Assert.assertNotEquals(25, massive.sum(22, 21));
	}

	@Test
	public void testEqualsMultiplie() {
		Assert.assertEquals(6, massive.multiplie(2, 3));
	}

	@Test
	public void testNotEqualsMultiplie() {
		Assert.assertNotEquals(6, massive.multiplie(3, 3));
	}

	@Test
	public void testEqualsDevided() {
		Assert.assertEquals(1, massive.devided(3, 3));
	}

	@Test
	public void testNotEqualsDevided() {
		Assert.assertNotEquals(6, massive.devided(3, 3));
	}

	@Test
	public void testEqualsArr() {
		Assert.assertEquals(list, massive.arrayFill(4));
	}

	@Test
	public void testNotEqualsArr() {
		Assert.assertNotEquals(list, massive.arrayFill(4));
	}

	@Test
	public void testEquals2Arr() {
		Assert.assertEquals(massive.arrayFill(4), massive.arrayFill(4));
	}

	@Test
	public void testNotEquals2Arr() {
		Assert.assertNotEquals(massive.arrayFill(4), massive.arrayFill(4));
	}

	@Test
	public void testEqualsArrays() {
		Assert.assertEquals(Arrays.toString(massive.arraySort(array)), Arrays.toString(massive.arraySort(array)));
	}

	@Test
	public void testNotEqualsArrays() {
		Assert.assertNotEquals(Arrays.toString(array), Arrays.toString(massive.arraySort(array)));
	}

	@Test
	public void testEqualsArrays1() {
		Assert.assertEquals(massive.arrayFill(4), Arrays.toString(massive.arraySort(array)));
	}

	@Test
	public void testNotEqualsArrays1() {
		Assert.assertNotEquals(massive.arrayFill(4), Arrays.toString(massive.arraySort(array)));
	}

	@Test
	public void testEqualsStrings() {
		String string = "Irisha";
		Assert.assertEquals(string + "Ira", massive.modifiedString(string));
	}

	@Test
	public void testNotEqualsStrings() {
		String string = "Irisha";
		Assert.assertNotEquals(string, massive.modifiedString(string));
	}

	@Test(expectedExceptions = NumberFormatException.class)
	public void testExpectedException() {
		Assert.assertNotEquals(3, massive.parseInteger("str"));
	}

	@Test(expectedExceptions = NumberFormatException.class)
	public void testExpectedNotException() {
		Assert.assertEquals(3, massive.parseInteger("3"));
	}

	@Test(expectedExceptions = NumberFormatException.class)
	public void testExpectedNotException2() {
		Assert.assertNotEquals(2, massive.parseInteger("3"));
	}

}
