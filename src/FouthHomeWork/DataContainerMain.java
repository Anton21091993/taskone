package FouthHomeWork;

public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<Object> myData = new DataContainer<>();
        int a = myData.add(123);
        int b = myData.add(null);
        int c = myData.add(45);
        int d = myData.add(null);
      //  System.out.println(myData.print()); ;
    }


}
