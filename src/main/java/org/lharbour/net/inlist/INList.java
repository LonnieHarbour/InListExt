package org.lharbour.net.inlist;

public class INList<E> extends java.util.ArrayList<E> {

	private static final long serialVersionUID = -1853868187882327202L;

	public INList() {
		super();
	}

	public INList(java.util.Collection<? extends E> arg0) {
		super(arg0);
	}

	public INList(int arg0) {
		super(arg0);
	}
	
	private Integer lastConsumed = 0;
	
	public E consume() {
		return this.get(lastConsumed++);
	}
	
	public boolean moreToConsume() {
		return this.size() > lastConsumed;
	}
	
	public void resetConsumer() {
		lastConsumed = 0;
	}
	
}
