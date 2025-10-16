
public class Main {
    public static void main(String[] args) {
        Point p = new Point(10, 20);
        Circle c = new Circle(p, 5.0);

        System.out.println("Initial: " + c);
        c.draw();

        // تحريك الدائرة
        c.move(5, -3);
        System.out.println("After move: " + c);
        c.draw();

        // تعديل الحجم
        c.adjust(2.0);
        System.out.println("After adjust: " + c);
        c.draw();

        // استخدام دالة moveTo من الصنف الأب
        c.moveTo(0, 0);
        System.out.println("After moveTo: " + c);
        c.draw();
    }
}