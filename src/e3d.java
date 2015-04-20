/*
 Luke Simpson
 */

public class e3d {

    public static void main(String[] args) {
        int nNum;
        double dSquare,dCubed;
        for (nNum = 1; nNum <= 10; nNum++) {
            dSquare= Math.pow(nNum,2);
            dCubed= Math.pow(nNum,3);
            System.out.println(nNum+" Squared is " + dSquare + " Cubed is " + dCubed );
        }
    }
}
