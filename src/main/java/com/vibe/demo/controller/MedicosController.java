package com.vibe.demo.controller;

import java.util.List;

import com.vibe.demo.controller.dto.MedicoDto;
import com.vibe.demo.models.Medico;
import com.vibe.demo.repository.MedicoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicosController {
    
    @Autowired
    private MedicoRepository medicoRepository;

    @RequestMapping("/medicos")
      public List<MedicoDto>  lista(){
        List<Medico> medicos = medicoRepository.findAll();
        return MedicoDto.converter(medicos);   
    }
    
}
