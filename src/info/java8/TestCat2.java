
package info.java8;
/*
  Test Class2 for Cat
*/
public class TestCat2 {

    public static void main (String[] args) {
        Cat moggy = new Cat();    // Create a Cat instance
        Cat tigger = new Cat();   // Create a Cat instance
        Cat tabby = new Cat();    // Create a Cat instance
        tabby = tigger;
        tigger = moggy;
        moggy = null;
        tigger = null;
        tabby.talk();             // execute the talk() method
        tigger.talk();            // execute the talk() method (runtime error)
    }
}

