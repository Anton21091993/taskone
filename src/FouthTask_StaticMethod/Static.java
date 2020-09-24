package FouthTask_StaticMethod;

public class Static {

    public static void main(String[] args) {

    }
    public static void sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {

            System.out.println("Go sleep");
        } else {
            System.out.println("Go work");
        }


    }

}
