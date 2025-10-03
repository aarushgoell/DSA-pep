package DSAPep;

import java.util.Scanner;

public class Inverse {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();


        // First approach

        // int count = 0;

        // int dup = n;

        // while(dup != 0){
        //     count++;
        //     dup /= 10;
        // }

        // int [] arr = new int[count];

        // dup = n;

        // int i = 1;
        // while(dup != 0){
        //     int digit = dup % 10;
        //     arr[count - digit] = i;
        //     i++;
        //     dup /= 10; 
        // }

        // int num = 0;
        // for(int j = 0;j < count;j ++){
        //     num = num * 10 + arr[j];
        // }

        // System.out.println(num);

        // Second approach

        int dup = n;

        int ans = 0;

        int i = 1;
        while(dup != 0){
            int count = dup % 10 - 1;
            int zeros = (int)Math.pow(10,count);
            ans += (zeros * i);
            dup /= 10; 
            i++;
        } 
        
        System.out.println(ans);




    }

}
