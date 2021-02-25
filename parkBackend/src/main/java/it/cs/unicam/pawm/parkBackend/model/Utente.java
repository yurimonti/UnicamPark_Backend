package it.cs.unicam.pawm.parkBackend.model;

public class Utente {
    private Long id;
    private String username;
    private String email;
    private String password;

    public Utente() {
    }

    public Utente(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
}
