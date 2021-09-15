package structural.decorator;

// Decorator pattern is used to add extra functionality/behavior to the object.
// this is done to avoid modifying existing object.
// single responsibility and open closed principle is maintained using this
// pattern as we are not changing the existing object
public class Main {
    public static void main(String[] args) {

        System.out.println("shape fill decoration");
        Shape fillShapeDecorator = new FillShapeDecorator(new Circle(), "green");
        fillShapeDecorator.draw();

        System.out.println("\nshape fill and line style decoration");
        Shape lineStyleAndFillDecorator = new LineStyleShareDecorator(fillShapeDecorator, "dotted line style");
        lineStyleAndFillDecorator.draw();
    }
}
