package ar.com.ada.api.billeteravirtual.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.billeteravirtual.entities.Persona;
import ar.com.ada.api.billeteravirtual.repos.PersonaRepository;


@Service
public class PersonaService{

    @Autowired
    PersonaRepository repo;

    public void grabar(Persona persona){
        repo.save(persona);
    }
}