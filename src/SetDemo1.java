import java.util.HashSet;
import java.util.Set;

public class SetDemo1 
{
	public static void main(String[] args)
	{
//		HashSet set = new HashSet();
		
		Set set = new HashSet();
		set.add("RBG");
		set.add(10);
		set.add(true);
		
		Set<String> set1 = new HashSet<String>();
		set1.add("RBG");
		
		Set<Boolean> set2 = new HashSet<Boolean>();
		set2.add(true);
		
		Set<Integer> set3 = new HashSet<Integer>();
		set3.add(10);

	}

}
