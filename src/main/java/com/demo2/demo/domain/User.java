package com.demo2.demo.domain;

import org.springframework.stereotype.Controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="mytable02")
@AllArgsConstructor
@Getter
@Setter
public class User {
   
    @Id
    private String user;
    private String passswor;
    

}
