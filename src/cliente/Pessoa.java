package cliente;
/**
 *
 * @author Carlos
 */
public class Pessoa {
    private int id;
    private String nome;
    private String cpf;
    private String cidade;
    private String estado;
    private String endereco;

    public Pessoa(String nome, String cpf, String cidade, String estado, String endereço) {
        this.nome = nome;
        this.cpf = cpf;
        this.cidade = cidade;
        this.estado = estado;
        this.endereco = endereço;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}
