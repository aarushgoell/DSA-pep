public class PrntZ {
    public static void main(String[] args) {
        
        int n = 0;
        for(int j = 0;j < 13;j++){
            if (n % 3 == 0)
            for(int i = 0;i<5;i++){
                if((j == 0 || j == 12) || (5 - n/3 - 1 == i)){
                    System.out.print("*");
                }
                else{
                     System.out.print(" ");
                }
            }
            System.out.println();
            n++;
        }

        int l = 3;
        int m = 3;
        int sum = l + m;

        System.out.println("The sum of " + l + " + "+ m + " is "+ sum);
    }
}
