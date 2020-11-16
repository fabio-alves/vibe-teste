package com.vibe.demo.models;

import javax.persistence.Entity;

import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Horarios {
    private Date dia_semana;
    private Date hora_inicio;
    private Date hora_fim;

    
}
