package com.codigo.api_bd.controller;

import com.codigo.api_bd.dto.AlumnoCreateRequest;
import com.codigo.api_bd.dto.AlumnoResponse;
import com.codigo.api_bd.dto.AlumnoUpdateRequest;
import com.codigo.api_bd.service.AlumnoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/alumnos")
public class AlumnoController {
    private final AlumnoService alumnoService;

    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AlumnoResponse crear(@Valid @RequestBody AlumnoCreateRequest request){
        return alumnoService.crear(request);
    }

    @GetMapping
    public List<AlumnoResponse> listar(){
        return alumnoService.listar();
    }

    /*  /api/v1/alumnos/123   */
    /*@GetMapping("/{id}")
    public AlumnoResponse obtener(@PathVariable UUID id){
        return alumnoService.obtener(id);
    }*/
    /*@GetMapping("/obtener")
    public AlumnoResponse obtener(@RequestParam(defaultValue = "113269fa-abd8-4cdd-9979-ccb1a1bb16ea")
                                      UUID id){
        return alumnoService.obtener(id);
    }*/

    @GetMapping("/obtener")
    public AlumnoResponse obtener(@RequestHeader("X-ALUMNO-ID") UUID id){
        return alumnoService.obtener(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable UUID id){
        alumnoService.eliminar(id);
    }

    @PutMapping("/{id}")
    public AlumnoResponse actualizar(@PathVariable UUID id,
                                     @Valid @RequestBody AlumnoUpdateRequest request){
        return alumnoService.actualizar(id,request);
    }
    //CONSULTAR
    //LISTAR
    //ACTUALZIAR
    //ELIMINAR

    //http://localhost:8082/api/v1/alumnos/113269fa-abd8-4cdd-9979-ccb1a1bb16ea
    //http://localhost:8082/api/v1/alumnos/obtener?id=113269fa-abd8-4cdd-9979-ccb1a1bb16ea
}
