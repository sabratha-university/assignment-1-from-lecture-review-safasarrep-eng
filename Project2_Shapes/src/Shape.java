
public abstract class Shape {
    protected Point position;

    public Shape(Point position) {
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    // دالة رسم مجردة، تُنفذ في الأصناف الفرعية
    public abstract void draw();

    // دالة مساعدة لتحريك الشكل إلى موقع جديد
    public void moveTo(int x, int y) {
        position.setX(x);
        position.setY(y);
    }
}
