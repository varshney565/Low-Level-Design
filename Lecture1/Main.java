

public class Main{
    public static void main(String []args){
        System.out.println("Hello");
        Human Shivam = new Human();
        Shivam.sleep();
    }
}

class Human{
    //properties
    int age;
    int weight;
    String name;

    //constructor
    /**
    2 types
     */

    //No argument
    public Human(){
        System.out.println("Inside the Constructor - Creating Object");
    }
    //parameterized constructor
    public Human(int age,int weight,String name){
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    //behaviour
    void sleep(){
        System.out.println("Sleeping...");
    }

    void eat(){
        System.out.println("Eating");
    }
}