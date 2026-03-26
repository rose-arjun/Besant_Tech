package opps_concepts;

class Student {
    static String college = "Annamalai Univercity"; // static variable
    int id;                                // non-static variable
    String name;                           // non-static variable

    void display() {
        System.out.println(id + " " + name + " " + college);
    }
}
