import java.util.Scanner;
public class Pattern {
    public static void main(String[] args){
        Scanner M = new Scanner(System.in);
        System.out.println("Number : ");
        int n  = M.nextInt();

        int i =n;
        while(i<=n && i>0){
            int j = 1;
                    while(j<=n && j>0){
                        System.out.print(j);
                        j++;

                    }
                    System.out.println();

                    i--;
                    n--;

        }

    }
}
