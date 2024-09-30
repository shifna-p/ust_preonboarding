//Introducing Classes and objects

public class Person {
    //properties
    int age;
    int height;
    String Name;

    //methods
    public void walk(int speed) {
        //do walking operations
        if (speed > 10) {
            System.out.println("walking...");
        }else{
            System.out.println("Not walking...");
        }
    }
    public void sleep(){
        System.out.println("sleeping...");
    }
    public void talk(){
        System.out.println("Talking...");
    }

    public static void main(String[] args){
        Person p = new Person();
        p.walk(10);
        p.sleep();
        p.talk();
        p.walk(25);
    }
}

