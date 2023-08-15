package com.example.test.controllers;

import com.example.test.exception.TareaException;
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
        if (tareaRepository.count() == 0)
            throw new TareaException("No hay tareas");
        return tareaRepository.findAll();
    }

    @PostMapping(value = "/tarea/crear")
    public String saveTarea(@RequestBody tarea tarea) {
        if(tarea.getNombre().isEmpty())
            throw new TareaException("El nombre no puede estar vacio");
        if(tarea.getDescripcion().isEmpty())
            throw new TareaException("La descripcion no puede estar vacia");
        if(tarea.getFecha_inicio() == null)
            throw new TareaException("La fecha de inicio no puede estar vacia");
        if(tarea.getFecha_fin() == null)
            throw new TareaException("La fecha de fin no puede estar vacia");
        if(tarea.getEstado().isEmpty())
            throw new TareaException("El estado no puede estar vacio");
        if(tarea.getFecha_inicio().after(tarea.getFecha_fin()))
            throw new TareaException("La fecha de inicio no puede ser mayor a la fecha de fin");
        tareaRepository.save(tarea);
        return "Tarea guardada";
    }

    @PutMapping(value = "/tarea/actualizar/{id}")
    public String updateTarea(@PathVariable long id, @RequestBody tarea tarea) {
        if(tareaRepository.findById(id).isEmpty())
            throw new TareaException("La tarea no existe");
        tarea tarea1 = tareaRepository.findById(id).orElseThrow();
        if(tarea.getNombre().isEmpty())
            throw new TareaException("El nombre no puede estar vacio");
        tarea1.setNombre(tarea.getNombre());
        if(tarea.getDescripcion().isEmpty())
            throw new TareaException("La descripcion no puede estar vacia");
        tarea1.setDescripcion(tarea.getDescripcion());
        if(tarea.getFecha_inicio() == null)
            throw new TareaException("La fecha de inicio no puede estar vacia");
        tarea1.setFecha_inicio(tarea.getFecha_inicio());
        if(tarea.getFecha_fin() == null)
            throw new TareaException("La fecha de fin no puede estar vacia");
        tarea1.setFecha_fin(tarea.getFecha_fin());
        if(tarea.getEstado().isEmpty())
            throw new TareaException("El estado no puede estar vacio");
        tarea1.setEstado(tarea.getEstado());
        if(tarea.getFecha_inicio().after(tarea.getFecha_fin()))
            throw new TareaException("La fecha de inicio no puede ser mayor a la fecha de fin");
        tareaRepository.save(tarea1);
        return "Tarea actualizada";
    }

    @GetMapping(value = "/tarea/{id}")
    public tarea getTareaById(@PathVariable long id) {
        if(tareaRepository.findById(id).isEmpty())
            throw new TareaException("La tarea no existe");
        return tareaRepository.findById(id).orElseThrow();
    }

    @DeleteMapping(value = "/tarea/eliminar/{id}")
    public String deleteTarea(@PathVariable long id) {
        if(tareaRepository.findById(id).isEmpty())
            throw new TareaException("La tarea no existe");
        tareaRepository.deleteById(id);
        return "Tarea eliminada";
    }
}
