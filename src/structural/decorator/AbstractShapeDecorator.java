package structural.decorator;

public abstract class AbstractShapeDecorator implements Shape {

    protected Shape shape;

    public AbstractShapeDecorator(Shape shape) {
        this.shape = shape;
    }
}
