
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
    public static void main(String[] args) {
        
     Animal animal = new Animal();
        Animal dog = new Dog();  // Runtime Polymorphism
        animal.makeSound();  // Output: Animal makes a sound
        dog.makeSound();     // Output: Dog barks

}
}
