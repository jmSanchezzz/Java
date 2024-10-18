package separatingUserInterfaceFromProgramLogic;
import java.util.*;
public class ToDoList {
	private ArrayList<String> list;

	public ToDoList() {
		list = new ArrayList<>();
		
	}
	public void add(String task) {
		list.add(task);
		
	}
	public void print() {
		for(String todo : list) {
			System.out.println(list.indexOf(todo)+1 +": "+todo);
		}
	}
	public void remove(int index) {
		list.remove(index-1);
	}
}
