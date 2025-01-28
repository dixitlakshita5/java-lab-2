import java.util.Scanner;

class Answer{
   float triangle(int l, int b){
        return 0.5f * l * b;
    }

    int square(int s){
        return s*s;
    }

    float circle(int r){
        return 3.14f * r * r;
    }

    int rectangle(int l, int b){
       return l*b;
    }


}

public class Area {
    public static void main(String[] args) {
        Scanner M = new Scanner(System.in); //scanner is a class and M is an object, An object is created when new Scanner(System.in) is executed, and this object is stored in the memory heap
        //Without the reference variable M, the object would exist in memory but you wouldn't be able to use it
        Answer a1 =  new Answer();
        System.out.println("enter length and breadth of rectangle");
        int l =  M.nextInt();
        int b =  M.nextInt();
        int rectangleArea = a1.rectangle(l, b);
        System.out.println("area of rectangle is : "+ rectangleArea);

        System.out.println("enter length and breadth of triangle : ");
        int len =  M.nextInt();
        int bre =  M.nextInt();
        float triangle = a1.triangle(len,bre);
        System.out.println("area of triangle is : "+ triangle);

        System.out.println("enter side of square : ");
        int s =  M.nextInt();
        int sq = a1.square(s); //sq is a variable and a1 is object and square is a method that we created
        System.out.println("area of square is : "+ sq);

        System.out.println("enter radius of circle : ");
        int r =  M.nextInt();
        float rad = a1.circle(r); //sq is a variable and a1 is object and square is a method that we created
        System.out.println("area of square is : "+ rad);





    }
}

