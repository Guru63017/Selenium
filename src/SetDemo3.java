import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo3 
{
	public static void main(String[] args)
	{		
		Set<String> set = new HashSet<String>();
		set.add("RBG");
		set.add("Selenium");
		set.add("Java");

		Iterator<String> setList = set.iterator();
		String data1 = setList.next();
		System.out.println(data1);
		String data2 = setList.next();
		System.out.println(data2);
		String data3 = setList.next();
		System.out.println(data3);
		String data4 = setList.next();
		System.out.println(data4);
	}

}
