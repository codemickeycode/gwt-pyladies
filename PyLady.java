//4. defining a simple class with constructors
public class PyLady{
    private String name;

    public PyLady(String name) {
        this.name = name;
    }

    public void sayHi() {
        System.out.println("Hi! I'm " + name);
    }
}