import java.sql.Array;
import java.util.Arrays;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setXY(2.3f,2.4f);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));
    }
}
