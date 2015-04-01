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
	
	public void test_num2text_un () {
		String input = "1";
		String expected = "un";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}
	public void test_num2text_deux () {
		String input = "2";
		String expected = "deux";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}
	public void test_num2text_trois () {
		String input = "3";
		String expected = "trois";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}
	public void test_num2text_quatre () {
		String input = "4";
		String expected = "quatre";
		Convert myConvert = new Convert();
		String actual = myConvert.num2text(input);
		Assert.assertEquals(expected, actual);
	}
}