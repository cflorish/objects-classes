package info.java8;
/*
  Assigning final instance via constructor parameter
*/
public class FinalInstanceByConstParam {
    final int i;

    FinalInstanceByConstParam(int i) {
        this.i = i;
        System.out.println(this.i);
    }

    public static void main (String[] args) {
        FinalInstanceByConstParam fibcp = new FinalInstanceByConstParam(2706);
    }
}
