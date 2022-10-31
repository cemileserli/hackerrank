package hackerrank.src.outputFormating;


        import java.util.regex.Matcher;
        import java.util.regex.Pattern;
        import java.util.Scanner;

class IpCompare{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex{
    //public static String numberUpTo255="([0-1][0-9][0-9]|2[0-4][0-9]|25[0-5])";
    //public static String numberUpTo255="( 25[0-5] | 2[0-4][0-9] | [01]?[0-9][0-9]? )";
    public static String numberUpTo2553 = "([/d]{1,2}|0[/d][/d]|1[/d][/d]|2[0-4][/d]|25[0-5])";
    public static String numberUpTo255 = "([\\d]{1,2}|0[\\d][\\d]|1[\\d][\\d]|2[0-4][\\d]|25[0-5])";
    //public static String pattern = numberUpTo255 + "/." + numberUpTo255 + "/." + numberUpTo255 + "/." + numberUpTo255;
    public static String pattern = numberUpTo255;
}
//Write your code here
