package dome;

public class CD extends Item{
	private String artist;
	private int numOfTracks;

	public CD(String title, int playingTime, boolean gotit, String coment, 
			String artist, int number) {
		super(title, playingTime, gotit, coment);
		this.artist = artist;
		this.numOfTracks = number;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "artist=" + artist + ", numOfTracks=" + numOfTracks;
	}

	@Override
	public boolean equals(Object obj) {
		CD cc = (CD) obj;
		return artist.equals(cc.artist);
	}

	public void print() {
		System.out.print("CD:");
		super.print();
		System.out.print(" ," + this);
	}

}
