import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double length, width;

        System.out.println("Enter the length of the rectangle: ");
        length = in.nextInt();
        System.out.println("Enter the width of the rectangle: ");
        width = in.nextInt();

        if (length > 0 & width >0)
        {
            double perimeter = 2*(length + width);
            System.out.println("Perimeter of Rectangle: " + perimeter);
            double area = length * width;
            System.out.println("Area of Rectangle: " + area);
            double diag = Math.sqrt((length * length)+(width * width));

            System.out.println("Diagonal of Rectangle: " + diag);
        }
        else
        {
            System.out.println("Error: Enter a positive value!! ");
        }
    }
}
