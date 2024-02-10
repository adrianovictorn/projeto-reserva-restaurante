package model;

import java.time.LocalDateTime;

public abstract class AbstractEntity {
    protected String id;
    protected String senha;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

  
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getSenha() {
        return senha;
    }

    //public abstract  void confirmarReserva(Restaurante restaurante, LocalDateTime dataHora, int numeroPessoas, Mesa mesa);
    //public abstract void cancelarReserva();
    // public abstract void consultarReservas();

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractEntity)) {
            return false; // null or other class
        }
        AbstractEntity other = (AbstractEntity) obj;

        if (id != null) {
            return id.equals(other.id);
        }
        return super.equals(other);
    }
}