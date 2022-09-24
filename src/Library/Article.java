package Library;

import Functions.Choosething;

import java.util.Scanner;

public class Article extends Choosething{
    private static String referee;
    static Scanner in= new Scanner(System.in);
    public Article(int Id, String title, String topic, int amount, int thing){
        super(Id, title, topic, amount,thing);
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
