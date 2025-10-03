package DSAPep;

import java.util.Scanner;

public class DigitsOfNumber {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        // First approach
        //    String str = Integer.toString(n);
        //    int len = str.length();
   
        //    for(int i = 0;i<len;i++){
        //        int digit = str.charAt(i) -'0';
        //        System.out.println(digit);
        //    }        

        // Second appraoch

        int count = 0;

        int dup = n;

        while(dup != 0){
            dup /= 10;
            count++;
        }

        int div = (int) Math.pow(10, count-1);

        while(div != 0){
            int digit = n/div;
            System.out.println(digit);
            n = n%div;
            div/=10;
        }


    }




}
