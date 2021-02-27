package it.cs.unicam.pawm.parkBackend.model;

import java.util.*;

public class DurataPrenotazione {
    private Calendar calendar;
    private Timer timer;

    public DurataPrenotazione() {
        this.calendar = new GregorianCalendar(Locale.ITALY);
    }

    public DurataPrenotazione(int minuti) {
        this();
        this.timer = new Timer();
    }

    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }
}
