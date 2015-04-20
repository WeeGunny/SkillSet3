/*
 Luke Simpson
 */

import java.util.*;

public class e3h {

    public static void main(String[] args) {
        int nStart, nEnd, nRange, nSum;
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter the Start of the range");
        nStart = sin.nextInt();
        System.out.println("Enter the End of the range");
        nEnd = sin.nextInt();
        
        System.out.println("The Range is ");
        nSum = 0;

        for (nRange = nStart; nRange <= nEnd; nRange++) {
            System.out.println(nRange);
            nSum += nRange;
        }
        
        System.out.println("The Sum is");
     
        System.out.println(nSum);

    }
}
