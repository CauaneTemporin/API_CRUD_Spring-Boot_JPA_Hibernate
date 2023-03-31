package com.temporincauane.resouces.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.temporincauane.services.exceptions.DatabaseException;
import com.temporincauane.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

//Lidar com exceções lançadas em qualquer lugar da sua aplicação
@ControllerAdvice
public class ResourceExceptionHandler {
	
	//Método para interceptar qualquer exceção desse tipo e realizar o tratamento
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFoundException (ResourceNotFoundException e, HttpServletRequest request){
		String erro = "Resource not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(Instant.now(), status.value(), erro, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
	
	@ExceptionHandler(DatabaseException.class)
	public ResponseEntity<StandardError> databaseException (DatabaseException e, HttpServletRequest request){
		String erro = "Database error";
		HttpStatus status = HttpStatus.BAD_REQUEST;
		StandardError err = new StandardError(Instant.now(), status.value(), erro, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
}
