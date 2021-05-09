package info.java8;
/*
  A Cat Class
*/
public class Cat {
    String name, colour;
    int age;
    /*
      no-arg constructor for our Cat Class
    */
    public Cat() {

    }

    /*
      Our new constructor for when someone using our class doesn't know the name of a cat
    */
    public Cat(String colour, int age) {
        this("unknown", colour, age);
    }

    /*
      Constructor using this Keyword
    */
    public Cat(String name, String colour, int age) {
        this.name = name;
        this.colour = colour;
        this.age = age;
    }

    void talk() {
        System.out.println("meow!");
    }
}
