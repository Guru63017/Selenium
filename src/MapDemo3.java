import java.util.Hashtable;
import java.util.Map;

public class MapDemo3 
{
	public static void main(String[] args) 
	{
		Map<String, String> map = new Hashtable<String,String>();
		map.put("API Testing", "POST man");
		String value = map.get("API Testing");
		System.out.println("value :" + value);

		map.put("API Testing", "Rest assured");
		String value2 = map.get("API Testing");		
		System.out.println("value2 :" + value2);			

	}
}
