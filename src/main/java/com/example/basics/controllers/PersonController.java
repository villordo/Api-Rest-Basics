package com.example.basics.controllers;
import com.example.basics.models.Person;
import com.example.basics.models.dtos.PersonDto;
import com.example.basics.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")         //URL PRINCIPAL DE LA CLASE
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService ps) {
        this.personService = ps;
    }

    @GetMapping("/")
    public ResponseEntity getAllPersons(){
        List<Person> lista = personService.getAllPerson();
        if(lista.isEmpty()){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(lista);
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(lista);
        }
    }

    /**
     * HTTP-VERB: POST
     * COMPLETE-URL: /persons/
     * Endpoint para agregar un nuevo registro a la tabla persons
     * @param personDto: Su unica funcion es transportar los datos recibidos por la request (peticion)
     *                 TODO: buscar definicion de DTO (Data Transfer Object)
     * @return:
     */
    @PostMapping("/")
    public ResponseEntity addNewPerson(PersonDto personDto){
        Person personAdded = personService.add(personDto);
        return ResponseEntity.ok(personAdded); //ok = 200 (Http-Response)
    }

}
