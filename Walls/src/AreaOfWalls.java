import java.util.Scanner;

public class AreaOfWalls {
    public static void main(String[] args) {
      Scanner Input_Width = new Scanner(System.in);
      System.out.println("enter the Width of the wall, numerically in metres");
      double Wall_width = Input_Width.nextDouble();
      Scanner Input_Height = new Scanner(System.in);
      System.out.println("enter the Height of the wall, numerically in metres");
      double Wall_length = Input_Height.nextDouble();
      double Wall_area = Wall_width*Wall_length;
      System.out.println("Area of Rectangle is:"+Wall_area);
//change height to breadth, as the ceiling won't have a height
          String WallWidth = "100";
          String WallHeight = "50";
        int Width = Integer.parseInt(WallWidth);
        int Height = Integer.parseInt(WallHeight);
        int area = Width * Height;
        System.out.println(area);
        if (Width == 100) {
            System.out.println("Why do you have such a ridiculously large wall you maniac");
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

