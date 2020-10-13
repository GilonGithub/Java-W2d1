import java.util.Scanner;
import java.lang.Math;

public class AreaOfPentagon {
    
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.print("Enter the length from the center to a vertex: ");
        double length = input.nextDouble();

        double side = (2 * length) * Math.sin((Math.PI/5));
        double area = (5 * Math.pow(side, 2)) / (4 * (Math.tan((Math.PI/5))));

        System.out.format("The area of the pentagon is %.2f", area);



    }
}
