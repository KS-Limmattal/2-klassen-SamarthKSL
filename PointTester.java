import java.awt.Point;
public class PointTester {

public static void main(String[] args) {
    Point p = new Point(2,5);
    System.out.println(p.toString()); 
    
    double x = p.getX();
    double y = p.getY();
    Point a = new Point();
    a.setLocation(y, x);
    System.out.println(a.toString());

    Point q = new Point();
    q.setLocation(p);
    System.out.println(q.toString());
    }
}
