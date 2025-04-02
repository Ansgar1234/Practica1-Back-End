package com.ejemplo.crud_estudiantes.repositorio;

import com.ejemplo.crud_estudiantes.modelo.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
}
