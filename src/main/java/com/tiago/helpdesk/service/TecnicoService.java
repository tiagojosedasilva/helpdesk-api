package com.tiago.helpdesk.service;

import com.tiago.helpdesk.domain.Pessoa;
import com.tiago.helpdesk.domain.Tecnico;
import com.tiago.helpdesk.domain.dtos.TecnicoDTO;
import com.tiago.helpdesk.repository.PessoaRepository;
import com.tiago.helpdesk.repository.TecnicoRepository;
import com.tiago.helpdesk.service.exceptions.ObjectNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TecnicoService {

    @Autowired
    public TecnicoRepository tecnicoRepository;
    @Autowired
    public PessoaRepository pessoaRepository;

    public Tecnico findById(Integer id){
        Optional<Tecnico> opt = tecnicoRepository.findById(id);
        return opt.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado. id: " + id));
    }

    public List<Tecnico> findAll() {
        return tecnicoRepository.findAll();
    }

    public Tecnico create(TecnicoDTO objDTO) {
        objDTO.setId(null);
        validaPorCpfEmail(objDTO);
        Tecnico newObj = new Tecnico(objDTO);
        return tecnicoRepository.save(newObj);
    }

    private void validaPorCpfEmail(TecnicoDTO objDTO) {
        Optional<Pessoa> obj = pessoaRepository.findByCpf(objDTO.getCpf());
        if (obj.isPresent() && obj.get().getId() != objDTO.getId()){
            throw new DataIntegrityViolationException("CPF já cadastrado no sistema");
        }
        obj = pessoaRepository.findByEmail(objDTO.getEmail());
        if (obj.isPresent() && obj.get().getId() != objDTO.getId()){
            throw new DataIntegrityViolationException("E-mail já cadastrado no sistema");
        }
    }

    public Tecnico update(Integer id, @Valid TecnicoDTO objDTO) {
        objDTO.setId(id);
        Tecnico oldObj = findById(id);
        validaPorCpfEmail(objDTO);
        oldObj = new Tecnico(objDTO);
        return tecnicoRepository.save(oldObj);
    }
}
