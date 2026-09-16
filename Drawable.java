// Defining an interface
interface Drawable {
    double PI = 3.14159;     // implicitly public static final
    void draw();              // implicitly public abstract
    double area();
}

// Implementing the interface
class Circle implements Drawable {
    double r;
    Circle(double r) { this.r = r; }

    @Override
    public void draw()   { System.out.println("Drawing circle"); }

    @Override
    public double area() { return PI * r * r; }
}

// Implementing multiple interfaces
interface Resizable { void resize(double factor); }

class Square implements Drawable, Resizable {
    double side;
    @Override public void   draw()              { System.out.println("Drawing square"); }
    @Override public double area()              { return side * side; }
    @Override public void   resize(double f)   { side *= f; }
}
