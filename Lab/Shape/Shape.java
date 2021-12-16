
public abstract class Shape {
    protected String _color;

    public Shape() {
        _color = "Black";
    }

    public Shape(String color) {
        _color = color;
    }

    public abstract void use();
}