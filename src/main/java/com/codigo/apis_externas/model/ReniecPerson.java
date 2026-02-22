package com.codigo.apis_externas.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "reniec_person")
public class ReniecPerson{
    // En Jvaa si defines la variable como camelCase, al momento de crear la tabla
    // JPA crea las columnas con -  eVillarroel -> e_villarroel
    // Siempre ocurre, es un estandar
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 8)
    private String documentNumber;

    @Column(nullable = false)
    private String fullName;

    private String firstName;
    private String firstLastName;
    private String secondLastName;

    @Column(nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public void setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }
}
