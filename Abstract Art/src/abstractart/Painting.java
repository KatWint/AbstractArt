package abstractart;

public class Painting extends Art {

	private String paintType;
	
	
	public Painting(String paintType) {
		super();
		this.paintType=paintType;
	}
	
	public void viewArt() {
		System.out.println("Here we have " + this.author + " displaying " + this.title + ". They used " + this.paintType + " to make it.");
	}

}
