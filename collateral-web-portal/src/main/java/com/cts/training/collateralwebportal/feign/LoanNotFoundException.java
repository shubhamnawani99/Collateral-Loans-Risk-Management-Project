package com.cts.training.collateralwebportal.feign;

public class LoanNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2448534947969178721L;

	public LoanNotFoundException() {
		super();
	}

	public LoanNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public LoanNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public LoanNotFoundException(String message) {
		super(message);
	}

	public LoanNotFoundException(Throwable cause) {
		super(cause);
	}

}
