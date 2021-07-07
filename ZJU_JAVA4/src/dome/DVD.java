package dome;

public class DVD extends Item{
//	private String title;
	private String director;

	public DVD(String title, int playingTime, boolean gotit, String coment,
			String director) {
		super(title, playingTime, gotit, coment);
		this.director = director;
	}
	
	public void print() {
		System.out.print("DVD:");
		super.print();
		System.out.print("director:" + director);
	}

}
