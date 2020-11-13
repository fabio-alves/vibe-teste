package com.vibe.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.GenerationType;
import java.util.*;

@Entity
public class Consulta {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Medico medico;

    @OneToOne
    private Paciente paciente;

    private Date hora_inicial;
    private Date hora_final;
    private String status;
}
