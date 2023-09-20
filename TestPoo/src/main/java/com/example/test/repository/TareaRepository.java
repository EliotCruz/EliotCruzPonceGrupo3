package com.example.test.repository;

import com.example.test.models.tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepository extends JpaRepository<tarea, Long> {
}
