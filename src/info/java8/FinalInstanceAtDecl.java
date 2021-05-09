
package info.java8;
/*
  Assigning final instance variable at declaration
*/
public class FinalInstanceAtDecl {
    final int i = 678;

    FinalInstanceAtDecl() {
        System.out.println(i);
    }

    public static void main (String[] args) {
        FinalInstanceAtDecl fiad = new FinalInstanceAtDecl();
    }
}

