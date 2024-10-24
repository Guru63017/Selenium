import java.util.Hashtable;
import java.util.Map;

public class MapDemo1 
{
	public static void main(String[] args)
	{

//		Hashtable map = new Hashtable();

		Map map = new Hashtable();
		map.put("phone", 96666);
		map.put(8008, true);
		map.put("Name", true);

		Map<String, Integer>  map2 = new Hashtable<String,Integer>();
		map2.put("phone", 9666);
		Map<Integer, Boolean> map3 = new Hashtable<Integer,Boolean>();
		map3.put(8008, true);
		Map<String, Boolean> map4 = new Hashtable<String,Boolean>();
		map4.put("Name", true);
	}
}
