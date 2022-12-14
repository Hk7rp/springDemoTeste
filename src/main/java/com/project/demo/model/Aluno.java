package com.project.demo.model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Data
@AllArgsConstructor

public class Aluno {
    
    @Id
    private Long matricula;
    private String nome;
    private String telefone;
    private String email;
    private Instant dataCadastro;
    

}
