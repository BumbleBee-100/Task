public class Dog{
    String name,breed;
    int age;
    Dog(String name,String breed,int age){
        this.name=name;
        this.breed=breed;
        this.age=age;
    }
    void bark(){
        System.out.println(name+": Woof!");
    }
    void spin(){
        System.out.println(name+" is spinning!");
    }
    void run(){
        System.out.println(name+" is running!");
    }
    public static void main(String[] args){
        Dog dog=new Dog("Rex","Labrador",3);
        dog.bark();
        dog.spin();
        dog.run();
    }
}