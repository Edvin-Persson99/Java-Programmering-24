public class Student {

    String name;
    int age;
    double grade;


    Student(String name, int age, double grade){
        this.name = name;
        this.age = age;
        this.grade  = grade;
    }

    public static void main(String[] args) {
        Student student = new Student("Edvin", 25, 20.0);
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.grade);
    }
    
    

}
