
import java.util.*;

/*
 Luke Simpson
 */

public class e3j {

    public static void main(String[] args) {
       double dNum, dCount, dAvg, dSum;
       dSum = 0;
       dCount = 0;
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter a Number, Enter 0 when you are done");
        dNum = sin.nextInt();
       
        while (dNum != 0)
        {dSum = dSum + dNum;
        dCount ++;
        System.out.println("Enter the Start of the Celcius range");
        dNum = sin.nextInt();}
        
        dAvg = dSum/ dCount;
        System.out.println("The Sum of all Number is " + dSum);
        System.out.println("The averageof all Number is " + dAvg);
        
    }
}
