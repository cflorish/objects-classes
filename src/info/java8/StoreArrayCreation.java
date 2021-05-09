package info.java8;
/*
  Invalid type example
*/
public class StoreArrayCreation {

    public static void main (String[] args) {
        Number[] anArray = new Float[1]; // Array declaration
        anArray[0] = new Integer(1); // Invalid type
        System.out.println(anArray[0]);
    }
}

