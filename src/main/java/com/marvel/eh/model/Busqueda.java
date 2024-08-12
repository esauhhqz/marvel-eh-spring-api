package com.marvel.eh.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "busqueda")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Busqueda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;


    @Column(name = "user", nullable = false)
    private String user;


    @Column(name = "action", nullable = false)
    private String action;


    @Column(name = "url", nullable = false)
    private String url;


}
