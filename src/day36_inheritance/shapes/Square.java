package day36_inheritance.shapes;

public class Square extends Shapes {

    private int side;

    public Square(int side) {
        super("Square");
        setSide(side);
    }

    public void setSide(int side) {
        if (side > 0) {
            this.side = side;
        }
    }


    @Override
    public double area() {

        return side*side;
        //Dont need this keyword
        //No local var same name
    }

    @Override
    public double perimeter(){
        return side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "\n\tSide: " + side+
                "\n\tName: " + name+
                "\n\tArea: " + area()+
                "\n\tPerimeter: " + perimeter();

    }
}
