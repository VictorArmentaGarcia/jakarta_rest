package org.eclipse.jakarta.service;

import org.eclipse.jakarta.model.Estudiante;

import java.util.List;

public interface EstudianteService {

    Estudiante save(Estudiante estudiante);

    List<Estudiante> get();

    Estudiante get(String id);

}
