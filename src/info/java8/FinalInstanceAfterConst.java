
package info.java8;
/*
  Assigning final instance variable outside declaration and construction
*/
public class FinalInstanceAfterConst {
//    final int i;

    FinalInstanceAfterConst() {
        assignFinal();
//        System.out.println(this.i);
    }

    public void assignFinal() {
//        this.i = 1;
    }
}

