package com.TheDummiesDev.servicios;
import com.TheDummiesDev.entities.Empleado;
import com.TheDummiesDev.entities.movimientoDinero;
import com.TheDummiesDev.repositorios.movimientoDineroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class movimientoDineroService {

    private movimientoDineroRepository repositoryMov;

    //constructor
    public movimientoDineroService(movimientoDineroRepository repositoryMov) {
        this.repositoryMov = repositoryMov;

    }
    //getter para obtner listado movimientos realizados
    public List<movimientoDinero> getListaMovimientoDinero() {

        return this.repositoryMov.findAll();
    }
    //crear nuevo movimiento de dinero
    public movimientoDinero createMovimientoDinero(movimientoDinero newMovimentoDinero) {

       return this.repositoryMov.save(newMovimentoDinero);
    }
    public movimientoDinero getMovimiento(long id){
        return this.repositoryMov.findById(id).get();
    }
    public void borrarmovimiento(long id){
        this.repositoryMov.deleteById(id);
    }

}
