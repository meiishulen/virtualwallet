package ar.com.ada.api.billeteravirtual.repos;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


import ar.com.ada.api.billeteravirtual.entities.Persona;

@Repository
public interface  PersonaRepository extends JpaRepository <Persona, Integer>{
    
}