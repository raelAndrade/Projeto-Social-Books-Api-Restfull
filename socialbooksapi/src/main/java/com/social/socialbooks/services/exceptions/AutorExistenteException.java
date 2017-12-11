package com.social.socialbooks.services.exceptions;

public class AutorExistenteException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4179568114131207634L;

	public AutorExistenteException(String mensagem) {
		super(mensagem);
	}
	
	public AutorExistenteException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
	
	

}
