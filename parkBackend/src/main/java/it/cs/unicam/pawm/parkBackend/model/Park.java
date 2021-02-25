package it.cs.unicam.pawm.parkBackend.model;

import it.cs.unicam.pawm.parkBackend.MyTime;

public class Park {
    private Long id;
    private String nome;
    private boolean isEmpty;
    private Utente utenteAssociato;
    private MyTime tempo;

    public Park() {
        //id verrà settato automaticamente dalla Strategy generation
        this.isEmpty = true;
        this.utenteAssociato=null;
        this.tempo = new MyTime();
    }

    public Park(String nome) {
        this();
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public Utente getUtenteAssociato() {
        return utenteAssociato;
    }

    public void setUtenteAssociato(Utente utenteAssociato) {
        this.utenteAssociato = utenteAssociato;
    }
}
