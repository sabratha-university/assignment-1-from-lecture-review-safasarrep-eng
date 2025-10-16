
public class Circle extends Shape implements Movable, Adjustable {
    private double radius;

    public Circle(Point position, double radius) {
        super(position);
        this.radius = radius;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    @Override
    public void draw() {
        System.out.println("Drawing Circle at " + position + " with radius " + radius);
    }

    @Override
    public void move(int dx, int dy) {
        position.setX(position.getX() + dx);
        position.setY(position.getY() + dy);
    }

    @Override
    public void adjust(double factor) {
        if (factor <= 0) {
            System.out.println("Factor must be positive!");
            return;
        }
        radius *= factor;
    }

    @Override
    public String toString() {
        return "Circle[position=" + position + ", radius=" + radius + "]";
    }
}