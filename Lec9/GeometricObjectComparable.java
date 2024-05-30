// GeometricObjectComparable.java
public class GeometricObjectComparable {
    // Define static max method
    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        // Use compareTo method to find the larger object
        if (o1.compareTo(o2) > 0)
            return o1;
        else
            return o2;
    }
}
