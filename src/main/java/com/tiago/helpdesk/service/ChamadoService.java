package com.tiago.helpdesk.service;

import com.tiago.helpdesk.domain.Chamado;
import com.tiago.helpdesk.repository.ChamadoRepository;
import com.tiago.helpdesk.service.exceptions.ObjectNotFoundException;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChamadoService {

    @Autowired
    private ChamadoRepository repository;

    public Chamado findById(Integer id){
        Optional<Chamado> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! id: " + id));
    }

    public List<Chamado> findAll() {
        return repository.findAll();
    }
}
