package Functions;

public class User {
    private static String name;
    private static int In;
    private static String direction;
    private static int amountbooks;

    public User(){
        name="";
        In=000000;
        direction="";
        amountbooks=0;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        User.name = name;
    }

    public static int getIn() {
        return In;
    }

    public static void setIn(int in) {
        In = in;
    }

    public static String getDirection() {
        return direction;
    }

    public static void setDirection(String direction) {
        User.direction = direction;
    }

    public static int getAmountbooks() {
        return amountbooks;
    }

    public static void setAmountbooks(int amountbooks) {
        User.amountbooks = amountbooks;
    }
}
