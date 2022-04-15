package com.example.demo.exception;

public abstract class apiException extends Exception {
	
	private static final long serialVersionUID = -2061318863847304479L;

	public apiException(String message) {
	super(message);
	}

}
