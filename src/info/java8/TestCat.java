package info.java8;
/*
  Test Class for Cat
*/
public class TestCat {

    public static void main (String[] args) {
        Cat moggy = new Cat();    // Create a Cat instance
        moggy.name = "Tigger";    // Use dot notation to populate cats name
        moggy.colour = "Orange";  // Use dot notation to populate cats colour
        moggy.age = 12;           // Use dot notation to populate cats age
        System.out.println("Our " + moggy.colour + " cat called " + moggy.name + " is " + moggy.age);
        moggy.talk();             // Use dot notation to execute the talk() method
    }
}

