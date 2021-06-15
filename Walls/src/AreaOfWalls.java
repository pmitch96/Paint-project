// import java.util.Scanner;

public class AreaOfWalls {
    public static void main(String[] args) {
      // Scanner s= new Scanner(System.in);
      // System.out.println("enter the length of the wall, numerically in metres")
// double

          String WallWidth = "100";
          String WallHeight = "50";
        int Width = Integer.parseInt(WallWidth);
        int Height = Integer.parseInt(WallHeight);
        int area = Width * Height;
        System.out.println(area);
        if (Width == 100) {
            System.out.println("The height of the wall is 100 metres");
        }
        else {
            System.out.println("The height of the wall is not 100 metres");
        }
        System.out.println("The amount of paint required is " + area + " square metres, then combined for each wall");
      switch (area) {

          case 5000:
          System.out.println("We're gonna need a stupid amount of paint");
          break;
          case 1:
          System.out.println("We don't need as much paint");
          break;


      }
    }}

