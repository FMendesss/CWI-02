package MCMD;

public class Endereco {
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private UnidadeFederativa estado;

    public UnidadeFederativa getEstado() {
        return estado;
    }
}
