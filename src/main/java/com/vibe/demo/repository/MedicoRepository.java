package com.vibe.demo.repository;

import com.vibe.demo.models.Medico;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

    
}
