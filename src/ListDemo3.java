import java.util.ArrayList;
import java.util.List;

public class ListDemo3 
{
	public static void main(String[] args) 
	{		
		List<String> list = new ArrayList<String>();
		list.add("RBG");
		list.add("Selenium");
		list.add("java");

		int dataCount = list.size();
		System.out.println("dataCount  :" +dataCount);
		list.add("RBG");
		list.add("Selenium");
		list.add("java");
		list.add("Api Testing");

		dataCount = list.size();
		System.out.println("dataCount  :" +dataCount);

	}

}
