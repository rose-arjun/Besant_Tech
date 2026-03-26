package Encapsulation;

class Student {
    private int id;        // data hidden
    private String name;   // data hidden

    // Setter methods (to set values)
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter methods (to get values)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

