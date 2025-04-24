package pe.edu.upc.swparkingzon.dtos;


import pe.edu.upc.swparkingzon.entities.Reserva;

public class NotificacionReservaDTO {

    private int idNotificacionReserva;

    private Reserva reserva;

    public int getIdNotificacionReserva() {
        return idNotificacionReserva;
    }

    public void setIdNotificacionReserva(int idNotificacionReserva) {
        this.idNotificacionReserva = idNotificacionReserva;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}
