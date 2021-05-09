package info.java8;
/*
  Trying to reassign a final instance variable
*/
public class FinalInstanceChanged {
    final int i = 1;

    FinalInstanceChanged() {  // Constructor
//        i = 2;
    }
}
