import java.util.Scanner;

public class Takeinp{

    public static void main(){
        
        Scanner scn = new Scanner(System.in);

        // int n = Integer.parseInt(scn.nextLine());
         
        int n = scn.nextInt();
        String str = scn.nextLine();

        System.out.println("Hii my name is " + str);

        for(int i = 0;i < n ; i++){
            System.out.println(i);
        }
        

    }

}