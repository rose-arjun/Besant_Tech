package Inheritance_Concepts;

	interface A {
	    void showA();
	}

	class B {
	    void showB() {
	        System.out.println("Class B");
	    }
	}

	class C extends B implements A {
	    public void showA() {
	        System.out.println("Interface A");
	    }

	    void showC() {
	        System.out.println("Class C");
	    }
	}

	public class Hybrid_Concept {
	    public static void main(String[] args) {
	        C obj = new C();
	        obj.showA();
	        obj.showB();
	        obj.showC();
	    }
	}

