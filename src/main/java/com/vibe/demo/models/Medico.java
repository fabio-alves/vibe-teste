package com.vibe.demo.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

import java.util.List;

@Entity
@Data
public class Medico {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String nome;
    private Long crm;

    @ManyToOne
    private List<Especialidade> especialidade;
    
}
