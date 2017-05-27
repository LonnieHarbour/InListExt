package net.lharbour.inlistext.util;

import java.util.Collection;

import net.lharbour.inlistext.enums.Handler;
import net.lharbour.inlistext.exceptions.NoValueINListException;

public class INBuilder {

	public static String build(String name, Handler handler, final Collection<?> parms) {
		
		if (parms==null || parms.size()==0) {
			throw new NoValueINListException("Null or zero length parameter");
		}
		
		StringBuilder sb = new StringBuilder();

		for (int x=0;x<parms.size();x++) {
			sb.append(sb.length()==0 ? "" : ",");
			sb.append("#{").
			   append(name).
			   append(", typeHandler=").
			   append(handler.key()).
			   append("}");
		}
		
		return sb.toString();
	}
}
