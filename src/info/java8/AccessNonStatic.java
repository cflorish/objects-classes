package info.java8;
/*
  Test class for accessing non-static from static
*/
public class AccessNonStatic {
    int nonStatic = 28;

    public static void main (String[] args) {
        AccessNonStatic ans = new AccessNonStatic();
        System.out.println(ans.nonStatic);   // Calling non-static
    }
}

