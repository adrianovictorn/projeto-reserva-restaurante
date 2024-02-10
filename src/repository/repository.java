package repository;

import java.time.LocalDateTime;
import java.util.ArrayList;

import model.Cliente;
import model.Mesa;
import model.Reserva;

public class repository {
    private ArrayList <Reserva> listasDeReservas;
    private ArrayList <Cliente> listaDeClientes;
    private ArrayList <Mesa> listaDeMesas;
    private ArrayList <LocalDateTime> listaDeHorarios;

    public repository(){
        listasDeReservas = new ArrayList<Reserva>();
        listaDeClientes = new ArrayList<Cliente>();
        listaDeMesas = new ArrayList<Mesa>();
        listaDeHorarios = new ArrayList<LocalDateTime>();
    }


    public void setListasDeReservas(ArrayList<Reserva> listasDeReservas) {
        this.listasDeReservas = listasDeReservas;
    }
    public ArrayList<Reserva> getListasDeReservas() {
        return listasDeReservas;
    }

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
