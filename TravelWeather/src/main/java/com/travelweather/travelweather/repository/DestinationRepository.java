package com.travelweather.travelweather.repository;

import com.travelweather.travelweather.model.Destination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Repository
public interface DestinationRepository extends JpaRepository<Destination,Integer> {

}


