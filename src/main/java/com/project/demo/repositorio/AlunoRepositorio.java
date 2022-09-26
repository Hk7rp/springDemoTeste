package com.project.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.demo.model.Aluno;

public interface AlunoRepositorio extends JpaRepository<Aluno, Long>{

    
}