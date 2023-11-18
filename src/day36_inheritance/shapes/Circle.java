package day36_inheritance.shapes;

public class Circle extends Shapes {

    int radius;
    public Circle(int radius){
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius*Math.PI;
        //Math.pow(radius,2)*Math.PI
    }
    @Override
    public double perimeter(){
        return radius*2*Math.PI;
    }
    @Override
    public String toString() {
        return "Square{" +
                "\n\tRadius: " + radius+
                "\n\tName: " + name+
                "\n\tArea: " + area()+
                "\n\tPerimeter: " + perimeter();

    }
}
