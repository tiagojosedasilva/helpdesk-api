package com.tiago.helpdesk.service;

import com.tiago.helpdesk.domain.Tecnico;
import com.tiago.helpdesk.repository.TecnicoRepository;
import com.tiago.helpdesk.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TecnicoService {

    @Autowired
    public TecnicoRepository tecnicoRepository;

    public Tecnico findById(Integer id){
        Optional<Tecnico> opt = tecnicoRepository.findById(id);
        return opt.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado. id: " + id));
    }


    public List<Tecnico> findAll() {
        return tecnicoRepository.findAll();
    }
}
