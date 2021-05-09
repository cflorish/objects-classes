
package info.java8;
/*
  Assigning final instance via constructor parameter
*/
public class FinalInstanceWithinConst {
    final int i;

    FinalInstanceWithinConst() {
        i = 8657;
        System.out.println(i);
    }

    public static void main (String[] args) {
        FinalInstanceWithinConst fiwc = new FinalInstanceWithinConst();
    }
}