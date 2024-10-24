import java.util.HashSet;
import java.util.Set;

public class SetDemo2 
{
	public static void main(String[] args)
	{		
		Set<String> set = new HashSet<String>();
		set.add("RBG");
		set.add("selenium");
		set.add("Java");

		int setDataCount = set.size();
		System.out.println("setDataCount  :"+setDataCount);

		set.add("RBG");
		set.add("selenium");
		set.add("Java");
		set.add("Api Testing");

		setDataCount = set.size();
		System.out.println("setDataCount  :"+setDataCount);

//		its not allow the duplicate that's why not update the count

	}

}
