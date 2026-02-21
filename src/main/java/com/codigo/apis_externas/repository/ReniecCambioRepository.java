package com.codigo.apis_externas.repository;

import com.codigo.apis_externas.model.ReniecCambio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReniecCambioRepository extends JpaRepository<ReniecCambio, Long> {
    Optional<ReniecCambio> findByCurrency(String currency);
}
