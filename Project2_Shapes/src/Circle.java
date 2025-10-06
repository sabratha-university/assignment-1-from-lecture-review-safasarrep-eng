public class Circle extends Shape implements Movable, Adjustable {
    private double radius;
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }

    @Override
    public void move() {
        System.out.println(name + " moved to new position.");
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
        System.out.println(name + " resized to new radius: " + radius);
    }
}
