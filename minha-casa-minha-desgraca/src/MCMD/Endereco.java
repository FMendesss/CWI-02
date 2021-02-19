package MCMD;

public class Endereco {
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private UnidadeFederativa estado;

    public Endereco(String logradouro, int numero, String complemento, String bairro, String cidade, UnidadeFederativa estado) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }



    public UnidadeFederativa getEstado() {
        return estado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }



    //FIXME colocar a parte do @override e tostring

    //usar tostring quando se tem um padrão de texto a ser apresentado
}
