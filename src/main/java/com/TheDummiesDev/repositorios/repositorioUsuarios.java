package com.TheDummiesDev.repositorios;

import com.TheDummiesDev.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repositorioUsuarios extends JpaRepository<Usuario, Long> {
        Usuario findByEmail(String email);

        }
