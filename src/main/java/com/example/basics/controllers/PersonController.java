package com.example.basics.controllers;
import com.example.basics.models.Persona;
import com.example.basics.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")         //URL PRINCIPAL DE LA CLASE
public class PersonController {
    private PersonService ps;

    @Autowired
    public PersonController(PersonService ps) {
        this.ps = ps;
    }

    @GetMapping("/")
    public ResponseEntity getAllPersons(){
        List<Persona> lista = ps.getAllPerson();
        if(lista.isEmpty()){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(lista);
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(lista);
        }
    }

}
