package SchoolMgtSystem;

//This class represent every human which is abstract
public abstract class Person {
    private String name;
    private int age;
    private int id;

    //Constructors
    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    //Getters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }
}
