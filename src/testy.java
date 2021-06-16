import java.util.Scanner;

public class testy {

    public static Scanner input = new Scanner(System.in);

    public static int numberWalls() {
        System.out.println("Enter the number of walls");
        int NumberWalls = input.nextInt();
        return NumberWalls;
    };

    public static int findWidth(int i) {
        System.out.println("enter the Width of wall " + (i+1) + ", numerically in mm");
        int Wall_width = input.nextInt();

        System.out.println("enter the Height of wall " + (i+1) + ", numerically in mm");
        int Wall_height = input.nextInt();

        System.out.println("enter the area of any obstructions, such as windows. light fittings or doors, numerically in mm");
        int Obstruction_area = input.nextInt();

        int Wall_area = (Wall_width * Wall_height) - Obstruction_area;

        return Wall_area;
    }
    public static void main(String[] args) {
        int NumberWalls = numberWalls();
        int[] Walls = new int[NumberWalls];

        for (int i = 0; i <= (NumberWalls-1); i++) {

           int Wall_area = findWidth(i);

            Walls[i] = Wall_area;

            System.out.println("The area of wall " + (i+1) + " is "  + Walls[i] + "mm");
        }
       int totalArea = 0;
        for (int Area:Walls) {
            totalArea = totalArea + Area;
        }
        System.out.println("The total area that requires painting is " +totalArea + "mm");
    }
}
//Have 3 paint pots to choose from, which have different costs and cover different areas per litre.
//They will come in 5l buckets