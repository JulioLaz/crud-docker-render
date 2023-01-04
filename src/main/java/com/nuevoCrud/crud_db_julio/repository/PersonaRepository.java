package com.nuevoCrud.crud_db_julio.repository;

import com.nuevoCrud.crud_db_julio.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PersonaRepository extends JpaRepository<Persona, Long>{

    public void save(Long id);
    
}
