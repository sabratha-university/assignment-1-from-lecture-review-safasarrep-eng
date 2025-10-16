

public class SimpleLocation {
    protected double latitude;
    protected double longitude;

    public SimpleLocation(double lat, double lon) {
        this.latitude = lat;
        this.longitude = lon;
    }

    // ✅ Overloading: دالة تستقبل كائن
    public double distanceTo(SimpleLocation other) {
        double radius = 6371.0;
        double lat1 = Math.toRadians(this.latitude);
        double lat2 = Math.toRadians(other.latitude);
        double lng1 = Math.toRadians(this.longitude);
        double lng2 = Math.toRadians(other.longitude);

        return radius * Math.acos(
                Math.sin(lat1) * Math.sin(lat2) +
                        Math.cos(lat1) * Math.cos(lat2) * Math.cos(lng1 - lng2)
        );
    }

    // ✅ Overloading: دالة تستقبل إحداثيات مباشرة
    public double distanceTo(double lat, double lon) {
        SimpleLocation temp = new SimpleLocation(lat, lon);
        return distanceTo(temp);
    }

    public void printLocation() {
        System.out.println("Latitude: " + latitude + ", Longitude: " + longitude);
    }
}
