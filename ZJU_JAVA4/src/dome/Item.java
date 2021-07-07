package dome;

public class Item {
	private String title;
	private int playingTime;
	private boolean gotit;
	private String coment;
	

	public Item(String title, int playingTime, boolean gotit, String coment) {
		super();
		this.title = title;
		this.playingTime = playingTime;
		this.gotit = gotit;
		this.coment = coment;
	}

	public void print(){
		System.out.print(this);
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "title=" + title + ", playingTime=" + playingTime + ", gotit=" + gotit + ", coment=" + coment
				;
	}

}
