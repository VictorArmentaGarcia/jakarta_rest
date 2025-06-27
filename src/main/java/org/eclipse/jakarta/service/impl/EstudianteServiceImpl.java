package org.eclipse.jakarta.service.impl;

import org.eclipse.jakarta.model.Estudiante;
import org.eclipse.jakarta.service.EstudianteService;

import java.util.ArrayList;
import java.util.List;

public class EstudianteServiceImpl implements EstudianteService {

    private static List<Estudiante> listEstudiante = new ArrayList<Estudiante>();

    @Override
    public Estudiante save(Estudiante estudiante) {
        listEstudiante.add(estudiante);
        return estudiante;
    }

    @Override
    public List<Estudiante> get() {
        return listEstudiante;
    }

    @Override
    public Estudiante get(int id) {
        return listEstudiante.stream().filter(e->e.getId() == id).findAny().orElse(new Estudiante());
    }

    @Override
    public boolean deleteById(int id) {
        listEstudiante.removeIf(e->e.getId() == id);
        return true;
    }
}
