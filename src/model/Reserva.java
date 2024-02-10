package model;
import java.time.LocalDateTime;

public class Reserva {
    private int idDaReserva;
    private int qtdDePessoas;
    private LocalDateTime dataHora;
    private Mesa idMesa;
    private Cliente cliente;
    private Restaurante restaurante;
    private boolean disponivel;


    public Reserva (){
        this.setDisponivel(true);
    }

    public void setDataHora(LocalDateTime dataHora){
        this.dataHora = dataHora;
    }

    public LocalDateTime getDataHora(){
        return dataHora;
    }

    public void setIdDaReserva (int idDaReserva){
        this.idDaReserva = idDaReserva; 
    }

    public int getIdDaReserva (){
        return idDaReserva;
    }
    
    public void setQtdDePessoas(int qtdDePessoas){
        this.qtdDePessoas = qtdDePessoas;
    }

    public int getQtdDePessoas(){
        return qtdDePessoas;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public boolean getDisponivel(){
        return this.disponivel;
    }

    public void setCliente (Cliente cliente){
        this.cliente = cliente;
    }

    public Cliente getCliente (){
        return cliente;
    }

    public void setRestaurante (Restaurante restaurante){
        this.restaurante = restaurante;
    }

    public Restaurante getRestaurante (){
        return restaurante;
    }

    public void setMesa (Mesa mesa){
        this.idMesa = mesa;
    }

    public Mesa getMesa (){
        return idMesa;
    } 
}

