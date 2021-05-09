package info.java8;
/*
  One dimensional array examples
*/
public class OneDimensionArrays {

    public static void main (String[] args) {
        int intArray1[];           // Array declaration
        intArray1 = new int[4];    // Array allocation
        System.out.println("Value of position 4 (index 3) : " + intArray1[3]);
        intArray1[3] = 672;        // Array initialization
        System.out.println("Value of position 4 (index 3) : " + intArray1[3]);

        String[] strArray1;;       // Array declaration
        strArray1 = new String[3]; // Array allocation
        System.out.println("Value of position 3 (index 2) : " + strArray1[2]);
        strArray1[2] = "fred";     // Array initialization
        System.out.println("Value of position 3 (index 2) : " + strArray1[2]);

        String strArray2[] = {"one", "aa", "c", "rt", "je"};     // Single statement array creation
        System.out.println("Value of position 5 (index 4) : " + strArray2[4]);
    }
}

