
import java.util.Scanner;

/*
 Luke Simpson
 */
public class binery_conversion {

    public static void main(String[] args) {
        int i, nNum;
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter a Number in decimal format");
        nNum = sin.nextInt();
//the easy way
//        while (nNum > 0)
//        {nNum /=2;
//        i = nNum % 2;
//        System.out.print(i);
//        }
        
        
//        The way grondin wants us to do it
        System.out.println("the Number in binery is ");
        for (i = 10; i > (-1); i--) {
            if (Math.pow(2, i) <= nNum) {
                for (; i > (-1); i--) {
                    if (Math.pow(2, i) <= nNum) {
                        System.out.print("1");
                        nNum -= (Math.pow(2, i));
                    } else {
                        System.out.print("0");
                    }
                }
            }
        }
        System.out.println(" ");
    }
}
