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
//Things to add:
//Can choose if you want to do 1, 2 or 3 coats
//Paint 1: 2.5L costs £[10] covers[25] square metres. 5L costs £[15] covers[50] square metres. 10L costs £[20] covers[100] square metres.
//Paint 2: 2.5L costs £[15] covers[50] square metres. 5L costs £[20] covers[100] square metres. 10L costs £[25] covers[200] square metres.
//Paint 3: 2.5L costs £[20] covers[75] square metres. 5L costs £[25] covers[150] square metres. 10L costs £[30] covers[300] square metres.
//Should I allow the entering of cost and how much it covers rather than listing 3?
//Use switch
//Use other loops
//Change obstructions/areas you don't want to cover to height, width and calculation of area rather than just entering the area
