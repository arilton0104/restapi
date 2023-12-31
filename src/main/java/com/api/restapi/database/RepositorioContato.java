package com.api.restapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.restapi.entidade.Contato;

public interface RepositorioContato extends JpaRepository<Contato,Long>{
    
}
