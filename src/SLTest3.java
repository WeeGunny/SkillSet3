//Luke Simpson

public class SLTest3 {

    public static void main(String[] args) {
        double dPI, dDenom, dCount;
        dDenom = 0;
        dCount = 1;
        dPI=0;    
        for (dDenom = 3; dDenom <= 21; dDenom++) {
//            dCount++;
//            if (dCount % 2 < 0) {
//                dPI = 4 * (1 + 1 / dDenom);
                if (dDenom % 2 == 0) {
                } else {
                    dPI = 4 * (1 + 1 / dDenom);
                }
//            } else {
//                if (dCount % 2 == 0) {
                    if (dDenom % 2 == 0) {
                    } else {
                        dPI = dPI - 1 / dDenom;
                    }
                }
              System.out.println("PI equals " + dPI);
 //I Had not idea what to do sorry I tried using if to alternate
            }
}
