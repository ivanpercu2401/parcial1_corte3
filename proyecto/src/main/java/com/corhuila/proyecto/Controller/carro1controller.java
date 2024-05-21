package com.corhuila.proyecto.Controller;

public import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.corhuila.proyecto.Entity.Carro;
import com.corhuila.proyecto.Entity.Categoria;
import com.corhuila.proyecto.IService.ICarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/carro")
@CrossOrigin(origins = "*")

public class CarroController {

    @Autowired
    private CarroService carroService;

    @GetMapping
    public List<Carro> getAllCarros() {
        return carroService.getAllCarros();
    }

    @PostMapping
    public Carro createCarro(@RequestBody Carro carro) {
        return carroService.saveCarro(carro);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Carro> getCarroById(@PathVariable Long id) {
        return carroService.getCarroById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Carro> updateCarro(@PathVariable Long id, @RequestBody Carro carroDetails) {
        return carroService.updateCarro(id, carroDetails);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCarro(@PathVariable Long id) {
        return carroService.deleteCarro(id);
    }
}
 {
    
}
