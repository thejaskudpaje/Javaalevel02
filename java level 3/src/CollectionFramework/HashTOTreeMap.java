package CollectionFramework;
/*create a Ashmap key=String,value=Object convert it into Tree map and print*/
import java.util.HashMap;
import java.util.TreeMap;
public class HashTOTreeMap {
public static void main(String[] args) {
	HashMap<String, Object> hm=new HashMap<String, Object>();
	hm.put("Name", "thejas");
	hm.put("Age", 26);
	hm.put("Pnone", 8748869540l);
	
	System.out.println(hm);
	
	TreeMap<String, Object> tm=new TreeMap<String, Object>(hm);
	for(Object i: tm.keySet()) {
		System.out.println(i+" "+tm.get(i));
	}
}
}
