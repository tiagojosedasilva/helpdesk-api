package com.tiago.helpdesk.resourcer;

import com.tiago.helpdesk.domain.Tecnico;
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

    @GetMapping
    public List<Tecnico> findAll(){
        List<Tecnico> listTec = service.findAll();
        return listTec;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tecnico> findById(@PathVariable Integer id){
        Tecnico tec = service.findById(id);
        return ResponseEntity.ok().body(tec);
    }
}
