package com.example.batch7.group1.IBS.Controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.example.batch7.group1.IBS.exception.IBSException;



@ControllerAdvice
public class ExceptionsController {

	@ExceptionHandler(IBSException.class)
	public ModelAndView handleException(IBSException exp) {
		return new ModelAndView("error-page", "errMsg",exp.getMessage());
	}
}
