package CollectionFramework;
import java.util.*;

public class BeerObject implements Comparable<BeerObject> {
String name;
int price;


public BeerObject(String name,int price) {
	this.name=name;
	this.price=price;
}

@Override
public String toString() {
	return "BeerObject [name=" + name + ", price=" + price + "]";
}
public static void main(String[] args) {
ArrayList<BeerObject> ob=new ArrayList<BeerObject>();
ob.add(new BeerObject("Kingfisher",160));
ob.add(new BeerObject("Budwiser",200));
ob.add(new BeerObject("Tuborg",180));
ob.add(new BeerObject("UB",120));

System.out.println("Printing before sorting ");
for(BeerObject i:ob)
{
	System.out.println(i);
}
Collections.sort(ob);
System.out.println("\nPrinting After sorting ");
for(BeerObject i:ob)
{
	System.out.println(i);
}

System.out.println("\nPrinting using for loop");
for(int i=0;i<ob.size();i++) {
	System.out.println(ob.get(i));
}
try	{	
	Iterator<Integer> i=ob.iterator(2);	
	}
catch(Exception e)	{
	System.out.println(e);
}
ListIterator<BeerObject> a=ob.listIterator(2);
System.out.println("\nPrinting In forward direction");
while(a.hasNext()) {
	System.out.println(a.next());
}

System.out.println("\nPrinting In Backward direction");
while(a.hasPrevious()) {
	System.out.println(a.previous());
}


}

public int compareTo(BeerObject ob){
	if(this.name.compareTo(ob.name)==0)
		return 0;
	else if(this.name.compareTo(ob.name)>0)
		return 1;
	else 
		return -1;

}





}
