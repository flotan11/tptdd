package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert {
	@Test
	public void test_num2text_zero () {
		String input = "0";
		String expected = "zero";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_un () {
		String input = "1";
		String expected = "un";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_deux () {
		String input = "2";
		String expected = "deux";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_trois () {
		String input = "3";
		String expected = "trois";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_quatre () {
		String input = "4";
		String expected = "quatre";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_cinq () {
		String input = "5";
		String expected = "cinq";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_six () {
		String input = "6";
		String expected = "six";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_sept () {
		String input = "7";
		String expected = "sept";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_huit () {
		String input = "8";
		String expected = "huit";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_neuf () {
	String input = "9";
	String expected = "neuf";
	Convert myConvert = new Convert();
	String actual = myConvert.num2text(input);
	Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_dix () {
		String input = "10";
		String expected = "dix";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_vinghtquatre () {
		String input = "24";
		String expected = "vinght-quatre";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_trentedeux () {
		String input = "32";
		String expected = "trente-deux";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}
}