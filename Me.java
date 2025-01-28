public class Me {//we are making attributes in the class Me
    String name;
    String college;
    int age;
    String city;

    void display(){
        //methods in java should be defined in the class but outside the main method
        System.out.println("name : " +name );
        System.out.println("college : "+college);
        System.out.println("age : "+age);
        System.out.println("city : "+city);


    }



public static void main(String[] args) {
    //now we will make objects in the main
    Me student1 = new Me();
    student1.name = "Lakshita";
    student1.college = "UPES";
    student1.age = 19;
    student1.city = "Morena";

    System.out.println("Student 1 details are : ");
    student1.display();


}


}

