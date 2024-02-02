package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import me.dio.sacola.enumeration.FormaPagamento;

import java.util.List;

public class Sacola {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JsonIgnore
    private Cliente client;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Item> itens;
    private double valorTotal;

    @Enumerated
    private FormaPagamento formaPagamento;
    private boolean fechada;
}
