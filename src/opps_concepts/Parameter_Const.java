package opps_concepts;

public class Parameter_Const {
	    int id;
	    String name;

	    // Parameterized constructor
	    Parameter_Const(int i, String n) {
	        id = i;
	        name = n;
	    }

	    void display() {
	        System.out.println(id + " " + name);
	    }
	   // Creating Object Using Parameterized Constructor
	    public static void main(String[] args) {
	    	Parameter_Const s1 = new Parameter_Const(101, "Arjun");
	        s1.display();
	    }
}
