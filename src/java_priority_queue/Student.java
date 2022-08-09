package java_priority_queue;

public class Student {

    private int id;

    private String name;

    private double cgpa;

    public Student(){}

    public Student(int id, String name, double cgpa){

        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public String toString(){

        return this.getName() + " : " + this.getId() + " : " + this.getCgpa();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

}
