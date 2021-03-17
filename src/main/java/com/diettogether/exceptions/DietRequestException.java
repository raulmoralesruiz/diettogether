package com.diettogether.exceptions;

import com.diettogether.common.DietExceptionCode;

@SuppressWarnings("serial")
public class DietRequestException extends Exception{
	
	private final DietExceptionCode code;
	
	public DietRequestException(DietExceptionCode code) {
		super();
		this.code = code;
	}
	
	public DietExceptionCode getCode() {
		return this.code;
	}

}
