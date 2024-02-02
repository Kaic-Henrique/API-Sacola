package me.dio.sacola.model;

import jakarta.persistence.*;
import org.hibernate.engine.internal.Cascade;

import java.util.List;

public class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Produto> produtos;
    @Embedded
    private Endereco endereco;
}
