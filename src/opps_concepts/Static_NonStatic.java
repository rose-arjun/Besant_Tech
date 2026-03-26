package opps_concepts;

public class Static_NonStatic {
	 public static void main(String[] args) {
	        Student s1 = new Student();
	        s1.id = 1;
	        s1.name = "Arjun";

	        Student s2 = new Student();
	        s2.id = 2;
	        s2.name = "Kumar";

	        s1.display();
	        s2.display();
	    }

}
