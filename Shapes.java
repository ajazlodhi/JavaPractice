public class Shapes {
    public static double area(double length, double width){
        return length * width;
    }
    public static double area(int side){
        return side * side;
    }
    public static double area(double base, double height, double shape){
        return 0.5 * base * height;
    }
    public static double area(double radius){
        return 3.14 * radius * radius;
    }
    public static void main(String[] args){
        System.out.println("Area of Rectangle : " + area(30, 20));
        System.out.println("Area of Triangle : " + area(30));
        System.out.println("Area of square : " +area(50, 10, 0.5));
        System.out.println("Area of Circle: " + area(40.));
    }
}
