import java.time.LocalDateTime;

public class Administrador extends Usuario {
    
    public void adicionarDataEHora(Restaurante restaurante, LocalDateTime dataEHora){
        restaurante.adicionarHorario(dataEHora);
    }

    public void adicionarQtdMesas(Restaurante restaurante, Mesa mesa){
        restaurante.adicionarMesa(mesa);
    }

    public void cadastrarCliente (Restaurante restaurante, Cliente cliente){
        restaurante.cadastrarCliente(cliente);
    }

    public String notificarCliente (Cliente cliente, Restaurante restaurante){
        return "Sua Reserva no"+restaurante.getNome()+"no endereço"+restaurante.getEndereco();
    }
}
