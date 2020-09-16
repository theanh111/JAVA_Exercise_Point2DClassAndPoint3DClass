public class Main {
    public static void main(String[] args) {
        // Test khi chưa truyền tham số:
        Point2D point2d = new Point2D();
        System.out.println("Before: " + point2d);

        // Test khi truyền tham số:
        point2d = new Point2D(1.1f,2.6f);
        System.out.println("After: " + point2d);

        // Test khi chưa truyền tham số:
        Point3D point3d = new Point3D();
        System.out.println("Before: " + point3d);

        // Test khi truyền tham số:
        point3d = new Point3D(2.5f, 3.2f,5.6f);
        System.out.println("After: " + point3d);

    }
}
