package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Gato extends Mascota {

    private int idGato;
    private static int contador;
    private String raza;
    public static List<Gato> gatos = new ArrayList<>();

    public Gato(int edad, String especie, String nombre, String raza) {
        super(edad, especie, nombre);
        ++contador;
        idGato = contador;
    }

    public void salta(String name){
        System.out.println("El gato: " + name + " esta saltando");
    }
    @Override
    public void comer(String name) {
        System.out.println("El gato: " +name + " esta comiendo");
    }

    @Override
    public void hacerSonido(String name) {
        System.out.println("El gato: " + name + " esta Maullando");
    }

    public String getRaza() {
        return raza;
    }

    public int getIdGato() {
        return idGato;
    }

    @Override
    public String toString() {
        return "Gato{" + "idGato=" + idGato + ", raza=" + raza + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.idGato;
        hash = 59 * hash + Objects.hashCode(this.raza);
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
        final Gato other = (Gato) obj;
        if (this.idGato != other.idGato) {
            return false;
        }
        return Objects.equals(this.raza, other.raza);
    }
}
