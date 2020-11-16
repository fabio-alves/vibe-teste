package com.vibe.demo.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.vibe.demo.models.Medico;

import lombok.Data;
import lombok.Getter;

@Data
public class MedicoDto {
  private Long id;
  private String nome;
  private Long crm;

  public MedicoDto(Medico medico){
    this.id = medico.getId();
    this.nome = medico.getNome();
    this.crm = medico.getCrm();
  }

public static List<MedicoDto> converter(List<Medico> medicos) {
	return medicos.stream().map(MedicoDto::new).collect(Collectors.toList());
}
  
}
