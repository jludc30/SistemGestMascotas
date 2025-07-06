package app;
//Clase principal

import java.util.Scanner;
import model.Persona;
import model.PersonaMascota;
import service.RegistroPersonasService;

//import java.util.List;
//import java.util.Map;
//import model.Mascota;
//import model.Perro;
//import model.Persona;
//import model.PersonaMascota;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonaMascota personasMascotas = new PersonaMascota();
        RegistroPersonasService registroPersona = new RegistroPersonasService();
        
        
        int repetir = 0;
        do {
            System.out.println("Sistema de gestion para mascotas");
            System.out.println("Que desea hacer?");

            System.out.println("************************************************");
            System.out.println("************************************************");
            System.out.println("1.-Registrar a una persona");
            System.out.println("2.-Mostrar datos de persona");
            System.out.println("3.-Modificar datos de a una persona");
            System.out.println("4.-Eliminar a una persona");
            System.out.println("5.-Mostrar las mascotas de una persona");
            System.out.println("6.-Mostrar todas las personas");
            System.out.println("7.-Crear una mascotas");
            System.out.println("8.-Mostrar los datos de una mascota");
            System.out.println("9.-Modificar datos de una mascotas");
            System.out.println("10.-Eliminar una mascotas");
            System.out.println("11.-Mostrar todas las mascotas");
            System.out.println("12.-Mostrar todas las mascotas por especie");
            System.out.println("13.-Mostrar todas las personas con sus mascotas");
            System.out.println("14.-Salir");

            System.out.println("************************************************");
            System.out.println("************************************************");

            System.out.println("Por favor seleccione una opcion");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    Persona persona;
                    System.out.println("************************************************");
                    System.out.println("                  Registrar persona             ");
                    System.out.println("************************************************");

                    System.out.println("Por favor ingresa el nombre de la persona: ");
                    String nombre = sc.nextLine();

                    System.out.println("Por favor ingrese su apellido: ");
                    String apellido = sc.nextLine();

                    System.out.println("Ingrese su edad: ");
                    int edad = sc.nextInt();

                    persona = new Persona(nombre, apellido, edad);
                    personasMascotas.personas.add(persona);

                    if (!personasMascotas.personas.contains(persona)) {
                        System.out.println("La persona no se pudo registrar, intente mas tarde");
                    } else {
                        System.out.println("La persona: "+persona.getNombre()+" "+persona.getApellido()+", ha sido creada");
                    }
                    break;

                case 2:
                    System.out.println("************************************************");
                    System.out.println("       Mostrar datos de una persona             ");
                    System.out.println("************************************************");
                    break;
                case 3:
                    System.out.println("************************************************");
                    System.out.println("       Modificar datos de una persona           ");
                    System.out.println("************************************************");
                    break;
                case 4:
                    System.out.println("************************************************");
                    System.out.println("               Eliminar una persona             ");
                    System.out.println("************************************************");
                    break;
                case 5:
                    System.out.println("************************************************");
                    System.out.println("          Mostrar mascotas de una persona       ");
                    System.out.println("************************************************");
                    break;
                case 6:
                    System.out.println("************************************************");
                    System.out.println("               Mostrar todas las personas       ");
                    System.out.println("************************************************");
                    registroPersona.mostrarPersonas();
                    break;
                case 7:
                    System.out.println("************************************************");
                    System.out.println("               Crear una mascota                ");
                    System.out.println("************************************************");
                    break;
                case 8:
                    System.out.println("************************************************");
                    System.out.println("         Mostrar los datos de una mascota       ");
                    System.out.println("************************************************");
                    break;
                case 9:
                    System.out.println("************************************************");
                    System.out.println("          Modificar datos de una mascota        ");
                    System.out.println("************************************************");
                    break;
                case 10:
                    System.out.println("************************************************");
                    System.out.println("               Eliminar una mascota             ");
                    System.out.println("************************************************");
                    break;
                case 11:
                    System.out.println("************************************************");
                    System.out.println("           Mostrar todas las mascotas           ");
                    System.out.println("************************************************");
                    break;
                case 12:
                    System.out.println("************************************************");
                    System.out.println("     Mostrar todas las mascotas por especie     ");
                    System.out.println("************************************************");
                    break;
                case 13:
                    System.out.println("************************************************");
                    System.out.println("   Mostrar todas las personas con su mascotas   ");
                    System.out.println("************************************************");
                    break;
                case 14:
                    System.out.println("************************************************");
                    System.out.println("                  Adios                         ");
                    System.out.println("************************************************");
                    repetir = 1;
                    break;
                default:
                    System.out.println("************************************************");
                    System.out.println("************************************************");
                    System.out.println("Esta opcion no es valida, escoga otra opcion");
                    break;
            }
        } while (repetir == 0);

//        PersonaMascota listaPersonaMascotas = new PersonaMascota();
//        Persona persona1 = new Persona("Jose Luis Diaz");
//        Mascota perro1 = new Perro(8, "Perro", "Foxy", "Chihuahua");
//        persona1.misMascotas.add(perro1);
//        Mascota perro2 = new Perro(12, "Perro", "Chiquis", "Fox Terrier");
//        persona1.misMascotas.add(perro2);
//        Mascota perro3 = new Perro(2, "Perro", "Coffee", "Jack Russell");
//        persona1.misMascotas.add(perro3);
//        
//        
//
//        System.out.println("Mascotas de " + persona1.getNombre() + ": ");
//        for (Mascota mascota : persona1.misMascotas) {
//            System.out.println(mascota.toString());
//        }
//
//        Persona persona2 = new Persona("Luisa Rosas Esquivel");
//        Mascota perro4 = new Perro(6, "Perro", "Maya", "Terier");
//        persona2.misMascotas.add(perro4);
//
//        
//        
//        System.out.println("Mascotas de " + persona2.getNombre() + ": ");
//        for (Mascota mascota : persona2.misMascotas) {
//            System.out.println(mascota.toString());
//        }
//
//        listaPersonaMascotas.permas.put(persona1, persona1.misMascotas);
//        listaPersonaMascotas.permas.put(persona2, persona2.misMascotas);
//
//
//        System.out.println("*******************************************************************");
//        for (Map.Entry<Persona, List<Mascota>> entry : listaPersonaMascotas.permas.entrySet()) {
//            Persona persona = entry.getKey();
//            List<Mascota> mascotas = entry.getValue();
//
//            System.out.println("Mascotas de: " + persona.getNombre());
//            for (Mascota mascota : mascotas) {
//                System.out.println("- " + mascota);
//            }
//        }
    }
}
