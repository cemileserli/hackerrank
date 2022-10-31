package hackerrank.src.outputFormating;

import java.util.Scanner;

public class Solution {

    static String sValue;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");


        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            int maxStringLength = 15;
            maxStringLength -= s1.length();
            sValue = s1;

            for (int j = 0; j < maxStringLength; j++) {
                sValue += " ";
            }
            if (x < 10) {
                sValue += "00" + String.valueOf(x);
                System.out.println(sValue);
            }

            else if (x >= 10 && x < 100) {
                sValue += "0" + String.valueOf(x);
                System.out.println(sValue);
            } else {
                sValue += "" + String.valueOf(x);
                System.out.println(sValue);
            }

            //System.out.println(sValue);

        }
        System.out.println("================================");

    }

}



