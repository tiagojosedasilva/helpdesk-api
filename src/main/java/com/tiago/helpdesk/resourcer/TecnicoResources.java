package com.tiago.helpdesk.resourcer;

import com.tiago.helpdesk.domain.Tecnico;
import com.tiago.helpdesk.domain.dtos.TecnicoDTO;
import com.tiago.helpdesk.repository.TecnicoRepository;
import com.tiago.helpdesk.service.TecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tecnicos")
public class TecnicoResources {

    @Autowired
    private TecnicoService service;


    @GetMapping("/{id}")
    public ResponseEntity<TecnicoDTO> findById(@PathVariable Integer id){
        Tecnico obj = service.findById(id);
        return ResponseEntity.ok().body(new TecnicoDTO(obj));
    }
}
