package opps_concepts;

public class Car {
	String name="BMW";
	int model=2002;
	double price=2500000;
	
	Car(){
		System.out.println("Default Constructor Called......");
		System.out.println("BMW Car Details"+ name+"\n"+model+"\n"+price);
	}
	Car(String name,int model,double price){
		this.name=name;
		this.model=model;
		this.price=price;
	}
	void car_info() {
		System.out.println("Car Name:"+name+"\n"+"Model year:"+"\n"+"Car Price:"+price);
	}

}
