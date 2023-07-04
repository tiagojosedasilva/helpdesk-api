package com.tiago.helpdesk.service;

import com.tiago.helpdesk.domain.Tecnico;
import com.tiago.helpdesk.repository.TecnicoRepository;
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
        return opt.orElse(null);
    }

    public List<Tecnico> findAll(){
        return tecnicoRepository.findAll();
    }
}
