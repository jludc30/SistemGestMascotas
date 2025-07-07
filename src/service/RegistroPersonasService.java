package service;

import model.Persona;
import model.PersonaMascota;

public class RegistroPersonasService {

    /**
     *
     * @param idPersona field to find this person by id and show its data
     * @return data person or it does not exist
     */
    public String mostrarDatos(int idPersona) {
        for (Persona persona : PersonaMascota.personas) {
            if (persona.getId() == idPersona) {
                return persona.toString();
            }
        }
        return "la persona no fue encontrada en la lista";
    }

    /**
     *
     * @param nombre de la persona
     * @param apellido de la persona
     * @return los datos de la persona o decir que no esta en la lista
     */
    public String mostrarDatos(String nombre, String apellido) {
        for (Persona persona : PersonaMascota.personas) {
            if ((persona.getNombre().equals(nombre)) && (persona.getApellido().equals(apellido))) {
                return persona.toString();
            }
        }
        return "la persona no fue encontrada en la lista";
    }

    /**
     * 
     * @param idPersona 
     */
    public void eliminarPersona(int idPersona) {
        for (Persona persona : PersonaMascota.personas) {
            if (persona.getId() == idPersona) {
                PersonaMascota.personas.remove(persona);
            }
        }
    }
    /**
     * 
     * @param nombre
     * @param apellido 
     */
    public void eliminarPersona(String nombre, String apellido) {

    }

    /**
     * Method that just show every field on every person
     */
    public void mostrarPersonas() {

        for (Persona persona : PersonaMascota.personas) {
            System.out.println("************************************");
            System.out.println(persona.toString());
        }

    }

}
