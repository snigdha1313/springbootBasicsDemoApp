/**
 * com.example.exception
 * Jun 9, 2020
 * snigdha
 * 2020
 */
package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author snigdha
 *
 */	
@ControllerAdvice
public class ProductExceptionController {
	
	@ExceptionHandler(value = ProductNotfoundException.class)
	public ResponseEntity<Object> exception(ProductNotfoundException exception){
		return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
	}

}
