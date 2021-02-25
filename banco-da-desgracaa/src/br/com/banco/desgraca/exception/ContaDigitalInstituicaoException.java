package br.com.banco.desgraca.exception;

public class ContaDigitalInstituicaoException extends RuntimeException {

    public ContaDigitalInstituicaoException(String mensagemDeErro) {
        super(mensagemDeErro);
    }
}