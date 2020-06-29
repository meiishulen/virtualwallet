package ar.com.ada.api.billeteravirtual.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.billeteravirtual.entities.Persona;
import ar.com.ada.api.billeteravirtual.entities.Usuario;
import ar.com.ada.api.billeteravirtual.repos.UsuarioRepository;
import ar.com.ada.api.billeteravirtual.security.Crypto;

@Service
public class UsuarioService {

  @Autowired
  UsuarioRepository repo;

  @Autowired
  PersonaService personaService;

  public Usuario buscarPorUsername(String username) {
    return null;
  }

  public void login(String username, String password) {
  }

  /*
   * 2. Metodo iniciar sesion 2.1 recibe el username y el password 2.2 validamos
   * los datos devolver un verdadero o falso
   */

  public Usuario crearUsuario(String fullName, int country, int identificationType, String identification,
      Date birthDate, String email, String password) {
    /*
     * 1. metedodo: Crear Usuario 1.1 >> Crear Persona(setearle usuario) 1.2 >>
     * Crear Usuario 1.3 >> Crear una Billetera(setearle una persona) 1.4 >> Crear
     * una cuenta en pesos/dolar
     */
  
    Persona persona = new Persona();
    persona.setNombre(fullName);
    persona.setPaisId(country);
    persona.setTipoDocumento(identificationType);
    persona.setDocumento(identification);
    persona.setFechaNacimiento(birthDate);

    Usuario usuario = new Usuario();
    usuario.setUsername(email);
    usuario.setEmail(email);
    usuario.setPassword(Crypto.encrypt(password, email));

    persona.setUsuario(usuario);

    personaService.grabar(persona);

    return usuario;

  }

}