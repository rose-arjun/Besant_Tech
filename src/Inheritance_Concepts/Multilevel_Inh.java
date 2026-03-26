package Inheritance_Concepts;

class Grandfather {
    void property() {
        System.out.println("Grandfather property");
    }
}

class Father extends Grandfather {
    void house() {
        System.out.println("Father house");
    }
}

class Son extends Father {
    void bike() {
        System.out.println("Son bike");
    }
}
//son can access father and grandfather class properties
public class Multilevel_Inh {
    public static void main(String[] args) {
        Son s = new Son();

        s.property(); // from Grandfather
        s.house();    // from Father
        s.bike();     // own method
    }
}