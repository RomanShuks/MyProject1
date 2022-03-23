public class PF {
    public static void main(String[] args) {
        hello("this World");
        hello("FCK");
        hello("Night");

        Square s = new Square(5);
        double l = 5;
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));



        Rectangle r = new Rectangle(4,6);
        System.out.println("Площадь прмоугольника со сторонами " + r.a + " и " + r.b + " = " + area(r));
    }

    public static void hello(String soso) {
        System.out.println("Smile, " + soso + "!");
    }

    public static double area(Square s) {
        return s.l  * s.l;
    }

    public static double area(Rectangle r) {
        return r.a * r.b;
    }
}
