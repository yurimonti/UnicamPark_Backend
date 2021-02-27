package it.cs.unicam.pawm.parkBackend.model;

public class Prenotazione {
    private DurataPrenotazione durata;
    private Park park;

    public Prenotazione(Park park,DurataPrenotazione durata) {
        this.park = park;
        this.durata = durata;
    }

    public DurataPrenotazione getDurata() {
        return durata;
    }

    public void setDurata(DurataPrenotazione durata) {
        this.durata = durata;
    }

    public Park getPark() {
        return park;
    }

    public void setPark(Park park) {
        this.park = park;
    }
}
