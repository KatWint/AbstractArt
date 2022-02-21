package abstractart;

public class Sculpture extends Art {

	private String material;
	
	public Sculpture(String material) {
		super();
		this.material=material;
	}
	
	public void viewArt() {
		System.out.println("Here we have " + this.author + " displaying " + this.title + ". They used " + this.material + " to make it.");
	}

}
