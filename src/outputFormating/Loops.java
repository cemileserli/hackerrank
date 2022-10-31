package hackerrank.src.outputFormating;

import java.util.*;
import java.io.*;

class Loops{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int j=0;j<n;j++){
                int multiplication = 0;

                for(int k=0;k<=j;k++) {
                    multiplication += (int) Math.pow(2, k) * b;

                    //System.out.print(multiplication);
                }
                multiplication += a;
                System.out.print(multiplication + " ");
            }

            System.out.println();
        }
        in.close();
    }


}



