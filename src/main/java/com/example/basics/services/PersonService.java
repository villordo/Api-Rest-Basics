package com.example.basics.services;
import com.example.basics.models.Persona;
import com.example.basics.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonService {

    @Autowired                      //INYECTA LA CLASE, Y LA INSTANCIA
    private PersonRepository pr;

    public List<Persona> getAllPerson(){
        return pr.findAll();
    }

}
