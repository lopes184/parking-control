package com.api.parkingcontrol.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity // Identifica que esta classe é a entidade
@Table(name = "TB_PARKING_SPOT") // Cria a tabela
public class ParkingSpotModel implements Serializable {
    private static final long serialVersionVID = 1L;

    @Id // Identificador da entidade
    @GeneratedValue(strategy = GenerationType.AUTO) // O ID irá ser gerado automaticamente
    private UUID id;
    @Column(nullable = false, unique = true, length = 10) //(Não poderá ser nula, será do tipo única, Caracteres limitados a 10)
    private String pakingSpotNumber; // Mistura de letras e números, podemos usar o (STRING)
    @Column(nullable = false, unique = true, length = 7)
    private String licensePlateCar;
    @Column(nullable = false, length = 70) // Para passar as restições que vão sendo criadas quando for gerada cada uma dessas colunas
    // na base de dados. Utilizando a Anotação "@Column" para faze o mapeamento campo por campo.
    private String brandCar;
    @Column(nullable = false, length = 70)
    private String modelCar;
    @Column(nullable = false, length = 70)
    private String colorCar;
    @Column(nullable = false)
    private LocalDateTime registrationDate; // Imprime a data do registro
    @Column(nullable = false, length = 130)
    private String responsibleName;
    @Column(nullable = false, length = 30)
    private String apartment;
    @Column(nullable = false, length = 30)
    private String block;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPakingSpotNumber() {
        return pakingSpotNumber;
    }

    public void setPakingSpotNumber(String pakingSpotNumber) {
        this.pakingSpotNumber = pakingSpotNumber;
    }

    public String getLicensePlateCar() {
        return licensePlateCar;
    }

    public void setLicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
}


