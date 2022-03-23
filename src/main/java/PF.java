public class PF {
    public static void main(String[] args) {
        hello("this World");
        hello("FCK");
        hello("Night");

        double l = 5;
        System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));


        double a = 4;
        double b = 6;
        System.out.println("Площадь прмоугольника со сторонами " + a + " и " + b + " = " + area(a,b));
    }

    public static void hello(String soso) {
        System.out.println("Smile, " + soso + "!");
    }

    public static double area(double len) {
        return len * len;
    }

public static double area(double a, double b) {
        return a * b;
}


   }
