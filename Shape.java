class Shape {
    String color;
    Shape(String color) { this.color = color; }
    void draw() { System.out.println("Drawing " + color + " shape"); 
	}
}

class Rectangle extends Shape 
{
    double width, height;

    Rectangle(String color, double w, double h) 
	{
        super(color);      // call parent constructor
        width = w; height = h;
    }

    void draw() 
	{
        super.draw();       // call parent method
        System.out.println("Rectangle: " + width + "x" + height);
    }
}