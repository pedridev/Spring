package com.java.aprendendospring.infrastructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Setter @Getter @AllArgsConstructor @NoArgsConstructor @Entity @Table(name = "telefone")

public class Telefone {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    @Column(name = "numero", length = 10) private String numero;
    @Column(name = "ddd", length = 3) private String ddd;
}
