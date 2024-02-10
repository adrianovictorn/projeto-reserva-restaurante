package model;
public class Mesa extends AbstractEntity{
    private String numeroDeIdentificacao;
    private String descricaoDoItem;
    private int maxQtdDePessoas;

    public Mesa(String numeroDeIdentificacao, String descricaoDoItem, int maxQtdDePessoas) {
        this.setNumeroDeIdentificacao(numeroDeIdentificacao);
        this.setDescricaoDoItem(descricaoDoItem);
        this.setMaxQtdDePessoas(maxQtdDePessoas);
    }

    public String getNumeroDeIdentificacao() {
        return numeroDeIdentificacao;
    }

    public void setNumeroDeIdentificacao(String numeroDeIdentificacao) {
        this.numeroDeIdentificacao = numeroDeIdentificacao;
    }

    public String getDescricaoDoItem() {
        return descricaoDoItem;
    }

    public void setDescricaoDoItem(String descricaoDoItem) {
        this.descricaoDoItem = descricaoDoItem;
    }

    public int getMaxQtdDePessoas() {
        return maxQtdDePessoas;
    }

    public void setMaxQtdDePessoas(int maxQtdDePessoas) {
        this.maxQtdDePessoas = maxQtdDePessoas;
    }
}
