package TheObjectClass;

public class Main extends Object {
    public static void main(String[] args) {
        Student max = new Student("Max",25);
        System.out.println(max);

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 8, "Carol");
        System.out.println(jimmy);
    }
}

class Student{
    private  String name;
    private int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name +" is "+ age;
    }
}

class PrimarySchoolStudent extends Student {
    private String parentName;
     PrimarySchoolStudent(String name, int age,String parentName){
         super(name,age);
         this.parentName = parentName;
     }

    @Override
    public String toString() {
        return parentName +"'son "+ super.toString();
    }
}


