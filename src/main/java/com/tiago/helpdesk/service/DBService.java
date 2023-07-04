package com.tiago.helpdesk.service;

import com.tiago.helpdesk.domain.Chamado;
import com.tiago.helpdesk.domain.Cliente;
import com.tiago.helpdesk.domain.Tecnico;
import com.tiago.helpdesk.domain.enums.Perfil;
import com.tiago.helpdesk.domain.enums.Prioridade;
import com.tiago.helpdesk.domain.enums.Status;
import com.tiago.helpdesk.repository.ChamadoRepository;
import com.tiago.helpdesk.repository.ClienteRepository;
import com.tiago.helpdesk.repository.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    TecnicoRepository tecnicoRepository;
    @Autowired
    ClienteRepository clienteRepository;
    @Autowired
    ChamadoRepository chamadoRepository;

    public void instanciaDB(){
        Tecnico tec1 = new Tecnico(null, "Valdir cezar", "63653230268", "valdir@gmail.com", "123");
        tec1.addPerfil(Perfil.ADMIN);
        Cliente cli1 = new Cliente(null, "Linus Torvaldis", "80527954780","torvalds@gamil.com","123");
        Chamado cha1 = new Chamado(null, Prioridade.MMEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1, cli1);

        tecnicoRepository.saveAll(Arrays.asList(tec1));
        clienteRepository.saveAll(Arrays.asList(cli1));
        chamadoRepository.saveAll(Arrays.asList(cha1));
    }
}
