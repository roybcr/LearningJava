public class Triangle extends Shape {
    protected int _base;
    protected int _height;
    
    public Triangle() {
        super();
        _base = 5;
        _height = 4;
    }
    
    public Triangle(String color, int base, int height) {
        super(color);
        _base = base;
        _height = height;
    }
    
    public void use() {
        System.out.println("Hi I'm a Triangle!");
    } 
    
    public String toString() {
        return "I am a Shape of type Triangle, and my properties are:\n color: " + _color + ",\n base: " + _base + ",\n height: " + _height + ".";
    }
    
}