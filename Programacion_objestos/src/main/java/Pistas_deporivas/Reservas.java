package Pistas_deporivas;

import java.time.LocalDateTime;
import java.util.Objects;

public class Reservas {

    private Usuario usuario;
    private Pista pista;
    private LocalDateTime fechaHora;

    public Reservas(Usuario usuario, Pista pista) {
        this.usuario = usuario;
        this.pista = pista;
        fechaHora = LocalDateTime.now();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Pista getPista() {
        return pista;
    }

    public void setPista(Pista pista) {
        this.pista = pista;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "usuario=" + usuario +
                ", pista=" + pista +
                ", fechaHora=" + fechaHora +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Reservas reserva = (Reservas) o;
        return Objects.equals(pista, reserva.pista) && Objects.equals(fechaHora, reserva.fechaHora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pista, fechaHora);
    }


}