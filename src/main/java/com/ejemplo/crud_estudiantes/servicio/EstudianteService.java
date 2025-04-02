package com.ejemplo.crud_estudiantes.servicio;

import com.ejemplo.crud_estudiantes.modelo.Estudiante;
import com.ejemplo.crud_estudiantes.repositorio.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    public List<Estudiante> listarEstudiantes() {
        return estudianteRepository.findAll();
    }

    public Estudiante obtenerEstudiantePorId(Long id) {
        return estudianteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Estudiante no encontrado"));
    }

    public Estudiante guardarEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    public Estudiante actualizarEstudiante(Long id, Estudiante estudianteDetalles) {
        Estudiante estudiante = obtenerEstudiantePorId(id);
        estudiante.setNombre(estudianteDetalles.getNombre());
        estudiante.setEdad(estudianteDetalles.getEdad());
        return estudianteRepository.save(estudiante);
    }

    public void eliminarEstudiante(Long id) {
        estudianteRepository.deleteById(id);
    }
}
