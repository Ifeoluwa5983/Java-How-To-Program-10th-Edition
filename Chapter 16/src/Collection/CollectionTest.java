package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] colors= {"RED","WHITE","BLUE","CYAN"};
		List<String> list = new ArrayList<String>();
		
		for (String color : colors) {
			list.add(color);	
			}
		String[] removeColors = {"RED","WHITE","BLUE"};
		List<String> removeList = new ArrayList<String>();
		
		for (String color : removeColors) {
			removeList.add(color);	
			}
		System.out.println("Arraylist: ");
		
		for(int i = 0;i <list.size();i ++) {
			System.out.printf("%s ",list.get(i));
		}
		removeColors(list, removeList);
		System.out.printf("%n%nArraylist after calling colors%n");
		for(String color : list) {
			System.out.printf("%s ", color);
		}
	}

	private static void removeColors(List<String> list, List<String> removeList) {
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			if(removeList.contains(iterator.next())) {
				iterator.remove();
			}
		}
	}

}
