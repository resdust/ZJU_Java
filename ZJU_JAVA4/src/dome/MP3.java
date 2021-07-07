package dome;

public class MP3 extends Item{
	private int numOfTracks;
	private String artist;
	private String album;

	public MP3(String title, int playingTime, boolean gotit, String coment,
			String artist, String album, int number) {
		super(title, playingTime, gotit, coment);
		this.numOfTracks = number;
		this.artist = artist;
		this.album = album;
	}

	@Override
	public void print() {
		System.out.print("MP3:");
		super.print();
		System.out.print(", artist:"+artist);
		System.out.print(", album:"+album);
	}
	
	
	
}
