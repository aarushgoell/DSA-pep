package DSAPep;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t;i++){
            int n = sc.nextInt();

            int count = 0;

            // we have taken here j*j because any of number in number factor will always be less then root n both number cant be greater then root n and we are using break in middle because if any number divides n then there is no need to go after that 
            for(int j = 2; j * j <= n;j++){
                if(n % j == 0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not prime");
            }
        }

    }
}
