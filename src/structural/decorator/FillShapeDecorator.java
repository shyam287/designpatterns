package structural.decorator;

public class FillShapeDecorator extends AbstractShapeDecorator {

    private String color;

    public FillShapeDecorator(Shape shape, String color) {
        super(shape);
        this.color = color;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("color: " + color +" filling");
    }

    @Override
    public void resize() {
        shape.resize();
    }
}
