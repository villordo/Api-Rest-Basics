package com.example.basics.repositories;
import com.example.basics.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Persona,Integer> {

    

}
