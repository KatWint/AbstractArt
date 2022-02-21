package abstractart;

public class Test {

	public static void main(String[] args) {
		Painting monaLisa = new Painting("oil");
		Painting davinci = new Painting ("watercolor");
		Painting deangelo = new Painting ("acrylic");
		
		Sculpture liberty = new Sculpture("stone");
		Sculpture bell = new Sculpture ("cement");
		
		monaLisa.setAuthor("Leonardo da Vinci");
		davinci.setAuthor("Leonardo da Vinci");
		deangelo.setAuthor("Alfred D'Angelo");
		
		monaLisa.setTitle("Mona Lisa");
		davinci.setTitle("Lady with an Ermine");
		deangelo.setTitle("Mario Silva");
		
		liberty.setAuthor("Frederic Bartholdi");
		bell.setAuthor("Whitechapel Bell Factory");
		
		liberty.setTitle("Statue of Liberty");
		bell.setTitle("Liberty Bell");
		
		monaLisa.viewArt();
		davinci.viewArt();
		deangelo.viewArt();
		
		liberty.viewArt();
		bell.viewArt();

	}

}
