/*
 Luke Simpson
 */
import java.util.*;
public class e3l {
    
    public static void main(String[] args) {
       int nS, nG;
       Scanner sin = new Scanner(System.in);
        System.out.println("Guess a Number.");
        nG = sin.nextInt();
        nS=15;
        
        while (nS>nG)
        {System.out.println("A little higher, Guess Again.");
        nG = sin.nextInt();}
        
        while (nS<nG)
        {System.out.println("A little lower, Guess Again.");
        nG = sin.nextInt();}
        
       
        System.out.println("Congradulations you got it!!!");
        
        
        
    }
}
