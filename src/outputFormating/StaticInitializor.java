package hackerrank.src.outputFormating;

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class StaticInitializor {

//Write your code here

    static boolean flag;
    static int B;
    static int H;
    static
    {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        if(B <= 0 || H <= 0){
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }else{
            System.out.print(B*H);
        }

        //If  or  , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.

    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class

