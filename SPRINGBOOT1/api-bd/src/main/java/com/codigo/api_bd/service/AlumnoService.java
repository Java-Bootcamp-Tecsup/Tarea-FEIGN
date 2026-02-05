package com.codigo.api_bd.service;

import com.codigo.api_bd.dto.AlumnoCreateRequest;
import com.codigo.api_bd.dto.AlumnoResponse;
import com.codigo.api_bd.model.Alumno;
import com.codigo.api_bd.repository.AlumnoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AlumnoService {
    private final AlumnoRepository repository;

    public AlumnoService(AlumnoRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public AlumnoResponse crear(AlumnoCreateRequest request){
        Alumno a = new Alumno(request.nombre(),request.edad());
        Alumno saved = repository.save(a);

        return new AlumnoResponse(saved.getId(),saved.getNombre(),saved.getEdad());
    }
}
