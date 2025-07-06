package app;
//Clase principal

import java.util.List;
import java.util.Map;
import model.Mascota;
import model.Perro;
import model.Persona;
import model.PersonaMascota;

public class Main {

    public static void main(String[] args) {
        PersonaMascota listaPersonaMascotas = new PersonaMascota();
        Persona persona1 = new Persona("Jose Luis Diaz");
        Mascota perro1 = new Perro(8, "Perro", "Foxy", "Chihuahua");
        persona1.misMascotas.add(perro1);
        Mascota perro2 = new Perro(12, "Perro", "Chiquis", "Fox Terrier");
        persona1.misMascotas.add(perro2);
        Mascota perro3 = new Perro(2, "Perro", "Coffee", "Jack Russell");
        persona1.misMascotas.add(perro3);
        
        

        System.out.println("Mascotas de " + persona1.getNombre() + ": ");
        for (Mascota mascota : persona1.misMascotas) {
            System.out.println(mascota.toString());
        }

        Persona persona2 = new Persona("Luisa Rosas Esquivel");
        Mascota perro4 = new Perro(6, "Perro", "Maya", "Terier");
        persona2.misMascotas.add(perro4);

        
        
        System.out.println("Mascotas de " + persona2.getNombre() + ": ");
        for (Mascota mascota : persona2.misMascotas) {
            System.out.println(mascota.toString());
        }

        listaPersonaMascotas.permas.put(persona1, persona1.misMascotas);
        listaPersonaMascotas.permas.put(persona2, persona2.misMascotas);


        System.out.println("*******************************************************************");
        for (Map.Entry<Persona, List<Mascota>> entry : listaPersonaMascotas.permas.entrySet()) {
            Persona persona = entry.getKey();
            List<Mascota> mascotas = entry.getValue();

            System.out.println("Mascotas de: " + persona.getNombre());
            for (Mascota mascota : mascotas) {
                System.out.println("- " + mascota);
            }
        }
    }
}
