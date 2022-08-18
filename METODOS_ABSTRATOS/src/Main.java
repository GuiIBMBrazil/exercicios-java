import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Shape>formas = new ArrayList<>();

    System.out.println("Enter the number of shapes:");
    int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Shape " + (i+1) + " data:");
            System.out.printf("Rectangle or Circle (r/c)?");
            char value = sc.next().charAt(0);
            System.out.printf("COLOR (BLUE/RED/BLACK):");
            String color = sc.next();

            switch (value){
                case 'c':
                    System.out.printf("RADIUS:");
                    double radius = sc.nextDouble();

                    Shape shape = new Circle(radius,COLOR.valueOf(color));
                    formas.add(shape);
                    break;
                case 'r':
                    System.out.printf("WIDTH:");
                    double width = sc.nextDouble();
                    System.out.printf("HEIGHT:");
                    double height = sc.nextDouble();

                    shape = new Rectangle(height,width,COLOR.valueOf(color));
                    formas.add(shape);
                    break;
                default:
                    System.out.println("INVALID VALUE !");
                    break;
            }
        }
        List<Double>areas = formas.stream().map(x ->x.area()).collect(Collectors.toList());

        System.out.println("SHAPE AREAS:");
        for (Double a:areas) {
            System.out.println(a);
        }
    }
}
