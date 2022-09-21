package Library;

import java.util.Scanner;

public class Article {
    private static String referee;
    static Scanner in= new Scanner(System.in);
    public Article(){
        System.out.println("Ingrese el arbitro/s del articulo: ");
        setReferee(in.nextLine());
    }

    public static String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee;
    }
}
