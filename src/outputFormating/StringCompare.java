package hackerrank.src.outputFormating;
import java.util.Scanner;

public class StringCompare {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        String temp = "";
        //String text[] = {};
        for(int i = 1; i <= s.length()-k; i++){
            temp = s.substring(i, k+i);
            if(temp.compareTo(largest)>=0){
                largest = temp;

            }else if (temp.compareTo(smallest)<=0){
                smallest = temp;
            }

        }

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        StringCompare n = new StringCompare();
        System.out.println(n.getSmallestAndLargest(s, k));
    }
}