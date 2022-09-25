package Functions;
/*
*esta clase crea objetos de tipo Choosthing, siendo una superclase (clase padre) para los tipos de objetos que se pueden encontrar en la bibloteca
 */

public class Choosething {
    /*
    * variables de la clase
     */
    protected int Id;
    protected String title;
    protected String topic;
    protected int amount;
    protected String condition;
    protected int thing;

/*
*constructor para crear un objeto de este tipo
* @param Id del objeto, title el titulo del objeto, topic el tipo de materia, amount la cantidad que se ingresara, thing el tipo de objeto que se ingresara
 */
    public Choosething (int Id, String title, String topic, int amount, int thing){
        this.Id=Id;
        this.title=title;
        this.topic=topic;
        this.amount=amount;
        if (getAmount()==0){
            setCondition("Agotado");
        }else {
            setCondition("Disponible");
        }
        this.thing=thing;
    }
/*
* getters y setters de los objetos de la clase Choosething
 */

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getThing() {
        return thing;
    }

    public void setThing(int thing) {
        this.thing = thing;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
