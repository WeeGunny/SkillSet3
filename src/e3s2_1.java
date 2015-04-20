/*
 Luke Simpson
 */

import java.util.*;
import java.text.*;

public class e3s2_1 {

    public static void main(String[] args) {
        double dSave, dIRY, dIRM, dEnd;
        int nMonth, nYear;
        Scanner sin = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        System.out.println("Enter Your Savings amount.");
        dSave = sin.nextInt();
        System.out.println("Enter Your Yearly intrest rate.");
        dIRY = sin.nextInt();
//        System.out.println("Enter number of years you will be saving");
//        nYear = sin.nextInt();
        dIRM = (dSave * (dIRY / 100)) / 12;
        dEnd = dSave + dIRM;


        System.out.println("Month \t Beginning Balence \t Interest \t Ending Balence");

        for (nMonth = 1; nMonth <= 12; nMonth++) {
            System.out.println(nMonth + "\t" + nf.format(dSave) + "\t" + nf.format(dIRM) + "\t" + nf.format(dEnd) + "\t");
            dSave += dIRM;
            dIRM = (dSave * (dIRY / 100)) / 12;
            dEnd = dSave + dIRM;
        }

    }
}
