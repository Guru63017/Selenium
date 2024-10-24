import java.util.ArrayList;
import java.util.List;

public class ListDemo2 
{
	public static void main(String[] args) 
	{		
		List<String> list1 = new ArrayList<String>();
		list1.add("RBG Technology");
//		list1.add(10);
//		list1.add(true);
		
		List<Boolean> list2 = new ArrayList<Boolean>(); // it won't accept primitive data type because these are generics
		list2.add(true);
//		list2.add(10);
		
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(10);
//		list3.add(true);
//		list3.add("rbg");
			
	}

}
