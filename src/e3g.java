/*
 Luke Simpson
 */

import java.util.*;

public class e3g {

    public static void main(String[] args) {
        String sResponse;
        Scanner sin = new Scanner(System.in);
       
        do { System.out.println("Is the light green?");
            sResponse = sin.next(); 
        } while (sResponse.equals("no"));
        
       do {System.out.println("You may cross the intersection.");
       break;}
         while (sResponse.equals("yes"));
       
    }
}
