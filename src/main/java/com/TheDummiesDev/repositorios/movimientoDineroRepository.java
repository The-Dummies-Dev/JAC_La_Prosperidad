package com.TheDummiesDev.repositorios;
import com.TheDummiesDev.entities.movimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface movimientoDineroRepository extends JpaRepository<movimientoDinero,Long> {
}
