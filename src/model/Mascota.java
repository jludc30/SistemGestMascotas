package model;

import java.util.Objects;

public abstract class Mascota {

    private int idMascota;
    private static int contador;
    private int edad;
    private String especie;
    private String nombre;

    private Mascota() {
        ++contador;
        this.idMascota = contador;
    }

    public Mascota(int edad, String especie, String nombre) {
        this();
        this.edad = edad;
        this.especie = especie;
        this.nombre = nombre;
    }

    public abstract void comer(String name);

    public abstract void hacerSonido(String name);

    public void dorimir() {
        System.out.println("Esta durmiendo");
    }

    public void correr() {
        System.out.println("Esta jugando");
    }

    public int getEdad() {
        return edad;
    }

    public String getEspecie() {
        return especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Mascota{" + "edad=" + edad + ", especie=" + especie + ", nombre=" + nombre + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.edad;
        hash = 47 * hash + Objects.hashCode(this.especie);
        hash = 47 * hash + Objects.hashCode(this.nombre);
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
        final Mascota other = (Mascota) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.especie, other.especie)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
}
