package Model;

import Functions.Choosething;
import Functions.User;

import java.util.Scanner;

public class DriverProgram {
    public static User person;
    public static Choosething choose;
    public static int op;
    static Scanner scanner= new Scanner(System.in);
    public static int opcion;
    public static void main(String[] args) {
        op=1;
        while (op==1){
        System.out.println("BIENVENIDO A LA BIBLOTECA \nElija una opcion \n1. insertar libro/revista/articulo \n2. Buscar libro/revista/articulo por Id \n3. Realizar prestamo \n4. Devolver libro \n5. Nuevo usuario");
        opcion=scanner.nextInt();
            switch (opcion){
                case 1:
                    Controller.newchoose();
                    break;
                case 2:
                    Controller.searchID();
                    break;
                case 3:
                    Controller.lend();
                    break;
                case 4:

                    break;
                case 5:
                    Controller.newuser();
                    break;
                case 6:
                    System.out.println("Su opcion elegida no existe");
                    break;
            }
            System.out.println("");
            System.out.println("Desea realizar otra opcion? \n1. si \n2. no");
            op=scanner.nextInt();
            System.out.println("/////////////////////////////////////////////////////////////////");
        }
    }
}
