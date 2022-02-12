package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository // Transações de base de dados

// PQ foi extendido o JpaRepository?!.. Por que ele já possui muitos metodos prontos para serem utilizados para
// transações com banco de dados. como por exemplo, buscar uma listagem de determinado recurso,( Buscar, Atualizar,
// Salvar e Deletar esses recusros)  ele já traz então essa simplificação desses metódos.
// Jpa é usado para ter acesso aos metodos já prontos.
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {



    /*boolean existByLicensePlateCar(String licensePlateCar);
    boolean existByParkingSpotNumber(String pakingSpotNumber);
    boolean existByApartmentAndBlock(String apartment, String block);

*/


    }
