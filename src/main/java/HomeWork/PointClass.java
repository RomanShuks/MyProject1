package HomeWork;

public class PointClass {

    public static void main(String[] args) {
        Point p1 = new Point(6, 7);
        Point p2 = new Point(4, 8);
        PointCalculator calculator =  new PointCalculator();
        System.out.println("Расстояние между точками равно " + calculator.distance(p1, p2));
        System.out.println("Расстояние между точками равно " + distance(p1, p2));

    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
    }
}


