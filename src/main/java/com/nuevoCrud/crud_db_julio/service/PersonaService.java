package com.nuevoCrud.crud_db_julio.service;

import com.nuevoCrud.crud_db_julio.model.Persona;
import com.nuevoCrud.crud_db_julio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    public PersonaRepository persoRepo;
    @Override
    public List<Persona> verPersonas() {
      return  persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
               persoRepo.save(per);
    }

     @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }

//    @Override
//    public Persona verPersona(Long id) {
//        return persoRepo.findById(id).orElse(null);
//    }
    
    @Override
    public void editarPersona(Long id) {
        persoRepo.save(id);
    }

    @Override
    public void verPersona(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
