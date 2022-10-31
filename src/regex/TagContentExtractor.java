package hackerrank.src.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        String regex = "<(.+>)([^<]+)(<\\/\\1)";
        Pattern p = Pattern.compile(regex);

        while (testCases > 0){
            String line = sc.nextLine();
            Matcher m = p.matcher(line);

            if(!m.find()){
                System.out.println("None");
            }
            else{
                do{
                    System.out.println(m.group(2));
                }
                while (m.find());

            }

            testCases--;
        }
        sc.close();
    }







}
