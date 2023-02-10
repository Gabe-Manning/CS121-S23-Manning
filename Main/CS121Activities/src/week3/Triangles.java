package week3;

import javax.swing.JOptionPane;
public class Triangles {
    public static void main(String[] args) {
        int s1, s2, s3;

        s1 = Integer.parseInt(JOptionPane.showInputDialog("What is the first side length of the triangle?"));
        s2 = Integer.parseInt(JOptionPane.showInputDialog("What is the second side length of the triangle?"));
        s3 = Integer.parseInt(JOptionPane.showInputDialog("What is the third side length of the triangle?"));

        if (s1 != s2 && s1 != s3 && s2 != s3)
            System.out.println("It is a scalene triangle");
        else if (s1 == s2 && s1 == s3 && s2 == s3)
            System.out.println("It is an equilateral triangle");
        else
            System.out.println("It is an isosceles triangle");

    }
}
