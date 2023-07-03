
public class car {
String brand;
String color;
double price;

public car(String brand, String color,double price) {
	this.brand=brand;
	this.color=color;
	this.price=price;
}
public static void main(String[] args) {
	car c=new car("maruti","red",25000d);
	c.toString();	
	System.out.println(c);
	car d=new car("hundai","white",620255d);
	d.toString();
	System.out.println(d);
	System.out.println(c.equals(d));
}
public String toString() {
	return brand+" "+color;
}

public boolean equals(car obj) {
	if(this.price==obj.price)
		return true;
	else
		return false;
}
}
