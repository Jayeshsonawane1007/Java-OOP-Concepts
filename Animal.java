
public class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// File: Dog.java
public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
