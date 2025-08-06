
public abstract class Shape {
    // Abstract method
    public abstract void draw();
}

// File: Circle.java
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
  public static void main(String[] args) {
    Shape shape = new Circle();  // Abstract class reference
        shape.draw();  // Output: Drawing a circle
    }
}
