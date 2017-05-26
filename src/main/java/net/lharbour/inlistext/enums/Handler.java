package net.lharbour.inlistext.enums;

public enum Handler {

	INTEGER(net.lharbour.inlistext.IntegerTypeHandler.class),
	STRING(net.lharbour.inlistext.StringTypeHandler.class),
	OBJECT(net.lharbour.inlistext.ObjectTypeHandler.class);
	Handler(Class<?> handler) {
		this.handler = handler;
	}
	private final Class<?> handler;
	public Class<?> handler() {
		return this.handler; 
	}
	public String key() {
		return this.handler.getSimpleName();
	}
	
}
