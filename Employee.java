// File: Employee.java
public class Employee extends Person {
    private String position;

    public Employee(String name, int age, String position) {
        super(name, age); // Calling parent constructor
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void work() {
        System.out.println(getName() + " is working as a " + position);
    }
  public static void main(String[] args) {
    Employee emp = new Employee("Jayesh", 24, "Java Developer");
        emp.work();
  }
}
