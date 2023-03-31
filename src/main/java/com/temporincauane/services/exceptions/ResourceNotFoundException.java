package com.temporincauane.services.exceptions;

//Classe para recurso(id) não encontrado
public class ResourceNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Resource not found. ID " + id);
	}
	
}
