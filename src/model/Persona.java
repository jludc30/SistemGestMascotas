package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Persona {

    private static int contador = 0;
    private int id;
    private String nombre;
    public List<Mascota> misMascotas = new ArrayList<>();

    private Persona(){
        ++this.contador;
        this.id = this.contador;
    }
    
    public Persona(String nombre){
        this();
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
    
    
}
