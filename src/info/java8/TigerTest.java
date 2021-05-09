
package info.java8;
/*
  Test Class for Tiger
*/
public class TigerTest {

    public static void main (String[] args) {
        Tiger tony = new Tiger();  // Create a Tiger instance
        tony.tigerMannerisms("eats food", 4);  // Pass values
        String tiggerAction = "runs up trees";
        int tiggerTimes = 2;
        tony.tigerMannerisms(tiggerAction , tiggerTimes );  // Pass types
    }
}

