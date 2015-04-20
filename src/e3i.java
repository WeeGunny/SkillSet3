/*
 Luke Simpson
 */

import java.util.*;

public class e3i {

    public static void main(String[] args) {
        double dCel, dCel2, dSum;
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter the Start of the Celcius range");
        dCel = sin.nextInt();
        System.out.println("Enter the End of the Celcius range");
        dCel2 = sin.nextInt();
        dSum = 0;

        for (; dCel <= dCel2; dCel++) {
            dSum = (dCel * 9) / 5 + 32;
            System.out.println(dCel + " The Fahrenhiet is " + dSum);
        }
    }
}
