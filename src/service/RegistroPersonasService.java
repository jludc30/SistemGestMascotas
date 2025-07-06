package service;


import model.Persona;
import model.PersonaMascota;

public class RegistroPersonasService {
    public void mostrarPersonas(){
        
        for(Persona persona : PersonaMascota.personas){
            System.out.println("************************************");
            System.out.println(persona.toString());
        }
        
    } 
}
