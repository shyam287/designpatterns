package structural.decorator;

public class LineStyleShareDecorator extends AbstractShapeDecorator {

    protected String lineThickness;

    public LineStyleShareDecorator(Shape shape, String lineThickness) {
        super(shape);
        this.lineThickness = lineThickness;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("with line thickness: " + lineThickness);
    }

    @Override
    public void resize() {
        shape.draw();
    }
}
