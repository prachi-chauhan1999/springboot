package com.cg.marketplace.exception;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.marketplace.controller.MarketPlaceController;

import java.io.IOException;

import org.springframework.http.HttpStatus;

@RestControllerAdvice

public class CentralizedExceptionHandler {
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(StudentNotFoundException.class)
	public String handleStudentNotFound(StudentNotFoundException e) {
		return e.getMessage();
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(StudentAlreadyExistsException.class)
	public String handleStudentExists(StudentAlreadyExistsException e) {
		return e.getMessage();
	}
	
	@ResponseStatus(HttpStatus.UNAUTHORIZED)
	@ExceptionHandler(NotLoggedInException.class)
	public String handleLogin(NotLoggedInException e) {
		return e.getMessage();
	}
	
	@ResponseStatus(HttpStatus.EXPECTATION_FAILED)
	@ExceptionHandler(Exception.class)
	public String handleError(Exception e) {
		e.printStackTrace();
		return e.getMessage();
	}

}
