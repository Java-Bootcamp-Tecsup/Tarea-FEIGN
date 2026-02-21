package com.codigo.apis_externas.service;

import com.codigo.apis_externas.clients.DecolectaReniecFeignClient;
import com.codigo.apis_externas.dto.ReniecDniResponse;
import com.codigo.apis_externas.mapper.ReniecMapper;
import com.codigo.apis_externas.model.ReniecPerson;
import com.codigo.apis_externas.repository.ReniecPersonRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ReniecFeignService{
    private final DecolectaReniecFeignClient feignClient;
    private final ReniecPersonRepository personRepository;

    @Value("${decoleta.token}") // Se usa para inyectar un valor de mis properties
    private String token;

    public ReniecFeignService( DecolectaReniecFeignClient feignClient,
                               ReniecPersonRepository personRepository){
        this.feignClient = feignClient;
        this.personRepository = personRepository;
    }

    // Se usa para la integridad de datos
    @Transactional // Si algo falla en una transaccion, se hace rollback a todo
    public ReniecPerson consultarYGuardar(String dni){
        return personRepository.findByDocumentNumber(dni)
                .orElseGet(() -> {
                    String auth = "Bearer " + token;
                    ReniecDniResponse dto = feignClient.consultarDni(dni,auth);
                    ReniecPerson entity = ReniecMapper.toEntity(dto);
                    return personRepository.save(entity);
                });
    }

}
