package abstractart;

import java.util.ArrayList;

public abstract class Art {
	
	String title;
	String author;
	String description;
	
	public Art() {
		// TODO Auto-generated constructor stub
	}
	
	abstract void viewArt() {
		
	}

	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	
	public void setAuthor(String author) {
		this.author=author;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
}