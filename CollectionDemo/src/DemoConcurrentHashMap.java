import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class DemoConcurrentHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> map = new ConcurrentHashMap<>();
		map.put("A", "India");
		map.put("G","Germany");
		map.put("I","Italy");
		map.put("Z","Zimbabwe");
		
		Set<Entry<String, String>> entries = map.entrySet();
		Iterator<Entry<String,String>> iterator = entries.iterator();
		while(iterator.hasNext())
		{
			Map.Entry<String, String> entry = (Map.Entry<String, String>) iterator.next();
			if(entry.getKey().equals("A"))
				map.put("X", "New country");
		}
		
		Iterator<Entry<String,String>> iterator1 = entries.iterator();
		while(iterator1.hasNext())
		{
			Entry<String, String> entry = iterator1.next();
			System.out.println(entry.getKey() + " " + entry.getValue());	
		}

	}

}
