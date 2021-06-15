import java.util.Scanner;

public class AreaOfWalls {
    public static void main(String[] args) {
      Scanner Input_Width = new Scanner(System.in);
      System.out.println("enter the Width of the wall, numerically in metres");
      double Wall_width = Input_Width.nextDouble();
      Scanner Input_Height = new Scanner(System.in);
      System.out.println("enter the Height of the wall, numerically in metres");
      double Wall_height = Input_Height.nextDouble();
      Scanner Input_area_of_obstructions = new Scanner(System.in);
      System.out.println("enter the area of any obstructions, such as windows or doors, numerically in metres");
      double Obstruction_area = Input_area_of_obstructions.nextDouble();
      double Wall_area =(Wall_width*Wall_height) - Obstruction_area;
//change height to breadth, as the ceiling won't have a height
        // need to do other walls and the ceiling
        // need to account for windows etc.
        // need to add in cost and coats of paint
        // use mm instead of m?
        if (Wall_height >= 10) {
            System.out.println("Why do you have such a ridiculously large wall you maniac");
        }
        else {
            System.out.println("The height of the wall is not 100 metres");
        }
        System.out.println("The amount of paint required is " + Wall_area + " square metres, then combined for each wall");
        int WallArea = (int) Math.round(Wall_area);
      switch (WallArea) {
          case 5000:
          System.out.println("We're gonna need a stupid amount of paint");
          break;
          case 1:
          System.out.println("We don't need as much paint");
          break;
      }
    }}

