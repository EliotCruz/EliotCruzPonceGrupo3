package com.example.test.controllers;

import com.example.test.models.tarea;
import com.example.test.repository.TareaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TareaController {
    @Autowired
    private TareaRepository tareaRepository;

    @GetMapping(value = "/tarea")
    public List<tarea> getTareas() {
        return tareaRepository.findAll();
    }

    @PostMapping(value = "/tarea/crear")
    public String saveTarea(@RequestBody tarea tarea) {
        tareaRepository.save(tarea);
        return "Tarea guardada";
    }

    @PutMapping(value = "/tarea/actualizar/{id}")
    public String updateTarea(@PathVariable long id, @RequestBody tarea tarea) {
        tarea tarea1 = tareaRepository.findById(id).orElseThrow();
        tarea1.setNombre(tarea.getNombre());
        tarea1.setDescripcion(tarea.getDescripcion());
        tarea1.setFecha_inicio(tarea.getFecha_inicio());
        tarea1.setFecha_fin(tarea.getFecha_fin());
        tarea1.setEstado(tarea.getEstado());
        tareaRepository.save(tarea1);
        return "Tarea actualizada";
    }

    @GetMapping(value = "/tarea/{id}")
    public tarea getTareaById(@PathVariable long id) {
        return tareaRepository.findById(id).orElseThrow();
    }

    @DeleteMapping(value = "/tarea/eliminar/{id}")
    public String deleteTarea(@PathVariable long id) {
        tareaRepository.deleteById(id);
        return "Tarea eliminada";
    }

}
