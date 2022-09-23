package com.TheDummiesDev.servicios;

import com.TheDummiesDev.entities.Usuario;
import com.TheDummiesDev.repositorios.repositorioUsuarios;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ServicioUsuarios {

    private repositorioUsuarios repositorioUs;

    //constructor
    public ServicioUsuarios(repositorioUsuarios repositorioUs) {
        this.repositorioUs = repositorioUs;
    }

    public repositorioUsuarios getRepositorioUs() {
        return repositorioUs;
    }

    public void setRepositorioUs(repositorioUsuarios repositorioUs) {
        this.repositorioUs = repositorioUs;
    }

    //metodos funcionales

    //funcion que busca al usuario
    public Usuario buscarPorEmail(String email){
        return this.repositorioUs.findByEmail(email);
    }
    //funcion que guarda a un nuevo usuario
    public Usuario crearUsuario(Usuario nuevoUsuario){
        return this.repositorioUs.save(nuevoUsuario);
    }

    public Usuario getOrCreateUsuario(Map<String, Object> DatosUsuario){
        String email = (String) DatosUsuario.get("email");
        Usuario usuario = buscarPorEmail(email);
        //validamos si el usuario existe o no
        if(usuario == null){
            String alias = (String) DatosUsuario.get("nickname");
            String imagen = (String) DatosUsuario.get("picture");
            String auth0id = (String) DatosUsuario.get("sub");

            Usuario nuevoUsuario = new Usuario(email=email, imagen=imagen, auth0id=auth0id);
            return crearUsuario(nuevoUsuario);
        }
        System.out.println(usuario.getEmail());
        return usuario;

    }



}
