import java.util.ArrayList;

public class ArrayListCollection {

	public static void main(String[] args)
	{
		ArrayList<String> items = new ArrayList<String>();
		
		items.add("Red");
		items.add(0, "Yellow");
		
		System.out.print("Display list contents whit counter-controlled loop: ");
		
		for (int i = 0; i < items.size(); i++)
			System.out.printf(" %s,",items.get(i));
		
		System.out.println();
		
		items.add("Green");
		items.add("Yellow");
		display(items, "List with two new itens");
		
		items.remove("Yellow");
		display(items, "Remove the first instance of yellow");
		
		items.remove(1);
		display(items, "Remos the second list element");
		
		System.out.printf("\"Red\" is %sin the list%n",
				items.contains("Red") ? "" : "not ");
		
		System.out.printf("Size %d", items.size());
	}
	
	public static void display(ArrayList<String> items, String header)
	{
		System.out.print(header);
		
		for (String item : items)
			System.out.printf(" %s,", item);
		
		System.out.println();
	}
}
