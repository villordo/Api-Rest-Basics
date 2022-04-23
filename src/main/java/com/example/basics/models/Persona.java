package com.example.basics.models;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data                   //DATA ME TRAE UN CONSTRUCTOR POR DEFAULT, TOSTRING, GETTER Y SETTER
@NoArgsConstructor      //NOARGSCONSTRUCTOR ME TRAE UN CONSTRUCTOR VACIO
@Entity                 //PERSISTENCIA
@Table(name="persons")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="age")
    private Integer age;
    @Column(name="alive")
    private boolean alive;

}

