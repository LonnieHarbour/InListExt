package net.lharbour.inlistext.exceptions;

public class NoValueINListException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -31832180369342906L;

	public NoValueINListException() {
		super();
	}

	public NoValueINListException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NoValueINListException(String message, Throwable cause) {
		super(message, cause);
	}

	public NoValueINListException(String message) {
		super(message);
	}

	public NoValueINListException(Throwable cause) {
		super(cause);
	}

}
