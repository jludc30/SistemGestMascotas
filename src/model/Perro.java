package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Perro extends Mascota{
    
    private int idPerro;
    private static int contador;
    private String raza;
    public static List<Perro> perros = new ArrayList<>();

    public Perro(int edad, String especie, String nombre, String raza){
        super(edad, especie, nombre);
        
        ++Perro.contador;
        
        
        this.raza = raza;
        this.idPerro = Perro.contador;
        
        Perro.perros.add(this);
    }
    
    public void jugar(){
        System.out.println(this.getNombre()+"Esta jugando");
    }

    @Override
    public void comer(String name) {
        System.out.println(name+" esta comiendo");
    }

    @Override
    public void hacerSonido(String name) {
        System.out.println(name+" esta ladrando");
    }

    public int getIdPerro() {
        return idPerro;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", Perro{");
        sb.append("idPerro=").append(idPerro);
        sb.append(", raza=").append(raza);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.idPerro;
        hash = 79 * hash + Objects.hashCode(this.raza);
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
        final Perro other = (Perro) obj;
        if (this.idPerro != other.idPerro) {
            return false;
        }
        return Objects.equals(this.raza, other.raza);
    }
}
