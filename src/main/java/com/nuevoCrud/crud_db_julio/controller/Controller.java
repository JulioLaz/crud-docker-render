package com.nuevoCrud.crud_db_julio.controller;

import com.nuevoCrud.crud_db_julio.model.Persona;
import com.nuevoCrud.crud_db_julio.service.IPersonaService;
//import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    private IPersonaService persoServ;
    
    @PostMapping ("/new/persona")
    public String agregarPersona (@RequestBody Persona pers){
        persoServ.crearPersona(pers);
                return "La persona fue creada correctamente";
    }
    
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
    }
//    @GetMapping ("/ver/{id}")
//     @ResponseBody
//    public Persona verPersona(Long id){
//        return persoServ.verPersona(id);
//    }
   
    
    @DeleteMapping ("/delete/{id}")
    public String borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
        return "La persona fue eliminada correctamente";
    }
    @PutMapping ("/edit/{id}")
    public Persona editarPersona(@PathVariable Long id,
                                  @RequestParam ("nombre") String nuevoNombre,
                                  @RequestParam ("apellido")String nuevoApellido){
        Persona perso= persoServ.buscarPersona(id);
        perso.setNombre(nuevoNombre);
        perso.setApellido(nuevoApellido);
        persoServ.crearPersona(perso);
        return perso;
                
    }    
    
}