

public class LocationTester {
    public static void main(String[] args) {
        // موقعك الحالي
        NamedLocation myPlace = new NamedLocation(32.824662, 12.050083, "مكاني");

        // كلية تقنية المعلومات صبراتة
        NamedLocation itCollege = new NamedLocation(32.852665, 12.062142, "كلية تقنية المعلومات صبراتة");

        // ✅ استخدام Overriding: طباعة مخصصة
        myPlace.printLocation();
        itCollege.printLocation();

        // ✅ استخدام Overloading: حساب المسافة باستخدام كائن
        double distance1 = myPlace.distanceTo(itCollege);
        System.out.println("المسافة باستخدام كائن: " + distance1 + " كم");

        // ✅ استخدام Overloading: حساب المسافة باستخدام إحداثيات مباشرة
        double distance2 = myPlace.distanceTo(32.852665, 12.062142);
        System.out.println("المسافة باستخدام إحداثيات: " + distance2 + " كم");
    }
}