package com.tiago.helpdesk.repository;

import com.tiago.helpdesk.domain.Pessoa;
import com.tiago.helpdesk.domain.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {
}
