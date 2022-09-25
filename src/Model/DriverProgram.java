package Model;

import Functions.Choosething;
import Functions.User;

import java.util.Scanner;

/**
 * Esta clase es la principal, la unica que interactua con el usuario
 * @author Sebastian
 * @version 24/09/2022
 */

public class DriverProgram {
    public static User person;
    public static Choosething choose;
    static Scanner scanner= new Scanner(System.in);
    public static int opcion;
    public static void main(String[] args) {
        opcion=0;
        while (opcion!=6){
            System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////");
            System.out.println("BIENVENIDO A LA BIBLOTECA \nElija una opcion \n1. insertar libro/revista/articulo \n2. Buscar libro/revista/articulo por Id \n3. Realizar prestamo " +
                    "\n4. Devolver libro \n5. Nuevo usuario \n6. Cerrar");
            opcion=scanner.nextInt();
                switch (opcion){
                    case 1:
                        System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////");
                        Controller.newChoose();
                        break;
                    case 2:
                        System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////");
                        Controller.searchID();
                        break;
                    case 3:
                        System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////");
                        Controller.lend();
                        break;
                    case 4:
                        System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////");
                        Controller.Return();
                        break;
                    case 5:
                        System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////");
                        Controller.newuser();
                        break;
                    case 6:
                        break;
                }
        }
    }
}
