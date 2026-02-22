package com.codigo.apis_externas.controller;

import com.codigo.apis_externas.model.ReniecCambio;
import com.codigo.apis_externas.model.ReniecPerson;
import com.codigo.apis_externas.service.ReniecFeignService;
import jakarta.validation.constraints.Pattern;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reniec")
public class ReniecController {
    private final ReniecFeignService reniecFeignService;

    public ReniecController(ReniecFeignService reniecFeignService){
        this.reniecFeignService = reniecFeignService;
    }

    @GetMapping("/feign/{dni}")
    public ReniecPerson feign(@PathVariable @Pattern(regexp = "\\d{8}") String dni){
        return reniecFeignService.consultarYGuardar(dni);
    }

    @GetMapping("/feign/cambio/{currency}")
    public ReniecCambio feignCambio(@PathVariable String currency){
        return reniecFeignService.consultarYGuardarCambio(currency);
    }

}
