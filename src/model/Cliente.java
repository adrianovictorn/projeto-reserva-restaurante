package model;

import java.time.LocalDateTime;

public class Cliente extends AbstractEntity {
   private String nomeDoCliente;
   private String cpfDoCliente;
   private String emailUsuario;
   
   

    public Cliente (String id, String emailDoUsuario,String nomeDoCliente, String cpfDoCliente, String senhaDoCliente){
        this.setId(id);
        this.setEmailUsuario(emailDoUsuario);
        this.setNomeDoCliente(nomeDoCliente);
        this.setCpfDoCliente(cpfDoCliente);
        this.setSenha(senhaDoCliente);
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }
    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }
    public String getCpfDoCliente() {
        return cpfDoCliente;
    }
    public void setCpfDoCliente(String cpfDoCliente) {
        this.cpfDoCliente = cpfDoCliente;
    }
    public String getEmailUsuario() {
        return emailUsuario;
    }
    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }


    /*
    public Reserva solicitarReserva(Restaurante restaurante, LocalDateTime dataHora, int numeroPessoas, Mesa mesa){
        Reserva novaReserva = new Reserva();
        novaReserva.setDisponivel(false);
        novaReserva.setQtdDePessoas(numeroPessoas);
        novaReserva.setDataHora(dataHora);
        novaReserva.setMesa(mesa);
        novaReserva.setCliente(this);

        if (restaurante.verificarDisponibilidade(dataHora, mesa, numeroPessoas)){
            restaurante.cadastrarCliente(this);
            restaurante.adicionarReserva(novaReserva);
            return novaReserva;
        }
        return novaReserva;
    }
    */

   
    /* 
    @Override
    public void cancelarReserva() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelarReserva'");
    }

    @Override
    public void consultarReservas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'consultarReservas'");
    }

    @Override
    public void confirmarReserva(Restaurante restaurante, LocalDateTime dataHora, int numeroPessoas, Mesa mesa) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'confirmarReserva'");
    }
    */
}
