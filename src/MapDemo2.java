import java.util.Hashtable;
import java.util.Map;

public class MapDemo2 
{
	public static void main(String[] args) 
	{
		Map<String, String> map = new Hashtable<String,String>();
		map.put("Java", "Selenium");
		map.put("API Testing", "POST man");
		map.put("DB Testing", "My Sql");
		int mapSize = map.size();
		System.out.println("mapSize :"+ mapSize);
		
		map.put("Java", "Selenium");
		map.put("API Testing", "Rest assured"); // it won't allowed the duplicates
		map.put("DB Testing", "My Sql");
		mapSize = map.size();
		System.out.println("mapSize :"+ mapSize);
				

	}
}
