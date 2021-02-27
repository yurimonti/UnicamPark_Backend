package it.cs.unicam.pawm.parkBackend.model;

import javax.persistence.*;

@Entity
@Table(name = "parks")
public class Park {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "isEmpty")
    private boolean isEmpty;

    public Park() {
        this.isEmpty = true;
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

}
