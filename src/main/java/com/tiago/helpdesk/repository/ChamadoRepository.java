package com.tiago.helpdesk.repository;

import com.tiago.helpdesk.domain.Chamado;
import com.tiago.helpdesk.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {
}
