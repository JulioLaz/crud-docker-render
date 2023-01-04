package com.nuevoCrud.crud_db_julio.service;

import com.nuevoCrud.crud_db_julio.model.Persona;
import java.util.List;

public interface IPersonaService {
   public List<Persona> verPersonas();
   public void crearPersona (Persona per);
   public void borrarPersona (Long id);
   public Persona buscarPersona (Long id);
   public void editarPersona(Long id);
   public void verPersona(Long id);
    
   } 

