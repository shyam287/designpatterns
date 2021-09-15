package structural.decorator;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("drawing circle");
    }

    @Override
    public void resize() {
        System.out.println("resizing circle");
    }
}
