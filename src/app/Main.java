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
            System.out.println("************************************************");
            System.out.println("************************************************");
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
            sc.nextLine();

            switch (opcion) {
                case 1:
                    Persona persona;
                    System.out.println("************************************************");
                    System.out.println("                  Registrar persona             ");
                    System.out.println("************************************************");

                    //We ask for person data
                    System.out.println("Por favor ingresa el nombre de la persona: ");
                    String nombre = sc.nextLine();

                    System.out.println("Por favor ingrese su apellido: ");
                    String apellido = sc.nextLine();

                    System.out.println("Ingrese su edad: ");
                    int edad = sc.nextInt();

                    persona = new Persona(nombre, apellido, edad); //Created a person with its initial fields
                    personasMascotas.personas.add(persona); //added to the list person

                    if (!personasMascotas.personas.contains(persona)) { //If person is not in the list
                        System.out.println("La persona no se pudo registrar, intente mas tarde"); //The person has not created
                    } else {
                        //The person was created and succesfully save
                        System.out.println("La persona: " + persona.getNombre() + " " + persona.getApellido() + ", ha sido creada");
                    }
                    break;

                case 2:
                    if (PersonaMascota.personas.isEmpty()) {
                        System.out.println("No hay personas registradas en el sistema, primero registra a una persona");
                    } else {
                        //We dont enter to this code block is the list is empty
                        System.out.println("************************************************");
                        System.out.println("       Mostrar datos de una persona             ");
                        System.out.println("************************************************");
                        System.out.println("1.-Buscar por ID");
                        System.out.println("2.-Buscar por nombre y apellido");
                        int opcionBuscar = sc.nextInt();
                        sc.nextLine();
                        switch (opcionBuscar) {
                            case 1:
                                System.out.println("************************************************");
                                System.out.println("       Mostrar datos de una persona             ");
                                System.out.println("************************************************");
                                System.out.println("Por favor Ingrese el ID de la persona");
                                int idPersona = sc.nextInt(); //We ask for the id
                                String dataPerson = registroPersona.mostrarDatos(idPersona); //Capture data person if it exist
                                System.out.println(dataPerson); //Then we show it
                                break;
                            case 2:
                                System.out.println("************************************************");
                                System.out.println("       Mostrar datos de una persona             ");
                                System.out.println("************************************************");
                                //We ask for data person
                                System.out.println("Ingrese el nombre de la persona: ");
                                String nombre1 = sc.nextLine();
                                System.out.println("Ingrese el apellido: ");
                                String apellido1 = sc.nextLine();
                                //we fill it in dataPerson1
                                String dataPerson1 = registroPersona.mostrarDatos(nombre1, apellido1);
                                System.out.println(dataPerson1); //Then we show it
                                break;
                            default:
                                System.out.println("La opcion que ingresaste no existe");
                        }
                    }
                    break;
                case 3:
                    System.out.println("************************************************");
                    System.out.println("       Modificar datos de una persona           ");
                    System.out.println("************************************************");
                    break;
                case 4:
                    if (PersonaMascota.personas.isEmpty()) {
                        System.out.println("No hay personas registradas en el sistema");
                    } else {
                        //We dont enter to this code block is the list is empty
                        System.out.println("************************************************");
                        System.out.println("       Eliminar una persona             ");
                        System.out.println("************************************************");
                        System.out.println("1.-Eliminar por ID");
                        System.out.println("2.-Eliminar por nombre y apellido");
                        int opcionBuscar = sc.nextInt();
                        sc.nextLine();
                        switch (opcionBuscar) {
                            case 1:
                                System.out.println("************************************************");
                                System.out.println("       Eliminar datos de una persona por id             ");
                                System.out.println("************************************************");
                                System.out.println("Por favor Ingrese el ID de la persona");
                                int idPersona = sc.nextInt(); //We ask for the id
                                registroPersona.mostrarDatos(idPersona); //Capture data person if it exist
                                
                                break;
                            case 2:
                                System.out.println("************************************************");
                                System.out.println("       Mostrar datos de una persona             ");
                                System.out.println("************************************************");
                                //We ask for data person
                                System.out.println("Ingrese el nombre de la persona: ");
                                String nombre1 = sc.nextLine();
                                System.out.println("Ingrese el apellido: ");
                                String apellido1 = sc.nextLine();
                                //we fill it in dataPerson1
                                String dataPerson1 = registroPersona.mostrarDatos(nombre1, apellido1);
                                System.out.println(dataPerson1); //Then we show it
                                break;
                            default:
                                System.out.println("La opcion que ingresaste no existe");
                        }
                    }
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
                    registroPersona.mostrarPersonas(); //Just show all the people in the list
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
