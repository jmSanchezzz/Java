package objectContainingOtherObject2;

import java.util.ArrayList;

public class BirdList {
	ArrayList<Bird> birdList;
	
	public BirdList() {
		birdList = new ArrayList<>();
	}
	public void add(Bird bird) {
		birdList.add(bird);
	}
	public void print() {
		for(Bird bird : birdList) {
			System.out.println(bird);
		}
	}
	public void printOne(String name) {
		boolean checker = false;
		for(Bird bird : birdList) {
			if(bird.getName().equalsIgnoreCase(name)) {
				System.out.println(bird);
				checker = true;
			}
			if(checker == false) {
				System.out.println("Not a Bird!");
			}
		}
	}
	public void observation(String name) {
		for(Bird bird : birdList) {
			if(bird.getName().equalsIgnoreCase(name)) {
				bird.obsearvations();
			}
	}
	

}
}
