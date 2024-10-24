import java.util.ArrayList;
import java.util.List;

public class ListDemo4 
{
	public static void main(String[] args) 
	{		
		List list = new ArrayList();
		list.add(20);
//		list.add("RBG");
//		list.add(true);
		Object o1 = list.get(1);
		System.out.println(o1);
		
		List<String> list1 = new ArrayList<String>();
		list1.add("RBG");
		String data = list1.get(0);
		System.out.println(data);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		Integer data1 = list2.get(0);
		System.out.println(data1);
		
		List<Boolean> list3 = new ArrayList<Boolean>();
		list3.add(true);
		Boolean data2 = list3.get(0);
		System.out.println(data2);
	}

}
