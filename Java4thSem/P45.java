class Student{
    String name;
    int age;
    public void info(){
        System.out.println("name : " + name);
        System.out.println("age : " + age);
    }
}

public class P45 {
    public static void main(String [] args){
        Student s1 = new Student();
        s1.name = "John";
        s1.age = 29;
        s1.info();
    }
}
