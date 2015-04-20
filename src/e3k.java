
import java.util.*;

/*
 Luke Simpson
 */
public class e3k {

    public static void main(String[] args) {
        double dNum, dFac;
        dFac = 1;
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter a Number to find its factorial.");
        dNum = sin.nextInt();

        for (; dNum >= 1; dNum--)
        {dFac = dFac * dNum;}
        
        System.out.println(" The Factorial is " + dFac);

    }
}
