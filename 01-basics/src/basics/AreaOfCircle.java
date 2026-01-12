package basics;

public class AreaOfCircle {
    public static void main(String[] args) {

        // Area of circle = π * r^2
        double r = 5;
        double pi = 22.0 / 7;
        double area = pi * r * r;
        System.out.println(area);

        // Volume of sphere = (4/3) * π * r^3
        double r2 = 3;
        double pi2 = 22.0 / 7;
        double volumeOfSphere = (4.0 / 3) * pi2 * r2 * r2 * r2;
        System.out.println(volumeOfSphere);
    }
}
