package objectContainingOtherObject2;

public class Bird {
	private String name;
	private int observations;
	private String latinName;
	public Bird(String name, String latinName) {
		this.name=name;
		this.latinName = latinName;
		observations = 0;
	}
	public void obsearvations() {
		observations++;
	}
	public int getObservations() {
		return observations;
	}
	public String getName() {
		return name;
	}
	public String getLatinName() {
		return latinName;
	}
	@Override
	public String toString() {
		return name +"("+latinName+ ")"+observations+ " observations";
	}
	

}
