package com.api.parkingcontrol.services;


import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ParkingSpotService {


    @Autowired  //  Esta dizendo au spring que em determinados momentos ele terá que injetar
                // dependencias Ex : "parkingSpotRepository" dentro do  "ParkingSpotService".
                // Esta anotação serve para este ponto de injeção e avisar ao SPRING que ali irá
                // precisar de ser injetado esses dependencias
    ParkingSpotRepository  parkingSpotRepository;


//Se não fosse usado a anotação @AUTOWIRED para a criação desse ponto de injeção. Teria que ser criado o metodo via construtos

// final ParkingSpotRepository  parkingSpotRepository;
//  public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
//        this.parkingSpotRepository = parkingSpotRepository;
//    }


    @Transactional // Metodos construtivos e destrutivos é interessantes por essa anotação. quando se tem relacionamentos
    // que venha ter deleção em cascata ou salvamento em cascata. caso de algo de errado ele garante que tudo volte ao normal
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingSpotRepository.save(parkingSpotModel);
    }

    public List<ParkingSpotModel> findAll() {
        return parkingSpotRepository.findAll();
    }

    /*public Optional<ParkingSpotModel> findById(UUID id){
        return parkingSpotRepository.findById(id);

    }*/




    public Optional<ParkingSpotModel> findById(UUID id) {
        return parkingSpotRepository.findById(id);
    }


    public void delete(ParkingSpotModel parkingSpotModel) {
        parkingSpotRepository.delete(parkingSpotModel);
    }

   /* public boolean existByLicensePlateCar(String licensePlateCar) {
        return parkingSpotRepository.existByLicensePlateCar(licensePlateCar);
    }

    public boolean existByParkingSpotNumber(String pakingSpotNumber) {
        return parkingSpotRepository.existByParkingSpotNumber(pakingSpotNumber);
    }


    public boolean existByApartmentAndBlock(String apartment, String block) {
        return parkingSpotRepository.existByApartmentAndBlock(apartment, block);
    }*/
}