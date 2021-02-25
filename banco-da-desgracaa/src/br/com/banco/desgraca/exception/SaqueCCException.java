package br.com.banco.desgraca.exception;

public class SaqueCCException extends RuntimeException {

    public SaqueCCException(String mensagemDeErro) {
        super(mensagemDeErro);
    }

}
