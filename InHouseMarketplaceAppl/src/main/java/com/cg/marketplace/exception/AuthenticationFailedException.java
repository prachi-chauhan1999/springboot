package com.cg.marketplace.exception;

public class AuthenticationFailedException extends RuntimeException {

	public AuthenticationFailedException(String msg) {
		super(msg);
	}

}
