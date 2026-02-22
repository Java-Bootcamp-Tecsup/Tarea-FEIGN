package com.codigo.apis_externas.repository;

import com.codigo.apis_externas.model.ReniecPerson;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReniecPersonRepository extends JpaRepository<ReniecPerson, Long> {
    // Si o si el parametro que mandas tiene que estar en tu modelo
    Optional<ReniecPerson> findByDocumentNumber(String documentNumber);
}
