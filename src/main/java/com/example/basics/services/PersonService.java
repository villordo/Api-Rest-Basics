package com.example.basics.services;
import com.example.basics.models.Person;
import com.example.basics.models.dtos.PersonDto;
import com.example.basics.repositories.PersonRepository;
import org.aspectj.weaver.patterns.PerObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonService {

    @Autowired                      //INYECTA LA CLASE
    private PersonRepository personRepository;

    public List<Person> getAllPerson(){
        return personRepository.findAll();
    }

    public Person add(PersonDto personDto) {

        Person newPerson = new Person();        //Mapeo mi PersonDto a un Person
        newPerson.setName(personDto.getName()); // para asi poder agregarlo a la bdd
        newPerson.setAge(personDto.getAge());
        newPerson.setAlive(personDto.isAlive());

        Person added = personRepository.save(newPerson); //No podria almacenar un PersonDto,
        return added;                                   // ya que este repositorio solo trabaja con la clase Person
    }
}
