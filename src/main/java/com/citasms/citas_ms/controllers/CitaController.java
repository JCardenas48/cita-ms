package com.citasms.citas_ms.controllers;

import com.citasms.citas_ms.models.Cita;
import com.citasms.citas_ms.repositories.CitaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CitaController {
    private final CitaRepository repository;

    public CitaController(CitaRepository repository){
        this.repository = repository;
    }

    @GetMapping("/cita/{idCita}")
    public Optional<Cita> getCita(@PathVariable String idCita){
        return this.repository.findById(idCita);
    }

    @PostMapping ("/cita")
    public Cita newCita(@RequestBody Cita cita){
        return  this.repository.save(cita);
    }

    @DeleteMapping("/cita/{idCita}")
    public  void deleteCita(@PathVariable String idCita){
        repository.deleteById(idCita);
    }

    @PutMapping("/cita/{idCita}")
    public Cita updateCita(@PathVariable String idCita, @RequestBody Cita new_cita){
        Cita old_cita = repository.findById(idCita).orElse(null);
        // Esto Actualiza el objeto de Java
        old_cita.setPacienteId(new_cita.getPacienteId());
        old_cita.setProfesionalId(new_cita.getProfesionalId());
        old_cita.setFecha(new_cita.getFecha());
        old_cita.setEspecialidad(new_cita.getEspecialidad());

        // Esto si actualiza la base de datos
        return  repository.save(old_cita);
    }

}
