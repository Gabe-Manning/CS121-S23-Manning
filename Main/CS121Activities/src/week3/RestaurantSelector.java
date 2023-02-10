package week3;

import java.util.Scanner;
public class RestaurantSelector {
    public static void main(String[] args) {
        boolean vege = true;
        boolean vega = true;
        boolean gf = true;

        Scanner console = new Scanner(System.in);

        System.out.println("Is anyone in your party a vegetarian?");
        String vegeanswer = console.next();
        if (vegeanswer.equalsIgnoreCase("Yes"))
            vege = false;
        System.out.println("Is anyone in your party a vegan?");
        String vegaanswer = console.next();
        if (vegaanswer.equalsIgnoreCase("Yes"))
            vega = false;
        System.out.println("Is anyone in your party gluten-free?");
        String gfanswer = console.next();
        if (gfanswer.equalsIgnoreCase("Yes"))
            gf = false;

        if (vege == true && vega == true && gf == true)
        System.out.println("You can take the party to Joe's Gourmet Burgers, Main Street Pizza Company, Corner Café, Mama's Fine Italian, or The Chef's Kitchen");
        else if (vege == true && vega == true && gf == false)
        System.out.println("You can take your party to Main Street Pizza Company, Corner Café, or The Chef's Kitchen");
        else if (vege == true && vega == false && gf == true)
            System.out.println("You can take your party to Corner Café or The Chef's Kitchen");
        else if (vege == false && vega == true && gf == true)
            System.out.println("You can take your party to Main Street Pizza Company, Corner Café, Mama's Fine Italian, or The Chef's Kitchen");
        else if (vege == true && vega == false && gf == false)
            System.out.println("You can take your party to Corner Café or The Chef's Kitchen");
        else if (vege == false && vega == true && gf == false)
            System.out.println("You can take your party to Main Street Pizza Company, Corner Café, or The Chef's Kitchen");
        else if (vege == false && vega == false && gf == true)
            System.out.println("You can take your party to Corner Café or The Chef's Kitchen");
        else
            System.out.println("You can take your party to Corner Café or The Chef's Kitchen");

        console.close();

    }
}
