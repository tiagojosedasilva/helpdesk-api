package com.tiago.helpdesk.repository;

import com.tiago.helpdesk.domain.Cliente;
import com.tiago.helpdesk.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
