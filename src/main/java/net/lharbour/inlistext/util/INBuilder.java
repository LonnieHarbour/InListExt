package net.lharbour.inlistext.util;

import java.util.Collection;
import java.util.logging.Handler;

import net.lharbour.inlistext.exceptions.NoValueINListException;

public class INBuilder {

	public static String build(String key, Handler handler, final Collection<?> parms) {
		
		if (parms==null || parms.size()==0) {
			throw new NoValueINListException("Null or zero length parameter");
		}
		
		StringBuilder sb = new StringBuilder();

		
		
		return sb.toString();
	}
}
