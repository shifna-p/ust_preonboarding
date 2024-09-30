//Constructors Example

class PersonDetails {
    String name;
    int age;

    //default constructor(no parameters)

    public PersonDetails(){
        name = "Josh";
        age =45;
    }

    //parameterized constructor (with parameter)
    public PersonDetails (String personName, int personAge){
        name=personName;
        age= personAge;
    }
    //methods

    void display(){
        System.out.println("Name : "+ name + "\n Age : "+age);
        System.out.println("__________________");
    }
}

public class ConstructorExample{
    public static void main(String[] args){
        //calling default constructor
        PersonDetails p1 = new PersonDetails();
        PersonDetails p2 = new PersonDetails("Jake",20);
        p1.display();
        p2.display();
    }
}
