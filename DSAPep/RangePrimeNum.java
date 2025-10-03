package DSAPep;

import java.util.Scanner;

public class RangePrimeNum {

    
public static boolean checkPrime(int n){
    int count = 0;
     for(int j = 2; j * j <= n;j++){
                if(n % j == 0){
                    count++;
                    break;
                }
        }
            if(count == 0){
                return true;
            }
            else{
                return false;
            }
}

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first range number: ");
        int n = sc.nextInt();

        System.out.print("Enter second range number: ");
        int n2 = sc.nextInt();
        
        for(int i = n;i <= n2;i++){
            if(checkPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
}
