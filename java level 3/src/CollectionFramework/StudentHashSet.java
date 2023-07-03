package CollectionFramework;
import java.util.TreeSet;
import java.util.Iterator;
public class StudentHashSet implements Comparable<StudentHashSet>{
String name;
int id;

StudentHashSet(String name,int id){
	this.name=name;
	this.id=id;
}

public String toString() {
	return name+" "+id;
}
public static void main(String[] args) {
	TreeSet<StudentHashSet> st=new TreeSet<StudentHashSet>();
	st.add(new StudentHashSet("Thejas",100));
	st.add(new StudentHashSet("Bharath",101));
	st.add(new StudentHashSet("Sunil",102));
	
	System.out.println("Print using Iterator");
	Iterator<StudentHashSet>it=st.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	System.out.println("Sorting using for each loop Descending order");
	
		System.out.println(st.descendingSet());
	
	
}

public  int compareTo(StudentHashSet ob) {
	if(this.name.compareTo(ob.name)==0)
		return 0;
	else if(this.name.compareTo(ob.name)>0)
		return 1;
	else 
		return -1;
	
}
}
