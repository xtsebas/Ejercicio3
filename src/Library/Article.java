package Library;
/*
*Clase hija de la clase Choosething, del tipo article
 */

import Functions.Choosething;

import java.util.Scanner;

public class Article extends Choosething{
    /*
    *variables de la clase
     */
    private static String referee;
    static Scanner in= new Scanner(System.in);
    /*
    *constructor para la creacion de objeto tipo Choosething: Article
    * @param Id del article, title el titulo del article, topic el tipo de materia, amount la cantidad que se ingresara, thing el tipo de objeto que se ingresara
     */
    public Article(int Id, String title, String topic, int amount, int thing){
        super(Id, title, topic, amount,thing);
        System.out.println("Ingrese el arbitro/s del articulo: ");
        setReferee(in.nextLine());
    }
/*
*getters y setters de la clase article
 */
    public static String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee;
    }
}
