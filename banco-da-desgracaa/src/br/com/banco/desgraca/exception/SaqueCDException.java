package br.com.banco.desgraca.exception;

public class SaqueCDException extends RuntimeException {

    public SaqueCDException(String mensagemDeErro) {
        super(mensagemDeErro);
    }
}
