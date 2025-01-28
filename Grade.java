import java.util.Scanner;
public class Grade {
    public static void main(String[] args){
        Scanner M = new Scanner(System.in);
        System.out.println("enter your marks for OOPS :  ");
        int s1 = M.nextInt();
        System.out.println("enter your marks for cloud computing fundamentals :  ");
        int s2 = M.nextInt();
        System.out.println("enter your marks for maths :  ");
        int s3 = M.nextInt();

        int a = (s1 + s2 +s3)/3;




        if(a>=90 && a<=100){
            System.out.println("A grade");
        }
        else if(a>=75 && a<90){
            System.out.println("B grade");
        }
        else if(a>=50 && a<75){
            System.out.println("average");
        }
        else{
            System.out.println("Grade F");
        }

    }
}
