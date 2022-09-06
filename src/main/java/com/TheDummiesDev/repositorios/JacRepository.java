package com.TheDummiesDev.repositorios;

import com.TheDummiesDev.entities.Jac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JacRepository extends JpaRepository<Jac,Long> {
}
