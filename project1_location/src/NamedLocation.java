public class NamedLocation extends SimpleLocation {
    private String name;

    public NamedLocation(double lat, double lon, String name) {
        super(lat, lon);
        this.name = name;
    }

    // ✅ Overriding: إعادة تعريف دالة الطباعة
    @Override
    public void printLocation() {
        System.out.println("Location: " + name + " (" + latitude + ", " + longitude + ")");
    }
}