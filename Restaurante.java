import java.time.LocalDateTime;
import java.util.ArrayList;

public class Restaurante {
    private String nome;
    private String endereco;
    private ArrayList <Reserva> listasDeReservas = new ArrayList<Reserva>();
    private ArrayList <Cliente> listaDeClientes = new ArrayList<Cliente>();
    private ArrayList <Mesa> listaDeMesas = new ArrayList<Mesa>(); 
    private ArrayList <LocalDateTime> listaDeHorarios = new ArrayList<LocalDateTime>();
    private int capacidadeRestaurante;

    // Construtor da classe
    public Restaurante (String nome, String endereco, int capacidadeRestaurante){
        this.setCapacidadeRestaurante(capacidadeRestaurante);
        this.setNome(nome);
        this.setEndereco(endereco);
    }
    // Fim contrutor 


    //Métodos Getter e Setters 
    public void setListasDeReservas(ArrayList<Reserva> listasDeReservas) {
        this.listasDeReservas = listasDeReservas;
    }
    public ArrayList<Reserva> getListasDeReservas() {
        return listasDeReservas;
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
    // Fim métodos Getters e Setters

    // ArrayList 
    public void cadastrarCliente (Cliente cliente){
        listaDeClientes.add(cliente);
    }

    public void adicionarMesa (Mesa mesa){
        listaDeMesas.add(mesa);
    }

    public void adicionarReserva (Reserva reserva){
        listasDeReservas.add(reserva);
    }

    public void adicionarHorario (LocalDateTime dataHora){
        listaDeHorarios.add(dataHora);
    }

    // Fim ArrayList
    public boolean verificarDisponibilidade(LocalDateTime dataHora, Mesa mesa, int numPessoas) {
        if (!listaDeHorarios.contains(dataHora)) {
            return false; 
        }
        if (mesa.getMaxQtdDePessoas() < numPessoas) {
            return false; 
        }
        for (Reserva reserva : listasDeReservas) {
            if (reserva.getDataHora().equals(dataHora) && reserva.getMesa().equals(mesa)) {
                if (reserva.getQtdDePessoas() <= mesa.getMaxQtdDePessoas()) {
                    return false; 
                }
            }
        }
        return true;
    }

    public ArrayList <Reserva> consultarReservas(){
            return listasDeReservas;

    }
}


