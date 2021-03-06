package br.com.imobi.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class EntityUseException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public EntityUseException(String mensagem) {
		super(mensagem);
	}

}