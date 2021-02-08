package net.lharbour.tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import net.lharbour.inlistext.INList;
import net.lharbour.inlistext.enums.Handler;
import net.lharbour.inlistext.util.INBuilder;

public class TestLibrary {

	@Test
	public void test() {
		String expectedResult = "#{columnb, typeHandler=IntegerTypeHandler},#{columnb, typeHandler=IntegerTypeHandler},#{columnb, typeHandler=IntegerTypeHandler}";
		Collection<?> inlist = new INList(Arrays.asList(new Integer[] {1,2,3}));		
		assertEquals(INBuilder.build("columnb", Handler.INTEGER, inlist), expectedResult);
	}


}
