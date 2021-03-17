package com.diettogether.exceptions;

import com.diettogether.common.DietExceptionCode;

@SuppressWarnings("serial")
public class DietUserException extends Exception{

private final DietExceptionCode code;
	
	public DietUserException(DietExceptionCode code) {
		super();
		this.code = code;
	}
	
	public DietExceptionCode getCode() {
		return this.code;
	}
}
