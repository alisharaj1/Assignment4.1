package com.four.exception;

public class ProductException extends RuntimeException{


	private static final long serialVersionUID = 1L;

	public ProductException(String message) {
		super(message);
	}

	public ProductException() {
		super();
	}

	public ProductException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ProductException(String message, Throwable cause) {
		super(message, cause);
	}

	public ProductException(Throwable cause) {
		super(cause);
	}

}


