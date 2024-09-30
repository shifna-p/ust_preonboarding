//Implementing Simple example for inheritance in java

//base class
public class Inheritance{
    int age;
    int height;
    int weight;
    String name;

    public Inheritance(int myAge, int myHeight, int myWeight){ //constructor
        this.age= myAge;
        this.height= myHeight;
        this.weight=myWeight;
    }

    public Inheritance(){  //constructor
        this(20,168,70);
    }

    public void walk(int speed){
        if(speed >20){
            System.out.println("walking");
        }
    }
    public void sleep(){
        System.out.println("sleeping");
    }
    public void talk(){
        System.out.println("talking");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public int getHeight(){
        return height;
    }

    public int getWeight(){
        return weight;
    }
}

//derived class
class Student extends Inheritance {
    public static void main(String[] args){
        Student student = new Student();
        student.setName("Jake");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        student.walk(80);
        student.sleep();
        student.talk();;
        System.out.println(student.getHeight());
        System.out.println(student.getWeight());


    }
}