//Code adapted from https://gist.github.com/jintujacob/1024755

import javax.swing.JOptionPane;
public class GUI2 {

    public static void main(String[] args) {
        String Height, Width;
        int HeightWall, WidthWall, Area;

        Height = JOptionPane.showInputDialog("Please enter the height of the wall, numerically in mm");
        HeightWall = Integer.parseInt(Height);

        Width = JOptionPane.showInputDialog("Please enter the width of the wall, numerically in mm");
        WidthWall = Integer.parseInt(Width);

        Area = HeightWall + WidthWall;

        JOptionPane.showMessageDialog(null, "The total area of the wall is : " + Area , "Results", JOptionPane.PLAIN_MESSAGE );

        System.exit(0);
    }
}
