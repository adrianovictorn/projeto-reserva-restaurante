package model;

public class Restaurante {
    private String nome;
    private String endereco;
    private int capacidadeRestaurante;

   
    public Restaurante (String nome, String endereco, int capacidadeRestaurante){
        this.setCapacidadeRestaurante(capacidadeRestaurante);
        this.setNome(nome);
        this.setEndereco(endereco);
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setCapacidadeRestaurante(int capacidadeRestaurante) {
        this.capacidadeRestaurante = capacidadeRestaurante;
    }
    public int getCapacidadeRestaurante() {
        return capacidadeRestaurante;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEndereco() {
        return endereco;
    }
  
    

}


