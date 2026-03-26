package Encapsulation;

public class Encapsulation_Con {
    public static void main(String[] args) {
        Student s = new Student();

        s.setId(101);
        s.setName("Arjun");

        System.out.println(s.getId());
        System.out.println(s.getName());
    }


}
